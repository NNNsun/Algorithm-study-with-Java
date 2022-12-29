package FOR;

import java.util.Scanner;

public class AB8 {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
	
		int []temp=new int[n];
		int []a2=new int[n];
		int []b2=new int[n];
		
		for(int i=0;i<n;i++) {
			a2[i]= sc.nextInt();
			b2[i]= sc.nextInt();
			temp[i]=a2[i]+b2[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print("Case #"+(i+1)+": ");
			System.out.println(a2[i]+" + "+b2[i]+" = "+temp[i]);
			
		}


	}

}
