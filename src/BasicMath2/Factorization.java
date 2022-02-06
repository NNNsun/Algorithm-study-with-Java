package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder(); //�������
		int N=Integer.parseInt(br.readLine());
		
		for(int i=2; i<=Math.sqrt(N);i++) {
			
			while(N%i==0) {	//���μ����ظ� �ϴ� ����
				sb.append(i).append('\n'); //append�� sb�� �������ش�
				N/=i;
			}
		}
		if(N!=1) {
			sb.append(N);
		}
		System.out.println(sb);

	}

}
