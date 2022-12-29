package OneArray;

import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int []temp;
		
		int test=sc.nextInt();
		
		for(int i=0;i<test;i++) {
			double avg=0;
			double count=0;
			int n=sc.nextInt();
			temp=new int[n];
			double sum=0;
			for(int j=0;j<n;j++) {
				temp[j]=sc.nextInt();
				sum+=temp[j];
			}
			avg=(sum/n);
			for(int j=0;j<n;j++) {
				if (temp[j]>avg) count++;
			}
			System.out.printf("%.3f%%\n",(count/n)*100);
		}

	}

}
