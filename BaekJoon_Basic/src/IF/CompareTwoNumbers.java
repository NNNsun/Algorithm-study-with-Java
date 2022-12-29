package IF;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if(a>b)System.out.println(">");
		if(a<b)System.out.println("<");
		if(a==b)System.out.println("==");

	}

}
