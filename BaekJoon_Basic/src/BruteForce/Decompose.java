package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decompose {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str_length = br.readLine();
		
		int num_length = str_length.length();
		int num=Integer.parseInt(str_length);
		int result=0;
		
		for(int i=(num-(num_length*9)); i<num;i++) {
			int n =i;
			int sum=0;
			
			while(n!=0) {
				sum+=n%10;
				n/=10;
			}
			if(sum+i==num) {
				result=i;
				break;
			}
		}
		System.out.println(result);
	}

}
