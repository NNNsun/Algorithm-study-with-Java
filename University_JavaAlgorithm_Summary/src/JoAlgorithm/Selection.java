package JoAlgorithm;




public class Selection extends AbstractSort {
	
	public static void sort(Comparable[] a) {
	
		
		for(int i=0; i<a.length; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++) {
				if (less(a[j], a[min]))
					min=j;
			}
			//���� ������(j)�� ã���� ���ذ�(i)�� �ٲ۴�.
			exch(a,i,min);
		}
		
		//false �϶� ������ �߻���Ų��.
		assert isSorted(a);
	}
	public static void main(String[] args) {
		Integer[] a= {10,4,5,2,1,8,3,6};
		System.out.println("���� ��");
		for(int i=0; i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		Selection.sort(a);
		System.out.println("\n"+"�������� ��");
		Selection.show(a);
		
	}

}








