package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decimals {
	
	public static boolean[]arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		arr= new boolean[N+1];
		get_prime();
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=M;i<=N;i++) {			  	 //�־��� �������� �Ҽ� �������� �ּڰ� ���ϱ�
			if(arr[i]==false) { 			 //�Ҽ��� ã�´�
				sum+=i;
				if(min==Integer.MAX_VALUE) { //ù �Ҽ��� min�� ����ֱ�
					min=i;
				}
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
	public static void get_prime() {
		arr[0]=true;
		arr[1]=true;
		
		for(int i =2; i<=Math.sqrt(arr.length);i++) {
			if(arr[i]) continue;	//�̹� üũ��(true) �迭
			
			// i �� ������� �ɷ��ֱ� ���� �ݺ���
			for(int j=i*i;j<arr.length;j+=i) {
				arr[j]=true;		//�Ҽ��� �ƴѰ��� true��
			}
			
		}
		
	}

}
