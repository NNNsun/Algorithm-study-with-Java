package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostBertrand {
	public static boolean arr[] = new boolean[246913];

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		get_prime();
		
		while(true) {
			int n=Integer.parseInt(br.readLine());
			
			if(n==0) break;
			
			int count=0;
			
			for(int i=n+1;i<=n*2;i++) {
				if(!arr[i]) count++;
			}
			System.out.println(count);
		}
	}
	
	//에라토스테네스의 체와 제곱근 이용
	public static void get_prime() {
		arr[0] = arr[1] = true;
		for (int i = 2; i < Math.sqrt(arr.length); i++) {
			for (int j = i * i; j <= arr.length; j += i)
				arr[j] = true;
		}

	}
}
