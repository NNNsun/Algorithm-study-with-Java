package Sort;

import java.util.Arrays;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) { // ��ġ�� �ٲ��ش�.
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bublleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					// �� ���ڸ� �������� �迭�ȿ� �ִ� ��� ���ڿ� ���ϸ鼭,
					// ���� ���� ���� ������ ũ�ٸ� swap���� ���� �ٲ��ָ鼭 ��ĭ�� ������ �ű��.
					swap(a, j - 1, j);
					// System.out.println(Arrays.toString(a));
				}
	}

	static void bublleSort2(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++; //exchg�߰�����: ������ Ƚ���� �˼��ִ�.
				}
			if (exchg==0)break;
		}
	}
	static void bublleSort3(int[] a, int n) { //���ĵ� ���� �����ʈf��.
		int k=0;
		while (k<n-1) {
			int last=n-1;
				for (int j = n - 1; j > k; j--)
					if (a[j - 1] > a[j]) {
						swap(a, j - 1, j);
						last=j;
					}
				k=last;
			}
		}
	
	static void selectionSort(int [] a,int n) {
		for(int i=0; i<n-1;i++) {
			int min=i;					//���ĵ������� �κп��� ���� ���� �ε����� ���
			for(int j=i+1;j<n;j++) {
				if (a[j]<a[min])
					min=j;
			swap(a,i,min);				//���� ���ĵ��� ���� �κ��� ù ���� ���� ���� ���� ��ȯ
			System.out.println(Arrays.toString(a));
			}	
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.print("�������� ���� ���� ��: ");
		System.out.println(Arrays.toString(a));
		selectionSort(a, 8);
		System.out.print("���� ���� ��: ");
		System.out.println(Arrays.toString(a));
	}

}
