package OneArray;


import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		String[]q=new String[sc.nextInt()];
		
		for(int i=0; i<q.length; i++)
			q[i]=sc.next();
		
		
		for(int i=0; i<q.length;i++) {
			int count=0;
			int sum=0;
			
			for(int j=0; j<q[i].length();j++) {
				if(q[i].charAt(j)=='O') {
					count++;
				}
				else 
					count=0;
				sum+=count;
			}
			
			System.out.println(sum);
		}
		

	}

}
