package FOR;

import java.util.Scanner;

public class AB3 {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a=0;
		int b=0;
		int []temp=new int[n];
		
		for(int i=0;i<n;i++) {
			a= sc.nextInt();
			b= sc.nextInt();
			temp[i]=a+b;
		}
		for(Integer k : temp)
			System.out.println(k);
		sc.close();
	}
	
}
