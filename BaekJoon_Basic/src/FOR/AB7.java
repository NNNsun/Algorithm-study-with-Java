package FOR;

import java.util.Scanner;

public class AB7 {

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
		for(int i=0;i<n;i++) {
			System.out.print("Case #"+(i+1)+": ");
			System.out.println(temp[i]);
			
		}

	}

}
