package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decimals {
	
	public static boolean[]arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		arr= new boolean[N+1];
		get_prime();
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=M;i<=N;i++) {			  	 //주어진 범위에서 소수 누적값과 최솟값 구하기
			if(arr[i]==false) { 			 //소수를 찾는다
				sum+=i;
				if(min==Integer.MAX_VALUE) { //첫 소수를 min에 집어넣기
					min=i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
	public static void get_prime() {
		arr[0]=true;
		arr[1]=true;
		
		for(int i =2; i<=Math.sqrt(arr.length);i++) {
			if(arr[i]) continue;	//이미 체크된(true) 배열
			
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=true;		//소수가 아닌것을 true로
			}
			
		}
		
	}

}
