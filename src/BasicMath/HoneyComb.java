package BasicMath;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//anwer�� ������ ����(���θ�)���� �����ϱ�
		int answer = 1;
		if (n != 1) {
			n = n - 1; // 14=15-1 | 7=8-1
			int idx = 1; // �׵θ��� �ø������� �ӽù�ȣ
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
