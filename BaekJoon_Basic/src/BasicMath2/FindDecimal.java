package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindDecimal {
	public static boolean[]arr;
	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		
		arr= new boolean[N+1];
		get_prime();
		StringBuilder sb = new StringBuilder(); //저장공간
		for(int i=M; i<=N;i++) {
			if(!arr[i])sb.append(i).append('\n');
		}
		System.out.println(sb);

	}
	public static void get_prime() {
		arr[0] = arr[1] =true;
		
		for(int i=2;i<=Math.sqrt(arr.length);i++) {
			if(arr[i]) continue;
			for(int j=i*i;j<arr.length;j+=i) { //배수를 거른다
				arr[j]=true;
			}
		}
	}

}















