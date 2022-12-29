package WHILE;

import java.util.Scanner;

public class PlusCycle {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int result = 0;
		int count = 0;
		do  {
			int n10 = n / 10;
			int n1 = n % 10;
			result = n10 + n1;
			n = n1 * 10 + result % 10;
			count++;
		}while(temp != n);
		System.out.println(count);
	}
}
