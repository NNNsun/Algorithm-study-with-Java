package Sort;

import java.util.Scanner;

//���� ����
public class Fsort {
	static void fSort(int[]a,int n, int max) { //�迭, �迭����, ������ �� ����ū ��
		int[] f=new int [max+1]; //��������
		int[] b=new int [n];	 //�۾��� ���� �迭
		
		for(int i=0; i<n; i++)		f[a[i]]++;			//1�ܰ� ��������ǥ �����
		for(int i=1; i<=max; i++) 	f[i]+=f[i-1];		//2�ܰ� ������������ǥ����� ������Ű�鼭 �迭����
		for(int i=n-1;i>=0;i--)		b[--f[a[i]]]=a[i];  //3�ܰ� ���� �迭 �����, ���� ��ħ
		for(int i=0; i<n; i++)      a[i]=b[i];			//4�ܰ� ���� �迭�� �ٽ� �����ϱ�
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���� ������ �����մϴ�.");
		System.out.print("�ε��� ��: ");
		int nx=sc.nextInt();
		int[]x=new int[nx];
		
		for(int i=0; i<nx;i++) {
			do {								//�ѹ� ������ش�.
				System.out.print("x["+i+"]: ");
				x[i]=sc.nextInt();
			}while (x[i]<0);					//0���� ���� �� ������ �ٽ� �Է��ϰ� �Ѵ�.
		}
		int max=x[0];
		for(int i=1; i<nx;i++)					//�迭 ������ �� ���� ū ������ max�� ����
			if(x[i]>max) max = x[i];
		fSort(x,nx,max);
		System.out.println("������������ �����߽��ϴ�.");
		for (int i=0; i<nx; i++)
			System.out.println("x["+i+"]= "+x[i]);
	}

}
