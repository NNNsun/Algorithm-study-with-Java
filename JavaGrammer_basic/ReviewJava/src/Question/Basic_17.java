package Question;

import java.util.Arrays;

public class Basic_17 {

	public static int[] testMethod() {
		int num1=100;
		int num2=200;
		//return num1, num2; 한번에 두개 이상 리턴 불가능
		return new int[] {num1,num2};
	}
	
	public static String[] change(String a, String b) {
		System.out.println(a+" "+b);
		 a=a.toUpperCase();
		 b=b.toLowerCase();
		 String[] ret = {a,b};
		return ret;
	}
	
	
	
	public static void main(String[] args) {
		int result[]=testMethod();
		
		System.out.println(result[0]+","+result[1]);
		System.out.println(Arrays.toString(result));
		String[]result1=change("korea","USA");
		System.out.println(Arrays.toString(result1));
		
	}

}
