package basic;

import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");
		Scanner sc2 = new Scanner(System.in);
		
		int num = sc2.nextInt();
		int k=0;
		int []random=new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("���� �Է��ϼ���"+"["+i+"]");
			k=sc2.nextInt();
			random[i]=k;
		}
		for(int i=1;i<random.length;i++) {
			if(random[0]>random[i]) {
				random[0]=random[i];
			}
		}
		System.out.println(random[0]);
	}

}
