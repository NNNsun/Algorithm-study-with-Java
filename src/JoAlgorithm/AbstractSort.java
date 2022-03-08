package JoAlgorithm;

public class AbstractSort {
	public static void sort(Comparable[]a) {};
	
	protected static boolean less(Comparable v,Comparable w) {
		//compareTo�� �񱳰����� ���ذ��� ������ -1, �����ϸ� 0, ũ�� 1�� return�Ѵ�.
		//���ذ��� ������ true
		//���ذ��� ũ�ٸ� false
		return v.compareTo(w)<0; //v�� ���ذ�
	}
	protected static void exch(Comparable[] a, int i, int j) {
		//swap�Լ�
		Comparable t = a[i]; a[i]=a[j];a[j]=t;
	}
	protected static void show(Comparable[] a) {
		//�迭�� ����Ʈ
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	protected static boolean isSorted(Comparable[] a) {
		
		
		for(int i=1; i<a.length; i++)
			if (less(a[i],a[i-1])) //a[i]�� ���ذ�, a[i-1]�� �񱳰�
				//���̸� false
				//�ֳ��ϸ� a[i-1]�� �� �۾ƾ��ϱ� ����
				return false;
			//����� ���ĵǾ�����
			return true;
	}
}


/*
 * Comparable �������̽��� ��
 * 
 * public class Date implements Comparable<Date>{ private final int month;
 * private final int day; private final int year; public Date(int month, int
 * day, int year) { if(!isValid(month,day,year)) throw new
 * IllegalArgumentException("Invalid date"); this.month=month; this.day=day; } }
 */




















