package Question;

public class Basic_11 {

	public static void main(String[] args) {
		// �迭==������ ������ Ÿ���� ������ �ϳ��� �迭������ �����ϴ� �ڷᱸ��
		// python�� ���� ������ Ÿ���� ���� �������ִ�!!

		// �迭 ����
		// ������Ÿ��[] �迭��=new ������Ÿ��[�迭ũ��]->standard
		// �迭����->ũ������-> �迭 ������ ���� �ڵ����� �ʱ�ȭ(������:0,�Ǽ���:0.0)

		int[] sales_table = new int[4];// 0���� �ʱ�ȭ �Ǿ�����
		double[] sales_table2 = new double[100];
		System.out.println(sales_table[2]);// �ε����� �迭�� ������ ������ �� ����
		System.out.println(sales_table2[45]);// 0.0
		int arr_size=sales_table.length; //�迭�� ũ��
		System.out.println(sales_table[arr_size-1]);//������ �迭
		
		int[]arr1 = {3,11,22,33,44,55}; //������, ���� �����
		int[]arr2=new int[]{3,11,22,33,44,55}; //�����,���ŷο�->���� ������ ���� �ʿ���
		int[]arr3;
		arr3= new int[]{3,11,22,33,44,55};//new int[]�ʿ�!
		for(int i:arr3) {
			System.out.println(i);//i�� ����, arr[i]���� x
		}
		
		int[]arr4= {3,4,5,6,7,8};
		double[]arr5= {3.2,4.1,5.2,6.1,7.4,8.6};
		
		System.out.println(arr4);//[I@4361bd48->I:������ �ǹ�
		System.out.println(arr5);//[D@53bd815b->D:�Ǽ��� �ǹ�
		
	}

}
