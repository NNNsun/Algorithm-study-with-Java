package OneArray;

import java.util.Scanner;

public class NumberOfNumbers {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] temp = new int[10];
		int result = a * b*c;
		int k=0;
		while (true) {
			k=result%10;
			temp[k]++;
			result/=10;
			if(result==0)break;
		}
		for (Integer i : temp)
			System.out.println(i);

	}

}
