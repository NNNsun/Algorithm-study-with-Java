package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor {

	public static void main(String[] args) throws  IOException {
		System.out.println("����");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<Character> L = new Stack<>();
		Stack<Character> R = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			L.push(str.charAt(i));
		}
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String option = br.readLine();

			switch (option.charAt(0)) {
			case 'L':
				if (L.empty())
					break;
				R.push(L.pop());
				break;
			case 'D':
				if (R.empty())
					break;
				L.push(R.pop());
				break;
			case 'B':
				if (L.empty())
					break;
				L.pop();
				break;
			case 'P':
				L.push(option.charAt(2));//�����̽��ٸ� �����ϱ⶧���� (2)�� ��ġ�� ���ڸ� push ������Ѵ�.
				break;
			}
		
		}
		while(!L.empty()) {
			R.push(L.pop());
		}
		StringBuilder sb =new StringBuilder();
		while(!R.empty()) {
			sb.append(R.pop());
		}
		System.out.println(sb.toString());

	}

}
