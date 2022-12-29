package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordSort {

	public static void main(String[] args) throws IOException {
		System.out.println("����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String word1, String word2) {
				//�ܾ��� ���̰� ������� ������
				if (word1.length() == word2.length()) {
					return word1.compareTo(word2);
				} else {
					return word1.length() - word2.length();
				}
			}
		});
		
		StringBuilder sb= new StringBuilder();
		sb.append(arr[0]).append('\n');
		
		for(int i=1; i<n; i++) {
			//�ߺ������ʴ� ��츸 ������.
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
		
	}

}
