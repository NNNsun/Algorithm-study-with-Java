package JoAlgorithm;


//LSD(low�ڸ�)�� �̿��� �������
//�ð����⼺ O(d*(n+r))
public class Radix {
	public static void sort(int[]A) {
		//i:for���� �����, exp: �ڸ����� �ø��� ��� ����� 1���ڸ����� ����, n: for���� ������ ���
		int i,m=A[0], exp=1,n=A.length;
		
		//�� ����� ���� ����� �ӽ÷� ������ �迭
		int[]B=new int[n];
		
		//�ڸ���(m)�� �����ϱ� ���� �ʿ��� for��
		for(i=1; i<n;i++) {
			if(A[i]>m) m=A[i];
		}
		
		//m�� ���� ū��, exp�� ���� Ŀ��(1->10->100...)
		//���� �������� 0���� ū ��� ��, �����ϴ� �ڸ��� ������ while�� ����
		while(m/exp>0) {
			//���ڴ� 0~9������ �����ϱ� ������ C[10]
			int[]C=new int[10];
			
			//1�� �ڸ����� ����ū �ڸ������� for������ �ľ����� C���ٰ� count���ش�
			for(i=0;i<n;i++) C[A[i]/exp%10]++;
			
			//stable�ϰ� �����ϱ����� ������Ų ���� C�� �ִ´�
			for(i=1;i<10;i++) C[i]+=C[i-1];//i=1���� �����Ͽ� ������ ���� C[-1]�ڸ��� �־��� 
			
			//������ ���� ����(���� ū ��)stable�ϰ� B�� ���� �ӽ÷� �����Ѵ�, �迭�� ���ʺ��� ä���ִ´�
			for(i=n-1; i>=0;i--) B[--C[A[i]/exp%10]]=A[i];
			
			//B�� ���� �ٽ� A�� �������ش�
			for(i=0;i<n;i++)
				A[i]=B[i];
			
			//�ڸ����� �ø����� �κ�
			exp*=10;
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {2,43,46,3124,54,67,543,35,53,426,43};
		sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
