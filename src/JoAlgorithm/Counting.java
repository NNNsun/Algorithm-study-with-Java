package JoAlgorithm;
//�ߺ��Ǵ� ������ ��� ���
//Ű���� 0~K-1������ ������ ��� ���� ����
//�Է¹迭: A[n]
//�ӽù迭: C[K]
//����迭: B[n]

public class Counting {
	//K�� ������ ����
	public static int[]sort(int[]A,int K){
		int i,N=A.length;
		int[]C=new int[K], B=new int [N];
		
		
		//�ߺ��Ǵ� ���Ҹ� C�迭�� count�Ѵ�.
		for(i=0;i<N;i++)C[A[i]]++;
		
		//�տ��ִ� ���� ���ϸ鼭 ��������� �������� �Է��Ѵ�.
		//Stable�� ������ ���� �ε����� �ű�� �۾��̴�.
		for(i=1;i<K;i++)C[i]+=C[i-1];
		
		//�������� ���鼭 ���ϴ� ���� Stable�ϰ� �����Ѵ�.
		//�̶� �ڿ������� �����ϴ� ������ �տ��� ���� ������������ �����߱⶧����
		//�������� ���鼭 �����Ϸ��� �ڿ������� ���鼭 �����ؾ� Stable�� ������ �̷������.
		for(i=N-1;i>=0;i--)
			B[--C[A[i]]]=A[i];
		return B;
	}
	
	
	public static void main(String[] args) {
		int[]A= {10,4,5,8,1,8,3,6},B;
		B=Counting.sort(A, 11);
		for(int i=0;i<B.length;i++)
			System.out.print(B[i]+" ");
		System.out.println();
	}
	//�ð�, ���� ���⵵ O(N+K)
	//K�� �ױⰡ N�� ����ϴٸ�, O(N)���⵵ ���� ����!
	//������ K=N^3�̶��, ���⵵ =O(N^3)
	//K�� ���������ϰ� ũ�� ������� �˰����̴�.
}
