package Sort;

import java.util.Arrays;

public class ArraysSortTester {
	
	//<Ŭ���� ��ü �迭>
	//1.�ڿ� ������ �ʿ��� �迭: �������� ��ұ��踦 ���Ͽ� ����
	//static void sort(Object[]a);
	//static void sort(Object[]a,int fromIndex, int toIndex);
	
	//2.����� ��� ���踦 ���Ҷ� comparator c �� �̿��Ͽ� ����
	//static <T> void sort(T[]a,Comparator<? super T> c)
	//static <T> void sort(T[]a,int toIndex, Comparator<? super T> c)
	
	
	public static void main(String[] args) {
		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.print("�������� ���� ��: ");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//�⺻�ڷ��� sort�� ������ �˰����� ������ ���̸�, ���������� ����!(������ ���� ��ġ�� sorting �� �ٲ���� ����)
		System.out.print("�������� ���� ��: ");
		System.out.println(Arrays.toString(a));

	}

}
