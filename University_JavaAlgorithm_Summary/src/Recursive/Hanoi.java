package Recursive;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int num, int from, int to, int other) {//����,���۱��,��ǥ���,���������
		if(num==0)return ;
		move(num-1,from,other,to);
		System.out.println("["+num+"]��°�� ������ ["+from+"]������ ["+to+"]�� �ű��.");
		move(num-1,other,to,from);
	}
	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��� �ּ���: ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int start=1;
		int destination=3;
		int temp=2;
		System.out.println("�� ���� [1]��° �����Դϴ�.");
		move(x,start,destination,temp);
	}

}
