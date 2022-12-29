package OneArray;


import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args){
		System.out.println("½ÇÇà");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double []score=new double[N];
		double temp=0;
		for(int i=0;i<score.length;i++) {
			score[i]=sc.nextDouble();
		}
		Arrays.sort(score);
		for(int i=0;i<score.length;i++) {
			score[i]=score[i]/score[N-1]*100;
			temp+=score[i];
		}
		System.out.println(temp/N);
		
	}

}
