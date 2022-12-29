package Sort;

import java.util.Scanner;

public class MergeArray2 {

	static int[]buff; //�ӽ� �迭 : �����ϱ����� �뵵
	//��������� ��������
	static void mergeSort2(int []a,int left, int right) {//��ü �迭�� ���� ��ä�� ����
		if(left<right) {
			int i;
			int center=(left+right)/2;
			int p=0;
			int j=0;
			int k=left;
			
			mergeSort2(a,left,center);//�� ���� �迭�� ���� �κ�, �� �κ��� ��������
			mergeSort2(a,center+1,right);//�� ���� �迭�� ������ �κ�, �� �κ��� ��������
			
			for(i=left; i<=center;i++)
				buff[p++]=a[i];
			while (i<=right&&j<p)//p == �� ������
				
				a[k++]= (buff[j]<=a[i]?buff[j++]:a[i++]);//���� ������ ����, �������ĺκ�
			while (j<p)
				a[k++]=buff[j++]; //���� �� ����
		}
	}
	static void mergeSort_2(int[]a,int n) { //���۸� �����ؼ� �۾��Ҽ��ְ� �������, mergeSort2�� ����,��ü �迭�� ���� �˷���, ���۸� ���
		buff=new int [n];
		mergeSort2(a,0,n-1);
		buff=null;
	}
	
	public static void main(String[] args) {
		Scanner se=new Scanner(System.in);
		
		System.out.println("���� ����");
		System.out.print("�迭 ����: ");
		int num=se.nextInt();
		int[]x=new int [num];
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"]: ");
			x[i]=se.nextInt();
		}
		mergeSort_2(x,num);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<num;i++)
			System.out.println("x["+i+"]= "+x[i]);
	}

}
