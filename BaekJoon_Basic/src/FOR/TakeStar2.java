package FOR;

import java.util.Scanner;

public class TakeStar2 {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int k=0; k<n-i; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
