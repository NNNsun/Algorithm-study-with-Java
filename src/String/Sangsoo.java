package String;

import java.util.Scanner;

public class Sangsoo {
	
	//���� Ǭ �ͺ��� �� ����� �ڵ尡 �־ �ٲ�
	
	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(); //int�� �޾Ƶ� reverse()��� ����
		int num2=sc.nextInt();

		//append()�� �־�� Ư�� ���� reverse()�� ������ �� ����
		
		num1=Integer.parseInt(new StringBuffer().append(num1).reverse().toString());
		num2=Integer.parseInt(new StringBuffer().append(num1).reverse().toString());
		
		System.out.print(num1>num2?num1:num2); //���׿����ڸ� ����ϸ� ���ٷ� ǥ�� ����
		
		
	}

}
