package FOR;

import java.util.Scanner;

public class TakeStar {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
