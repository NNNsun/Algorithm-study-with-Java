package Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class WordFlip {

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		
		//읽어들이기위해 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//쓰기위해 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//스택을 이용해서 뒤집을 것이다.
		Stack<Character> stack = new Stack<Character>();
	
		for (int i = 0; i < n; i++) {
			//n만큼 문장을 읽어온다, "\n"을 기준으로 문장수를 나눈다.
			String input = br.readLine() + "\n";
			for (char c : input.toCharArray()) {
				//스택에 넣은 것중에 공백이 포함되면 pop을해서 write에 쓴다.
				if (c == ' ' || c == '\n') {
					while (!stack.isEmpty()) {
						//pop한것을 다시 write로 쓴다.
						bw.write(stack.pop());
					}
					//새로워진 bw을 가져온다.
					bw.write(c);
				//여기서 먼저 스택에 넣는다.
				} else
					stack.push(c);
			}

		}
		//클라이언트에게 내용을 전송하고 버퍼를 비운다.
		bw.flush();
		
		bw.close();
		return;
	}

}
