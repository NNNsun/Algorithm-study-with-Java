package IO_ArithmeticOperations;

import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int C= sc.nextInt();
		System.out.println( (A+B)%C);
		System.out.println(  ((A%C) + (B%C))%C);
		System.out.println(  (A*B)%C);
		System.out.println(  ((A%C)*(B%C))%C);

	}

}
