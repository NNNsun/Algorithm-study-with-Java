package BasicMath;

import java.util.Scanner;

public class Break_evenPoint {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();//�������
		int B=sc.nextInt();//�������
		
		int C=sc.nextInt();//��Ʈ�ϰ���
		
		
		if(C<=B) {
			System.out.println("-1");
		}
		else {
			System.out.println(A/(C-B)+1);
		}
		

	}

}
