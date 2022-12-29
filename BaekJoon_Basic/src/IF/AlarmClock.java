package IF;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		
		if(b<45) {
			a--;
			b=60-(45-b);
			if(a<0){
				a=23;
			}
			System.out.println(a+" "+b);
		}
		else System.out.println(a+" "+(b-45));
	}

}
