package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String prefix = br.readLine();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Stack<Double> stack = new Stack<>();
		int len = prefix.length();
		for (int i = 0; i < len; i++) {
			char ch = prefix.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				double d = arr[ch - 'A'];
				stack.push(d);
			} else {
				double num1 = stack.pop();
				double num2 = stack.pop();
				double num3 = 0.0;
				switch (ch) {
				case '+':
					num3 = num2 + num1;
					break;
				case '-':
					num3 = num2 - num1;
					break;
				case '*':
					num3 = num2 * num1;
					break;
				case '/':
					num3 = num2 / num1;
					break;
				}
				stack.push(num3);
			}
		}
		System.out.printf("%.2f", stack.pop());
	}
}
