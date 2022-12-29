package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Blackjack {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = get21(arr, n, m);
		System.out.println(result);
	}

	static int get21(int[] arr, int n, int m) {
		int max = 0;

		for (int i = 0; i < n - 2; i++) {

			if (arr[i] > m)
				continue;

			for (int j = i + 1; j < n - 1; j++) {

				if (arr[i] + arr[j] > m)
					continue;

				for (int k = j + 1; k < n; k++) {
					int sum = arr[i] + arr[j] + arr[k];

					if (m == sum) {
						return sum;
					}

					if (max < sum && sum < m) {
						max = sum;
					}
				}
			}
		}

		return max;
	}
}