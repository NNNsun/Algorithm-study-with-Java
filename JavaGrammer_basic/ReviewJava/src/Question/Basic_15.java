package Question;

import java.util.Scanner;

public class Basic_15 {
	
	//[1]��ȯ��x,���ڰ�x
	public static void helloWorld() {
		//main �޼��尡 static�̱⶧���� ������ static���� �޼��带 �����ؾ��Ѵ�.
		System.out.println("[1] helloWorld()�� ���۵Ǿ����ϴ�.");
	}
	//[2]��ȯ��x,���ڰ�o
	public static void plusMethod(int x, int y) {
		System.out.println("[2] "+(x+y));
	}
	//[3]��ȯ��o,���ڰ�x
	public static int returnMethod() {
		int ret=100;
		ret*=100;
		return ret;
	}
	public static String capitalMethod(String A) {
		return A.toUpperCase();
	}
	public void GoodMoning() {
		System.out.println("[5]GoodMoning()�޼��带 ȣ���߽��ϴ�.");
	}
	
	public static void main(String[] args) {
		
		helloWorld();      //[1] static�� static�� �θ���.
		
		int a=100, b=200;
		plusMethod(a,b);   //[2]
		
		int rst;
		rst=returnMethod();
		System.out.println("[3]"+rst); //[3]
		
		System.out.print("[4]�ܾ �ҹ��ڷ� �Է��ϼ���= ");
		Scanner sc= new Scanner(System.in);
		String r= sc.next();
		System.out.println("\t"+capitalMethod(r));//[4]
		
		//��ü ���� �� �޼��� ȣ�� ����!!!!
		Basic_15 obj= new Basic_15();
		obj.GoodMoning();//[5]
		
	}
}
