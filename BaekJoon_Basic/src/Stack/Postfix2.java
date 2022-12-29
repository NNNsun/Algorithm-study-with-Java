package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix2 {
	public static int precedence(char ch) {
		if (ch == '(')
			return 0;
		else if (ch == '+' || ch == '-')
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringBuffer sb = new StringBuffer();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sb.append(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				while (stack.peek() != '(')
					sb.append(stack.pop());
				stack.pop();
			}

			else {
				while (!stack.isEmpty() && precedence(str.charAt(i)) != 0
						&& precedence(stack.peek()) >= precedence(str.charAt(i))) {
					sb.append(stack.pop());
				}
				stack.push(str.charAt(i));
			}
		}
		while (!stack.isEmpty())
			sb.append(stack.pop());
		System.out.println(sb.toString());
	}

}
