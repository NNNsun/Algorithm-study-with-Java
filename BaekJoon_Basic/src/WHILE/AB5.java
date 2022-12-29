package WHILE;

import java.util.Scanner;

public class AB5 {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int n=1;
		int n2=1;
		
		
		while(true) {
			 n= sc.nextInt();
			 n2=sc.nextInt();
			 if(n==0&&n2==0) break;
			 
			 System.out.println(n+n2);
		}
	
	}

}
