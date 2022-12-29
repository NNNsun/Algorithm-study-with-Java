package BasicMath;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		System.out.println("실행");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//anwer은 일종의 집합(가두리)으로 생각하기
		int answer = 1;
		if (n != 1) {
			n = n - 1; // 14=15-1 | 7=8-1
			int idx = 1; // 테두리를 늘리기위한 임시번호
			while (true) {
				n = n - idx * 6; // 8=14-6 | -5=7-12
				answer++; // 2 | 3
				if (n <= 0) {
					break; // -5
				}
				idx++; // 2
			}
		}
		System.out.println(answer);

	}

}
