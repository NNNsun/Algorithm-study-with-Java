package Question;

import java.util.Scanner;

public class Basic_14 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϰ� [Enter]�� ġ���� = ");
		int R=sc.nextInt();
		System.out.print("���� ������ �Է��ϰ� [Enter]�� ġ���� = ");
		int C=sc.nextInt();
		
		char[][]gameMap=new char[R][C];
		
		String[] strAr=new String[R];
		
		for(int i=0; i<R;i++) {
			System.out.printf("%d��° �࿡ �Է��� ���� %d���� ���ʴ�� �Է��ϰ� [Enter]�� ġ����=",i+1,C);
			strAr[i]=sc.next();
			for(int j=0; j<C;j++) {
				gameMap[i][j]=strAr[i].charAt(j);
			}
		}
		System.out.println("----------------------------------------");
		for(int i=0; i<R;i++) {
			System.out.print("\t\t");
			for(int j=0; j<C;j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		
		
		
		
		
		
		
		
	}

}
