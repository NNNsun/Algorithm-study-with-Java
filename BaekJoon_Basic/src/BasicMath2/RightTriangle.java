package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RightTriangle {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			int n3 = Integer.parseInt(st.nextToken());
			int arr[] = { n1, n2, n3 };
			Arrays.sort(arr);
			if(n1==0&&n2==0&&n3==0)
				break;
			else if (arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1]*arr[1])) {
				System.out.println("right");
			}
			else 
				System.out.println("wrong");
		}

	}

}
