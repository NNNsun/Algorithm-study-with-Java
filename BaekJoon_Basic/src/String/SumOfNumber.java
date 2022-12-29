package String;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		String num=sc.next();
		
		int sum=0;
		for(int i=0; i<n;i++) {
			sum+=num.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
