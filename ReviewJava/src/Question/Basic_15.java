package Question;

import java.util.Scanner;

public class Basic_15 {
	
	//[1]반환값x,인자값x
	public static void helloWorld() {
		//main 메서드가 static이기때문에 동일한 static으로 메서드를 구성해야한다.
		System.out.println("[1] helloWorld()가 동작되었습니다.");
	}
	//[2]반환값x,인자값o
	public static void plusMethod(int x, int y) {
		System.out.println("[2] "+(x+y));
	}
	//[3]반환값o,인자값x
	public static int returnMethod() {
		int ret=100;
		ret*=100;
		return ret;
	}
	public static String capitalMethod(String A) {
		return A.toUpperCase();
	}
	public void GoodMoning() {
		System.out.println("[5]GoodMoning()메서드를 호출했습니다.");
	}
	
	public static void main(String[] args) {
		
		helloWorld();      //[1] static은 static을 부른다.
		
		int a=100, b=200;
		plusMethod(a,b);   //[2]
		
		int rst;
		rst=returnMethod();
		System.out.println("[3]"+rst); //[3]
		
		System.out.print("[4]단어를 소문자로 입력하세요= ");
		Scanner sc= new Scanner(System.in);
		String r= sc.next();
		System.out.println("\t"+capitalMethod(r));//[4]
		
		//객체 생성 후 메서드 호출 가능!!!!
		Basic_15 obj= new Basic_15();
		obj.GoodMoning();//[5]
		
	}
}
