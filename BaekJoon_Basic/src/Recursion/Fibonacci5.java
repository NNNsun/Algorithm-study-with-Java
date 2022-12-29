package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci5 {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getFibo(n));
	}

	public static int getFibo(int n) {
		if (n == 0) {
			
			return 0;
		}
		if (n == 1) {
			
			return 1;
		}
		
		return getFibo(n - 1) + getFibo(n - 2);
	}
}
