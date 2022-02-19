package BJbasic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class WordFlip {

	public static void main(String[] args) throws IOException {
		System.out.println("����");
		
		//�о���̱����� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//�������� ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//������ �̿��ؼ� ������ ���̴�.
		Stack<Character> stack = new Stack<Character>();
	
		for (int i = 0; i < n; i++) {
			//n��ŭ ������ �о�´�, "\n"�� �������� ������� ������.
			String input = br.readLine() + "\n";
			for (char c : input.toCharArray()) {
				//���ÿ� ���� ���߿� ������ ���ԵǸ� pop���ؼ� write�� ����.
				if (c == ' ' || c == '\n') {
					while (!stack.isEmpty()) {
						//pop�Ѱ��� �ٽ� write�� ����.
						bw.write(stack.pop());
					}
					//���ο��� bw�� �����´�.
					bw.write(c);
				//���⼭ ���� ���ÿ� �ִ´�.
				} else
					stack.push(c);
			}

		}
		//Ŭ���̾�Ʈ���� ������ �����ϰ� ���۸� ����.
		bw.flush();
		
		bw.close();
		return;
	}

}
