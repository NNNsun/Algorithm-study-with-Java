package Question;
import java.util.*;
public class Basic_12 {

	public static void main(String[] args) {
		//Array class : �ݺ����� ��������ʰ� ��� ����
		int[]arr= {123,124,45,62,23,24};
		System.out.print(Arrays.toString(arr)+" ");//[123, 124, 45, 62, 23, 24] ��ȣ�� ���
		System.out.println("\n");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		//int a[], b[], c[];  /(������) int[] a,b,c; ���߹迭���� ����
		//int a[],b,c; -> b,c�� ���������θ� ����ȴ�.
		
		//�迭���� �޼��� arraycoppy()System.arraycopy(�����迭��,������������ε���,����迭��,����� �迭�� ������ġ,����)
		int[]arr1= {1,2,3,4,5};
		int[]arr2= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\n");
		System.arraycopy(arr1, 2, arr2, 4, 3);
		System.out.println(Arrays.toString(arr2));//5,6,7 ��� �Էµ�
	}

}
