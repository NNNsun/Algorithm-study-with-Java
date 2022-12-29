package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {

	

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < n; i++) {
			sb.append(check(br.readLine())).append('\n');
			
		}

	}

	public static String check(String readLine) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<readLine.length();i++) {
			
			char c=readLine.charAt(i);
			
			if(c=='(') {
				stack.push(c);
			}
			else {
				stack.pop();
			}
			
		}
		
		if(stack.empty()) {
			return "YES";
		}else {
			return "NO";
		}
	}

}
