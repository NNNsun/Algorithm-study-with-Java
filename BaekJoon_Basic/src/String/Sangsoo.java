package String;

import java.util.Scanner;

public class Sangsoo {
	
	//내가 푼 것보다 더 깔끔한 코드가 있어서 바꿈
	
	public static void main(String[] args) {
		System.out.println("실행");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(); //int로 받아도 reverse()사용 가능
		int num2=sc.nextInt();

		//append()가 있어야 특정 값을 reverse()로 뒤집을 수 있음
		
		num1=Integer.parseInt(new StringBuffer().append(num1).reverse().toString());
		num2=Integer.parseInt(new StringBuffer().append(num1).reverse().toString());
		
		System.out.print(num1>num2?num1:num2); //삼항연사자를 사용하면 한줄로 표현 가능
		
		
	}

}
