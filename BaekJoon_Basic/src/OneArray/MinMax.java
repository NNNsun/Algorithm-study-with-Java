package OneArray;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int []temp=new int[sc.nextInt()];
		int max=-1000001;
		int min=1000001;
		for(int i=0;i<temp.length;i++) {
			temp[i]=sc.nextInt();
			if(max<temp[i])max=temp[i];
			if(min>temp[i])min=temp[i];
		}
		System.out.println(min+" "+max);

	}

}
