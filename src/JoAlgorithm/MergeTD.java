package JoAlgorithm;

//Top-Down Merge: ������ ���� ��������, �������鼭 ���İ� �պ��� recursion�Ѵ�
public class MergeTD extends AbstractSort {
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		// a[lo...mid]�� a[mid+1...hi]�� �̹� ���ĵ� ����

		// aux[]�� a[]�� ������ �ϴ� �����صд�
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];

		// aux[]�迭�� ���Ͽ� ���յ� ����� a[]�迭�� �ٽ� �����Ѵ�

		// i�� ����(aux) ���� ����, j�� ����(aux) ���� ������
		int i = lo, j = mid + 1;

		// lo���� hi���� ��ü�� ����
		for (int k = lo; k <= hi; k++) {
			// �ٳ����� ���
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];

			// i�� j�� �������� �����������
			// aux[j]�� aux[i]���� �������, a�� aux[j]���� �ְ� j�� ���� idx�� �ѱ��
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];

			// aux[j]�� aux[i]���� Ŭ���, a�� aux[i]�� ���� �ְ� i�� ���� idx�� �ѱ��
			else
				a[k] = aux[i++];
		}
	}

	public static void sort(Comparable[] a) {
		
		//�ӽù迭: merge�� ����� ��� �����ϱ� ���� ����
		Comparable[] aux = new Comparable[a.length];
		
		//���� sort�� ����, ���� �ʱⰪ
		sort(a, aux, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		//������ �Ϸ�� ���
		if (hi <= lo)
			return;
		//��������� ���鼭 mid�� ������ �������ش�
		int mid = lo + (hi - lo) / 2;
		
		//mid���� ������ �����Ѵ�
		sort(a, aux, lo, mid);
		
		//mid���� ������ �����Ѵ�
		sort(a, aux, mid + 1, hi);
		
		//mid�� �������� ���ĵ� ���� ������ ���Ĺ� �պ��Ѵ�
		merge(a, aux, lo, mid, hi);
	}

	public static void main(String[] args) {
		Comparable[] a = { 'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T', 'E', 'X', 'A', 'M', 'P', 'L', 'E' };
		Comparable[] aux = new Comparable[a.length];
		int lo=0;
		int hi=a.length-1;
		int mid=(a.length-1)/2;
		
		//array �ϳ��� �־ �ι�° sort()�� ��������� ȣ��Ǳ� ������ ����Ҽ��ִ� �Լ�
		sort(a);
		System.out.print("sort(a)= ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		
		System.out.println("\n");
		
		//����sort()
		sort(a, aux,lo,hi);
		System.out.print("sort(a, aux,lo,hi)= ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
	}

}
