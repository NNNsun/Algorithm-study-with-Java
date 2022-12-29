package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class IronStick {

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> buf = new Stack<>();
		String str = br.readLine();

		int result =0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)=='(') {
				buf.push('(');
				continue;
			}
			// ()일때
			if(str.charAt(i)==')') {
				buf.pop();
				if(str.charAt(i-1)=='(') {
					result+=buf.size();
				}else {
					result++;
				}
			}
		}
	    bw.write(result + "\n");
        bw.flush();
        br.close();
        bw.close();

	}

}
