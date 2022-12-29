package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture {

	public static boolean arr[] = new boolean[10001];

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		get_prime();

		int T = Integer.parseInt(br.readLine());

		while(T-->0) {
			int n = Integer.parseInt(br.readLine());
			int fp = n / 2;
			int sp = n / 2;
			while (true) {
				if (!arr[fp] && !arr[sp]) {
					System.out.println(fp + " " + sp);
					break;
				}
				fp--;
				sp++;
			}
		}

	}

	// 에라토스테네스의 체와 제곱근 이용
	public static void get_prime() {
		arr[0] = arr[1] = true;
		for (int i = 2; i < Math.sqrt(arr.length); i++) {
			if (arr[i])
				continue;

			for (int j = i * i; j < arr.length; j += i)
				arr[j] = true;
		}

	}

}
