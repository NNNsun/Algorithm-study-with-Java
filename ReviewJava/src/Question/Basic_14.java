package Question;

import java.util.Scanner;

public class Basic_14 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("행의 갯수를 입력하고 [Enter]를 치세요 = ");
		int R=sc.nextInt();
		System.out.print("열의 갯수를 입력하고 [Enter]를 치세요 = ");
		int C=sc.nextInt();
		
		char[][]gameMap=new char[R][C];
		
		String[] strAr=new String[R];
		
		for(int i=0; i<R;i++) {
			System.out.printf("%d번째 행에 입력할 문자 %d개를 차례대로 입력하고 [Enter]를 치세요=",i+1,C);
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
