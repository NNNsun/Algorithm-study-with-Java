package JoAlgorithm;
//stable��

public class Merge extends AbstractSort {

	private static void merge(Comparable[] a, Comparable[] aux,int lo, int mid, int hi ) {
		//a[lo...mid]�� a[mid+1...hi]�� �̹� ���ĵ� ����
		
		//aux[]�� a[]�� ������ �ϴ� �����صд�
		for(int k=lo; k<=hi;k++)
			aux[k]=a[k]; 
		
		//aux[]�迭�� ���Ͽ� ���յ� ����� a[]�迭�� �ٽ� �����Ѵ�
		
		//i�� ����(aux) ���� ����, j�� ����(aux) ���� ������
		int i=lo, j=mid+1;
		
		//lo���� hi���� ��ü�� ����
		for(int k=lo; k<=hi;k++) {
		//�ٳ����� ���
			
			if(i>mid)						a[k]=aux[j++];
			else if(j>hi)					a[k]=aux[i++];
			
			
		//i�� j�� �������� �����������	
			//aux[j]�� aux[i]���� �������, a�� aux[j]���� �ְ� j�� ���� idx�� �ѱ�� 
			else if(less(aux[j],aux[i]))	a[k]=aux[j++];
			
			//aux[j]�� aux[i]���� Ŭ���, a�� aux[i]�� ���� �ְ� i�� ���� idx�� �ѱ��
			else							a[k]=aux[i++];
		}
	}
	
	public static void main(String[] args) {
		//�ݹݾ� ������ �Ǿ��ִ� array
		Comparable[] arr = {2,43,46,54,3124,35,43,57,426,500};
		Comparable[] arr2=new Comparable[10];
		merge(arr,arr2,0,(arr.length-1)/2,9);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
