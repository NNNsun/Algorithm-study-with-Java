package Sort;

import java.util.Arrays;

public class InsertionSort {// ������

	static void insertionSort(int[] a, int n) { //�ϳ��� �����鼭 ��� ����
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)//ū ���� �ϳ��� ���������� �и鼭 ����
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.print("�ܼ� ���� ���� ��: ");
		System.out.println(Arrays.toString(a));
		insertionSort(a, 8);
		System.out.print("�ܼ� ���� ���� ��: ");
		System.out.println(Arrays.toString(a));
	}

}
