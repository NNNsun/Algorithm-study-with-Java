package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortAge {
	public static class People {
		int age;
		String name;

		public People(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public String toString() {
			return age + " " + name + "\n";
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		People[] p = new People[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new People(age, name);
		}
		Arrays.sort(p, new Comparator<People>() {
			public int compare(People p1, People p2) {
				return p1.age - p2.age;
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);

	}

}
