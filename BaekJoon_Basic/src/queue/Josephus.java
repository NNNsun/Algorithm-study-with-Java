package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {

	public static void main(String[] args) throws  IOException {
		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i=0; i<n;i++) {
			que.add(i+1);
		}
		while(que.size()>1) {
			for(int i=0; i<k-1;i++) {
				int temp=que.poll();
				que.offer(temp);
			}
			sb.append(que.poll()).append(", ");
		}
		
		sb.append(que.poll()).append('>');
		System.out.println(sb);
	}

}
