package WHILE;

import java.util.Scanner;

public class AB4 {
	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		
		}	
		sc.close();
	
	}
}
