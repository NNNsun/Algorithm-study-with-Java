package Function;

import java.util.Scanner;

public class Hansoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("½ÇÇà");
		System.out.println(fun(sc.nextInt()));
	}

	public static int fun(int num) {
		int count = 0;
		if(num<100) {
			return num;
		}
		else {
			count=99;
			if(num==1000) {
				num=999;
			}
			
			for(int i=100;i<=num;i++) {
				int hun=i/100; // 123->1
				int ten=(i/10)%10;// 123/10=12, 12%10= 2
				int one =i%10;// 123%10=3
				
				if((hun-ten)==(ten-one)) {
					count++;
				}
			}
			
		}
		return count;
	}
}
