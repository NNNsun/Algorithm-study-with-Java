package Sort;

import java.util.Arrays;

public class ShellSort {
//�������� ���������� ���� ���� �����̿���.
	static void shellSort(int []a, int n) {
		for(int h=n/2;h>0;h/=2)	//�迭�� ũ�⸦ �˾Ƴ��� �� �ڸ� ��ġ�� ���ϰ� ����.
			for(int i=h;i<n;i++) {
				int j;
				int tmp=a[i];
				for(j=i-h;j>=0&&a[j]>tmp; j-=h)
					a[j+h]=a[j];
				a[j+h]=tmp;
			}
	}
	
	public static void main(String[] args) {
		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.print("�� ���� ��: ");
		System.out.println(Arrays.toString(a));
		shellSort(a,8);
		
		System.out.print("������������ �����߽��ϴ�: ");
		System.out.println(Arrays.toString(a));
	}

}
