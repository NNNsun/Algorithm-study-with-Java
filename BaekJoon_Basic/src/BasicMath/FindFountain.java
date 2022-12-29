package BasicMath;

import java.util.Scanner;

public class FindFountain {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int small_count=0;
		int big_count=small_count;
		while(true) {
			small_count++;
			big_count+=small_count;
			if(n<=big_count) {
				if(small_count%2==0) {
					System.out.println((small_count-(big_count-n))+"/"+((big_count-n)+1));
					break;
				}
				else{
					System.out.println(((big_count-n)+1)+"/"+(small_count-(big_count-n)));
					break;
				}
			}
			
		}

	}

}
