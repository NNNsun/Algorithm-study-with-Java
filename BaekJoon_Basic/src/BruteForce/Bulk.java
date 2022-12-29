package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bulk {

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] bulk = new int[n][2];
		
		
		String[] str;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			bulk[i][0] = Integer.parseInt(str[0]);
			bulk[i][1] = Integer.parseInt(str[1]);

		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int rank = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (bulk[i][0] < bulk[j][0] && bulk[i][1] < bulk[j][1]) {
					rank++; //실제 랭크대로 나열한다기 보단 비교해서 변수만 늘려주는 느낌
				}
				
			}
			sb.append(rank).append(' ');
		}
		System.out.println(sb);

	}

}
