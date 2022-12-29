package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(); //저장공간
		int N=Integer.parseInt(br.readLine());
		
		for(int i=2; i<=Math.sqrt(N);i++) {
			
			while(N%i==0) {	//소인수분해를 하는 과정
				sb.append(i).append('\n'); //append로 sb에 저장해준다
				N/=i;
			}
		}
		if(N!=1) {
			sb.append(N);
		}
		System.out.println(sb);

	}
	
}
