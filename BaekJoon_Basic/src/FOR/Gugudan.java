package FOR;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		for(int i=1; i<10;i++) {
			System.out.printf("%d * %d = %d\n",a,i,a*i);
		}
		

	}

}
