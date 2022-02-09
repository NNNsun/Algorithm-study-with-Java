package BasicMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Hanoi {
	
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		System.out.println("����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		getHanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	public static void getHanoi(int N, int start, int mid, int to) {
		// �̵��� ������ ���� 1�����?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
 
		getHanoi(N - 1, start, to, mid);
		
		sb.append(start + " " + to + "\n");
    
		getHanoi(N - 1, mid, start, to);
	}
}
