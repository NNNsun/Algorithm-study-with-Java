package queue;

import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class QueueEx {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Queue<Integer> que = new LinkedList<Integer>();
		int n = Integer.parseInt(br.readLine());
		int last = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String option = st.nextToken();

			switch (option) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				que.add(num);
				last = num;
				break;
			case "pop":
				if (!que.isEmpty()) {
					sb.append(que.remove() + "\n");
				} else {
					sb.append("-1\n");

				}
				break;
			case "size":
				sb.append(que.size() + "\n");
				break;
			case "empty":
				if (que.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
			case "front":
				if (que.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(que.peek() + "\n");
				}
				break;
			case "back":
				if (que.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(last+"\n");
				}
				break;
			}
			System.out.println("que: "+que+"\n");
			System.out.println("sb: "+sb);
		}
		System.out.println(sb);
	}

}
