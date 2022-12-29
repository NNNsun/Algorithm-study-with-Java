package OneArray;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int []temp=new int[10];
		int max=0;
		for(int i=0;i<temp.length-1;i++) {
			temp[i]=sc.nextInt();
			if(max<temp[i]) {
				max=temp[i];
				temp[9]=i+1;
			}
		}
		System.out.println(max+" "+temp[9]);

	}

}
