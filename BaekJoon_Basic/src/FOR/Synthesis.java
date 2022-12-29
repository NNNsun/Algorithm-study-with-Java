package FOR;

import java.util.Scanner;

public class Synthesis {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		sc.close();
		
		int sum=0;
		for(int i=1; i<a+1;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
