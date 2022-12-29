package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		int count = 0;

		while (n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if (num > count) {
				for (int i = count + 1; i <= num; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				count = num;
			} else if (stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}

		System.out.println(sb);
	}

}
