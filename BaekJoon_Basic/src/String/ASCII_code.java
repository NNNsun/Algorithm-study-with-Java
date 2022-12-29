package String;

import java.util.Scanner;

public class ASCII_code {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		int ascii=(int)c;
		System.out.println(ascii);
	}

}
