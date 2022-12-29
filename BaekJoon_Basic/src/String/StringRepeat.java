package String;

import java.util.Scanner;

public class StringRepeat {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for (int t = 0; t < k; t++) {
			int n = sc.nextInt();
			String str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				
				for (int j = 0; j < n; j++) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
