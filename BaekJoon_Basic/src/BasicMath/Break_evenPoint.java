package BasicMath;

import java.util.Scanner;

public class Break_evenPoint {

	public static void main(String[] args) {
		System.out.println("실행");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();//고정비용
		int B=sc.nextInt();//가변비용
		
		int C=sc.nextInt();//노트북가격
		
		
		if(C<=B) {
			System.out.println("-1");
		}
		else {
			System.out.println(A/(C-B)+1);
		}
		

	}

}
