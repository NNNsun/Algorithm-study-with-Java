package FOR;

import java.util.Scanner;

public class NumberLessThanX {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X = sc.nextInt();
		int[] temp = new int[n];
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			k = sc.nextInt();
			temp[i] = k;
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] < X)
				System.out.print(temp[i]+" ");
		}
	}

}
