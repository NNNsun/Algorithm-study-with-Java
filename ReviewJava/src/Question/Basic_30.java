package Question;

import java.util.Arrays;

public class Basic_30 {

	public static void main(String[] args) {
		int []ar=new int [10];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=(int)(Math.random()*100);
			//System.out.print(ar[i]+" ");
			//system.out.println((int)(Math.random()*100));
		}
		System.out.println(Arrays.toString(ar));
		int max=ar[0]; 
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max)  max=ar[i];
			else if (ar[i]<min) min=ar[i];
		}
		System.out.println("----------------------------------------");
		System.out.println("가장 큰 값= "+max);
		System.out.println("가장 작은 값= "+min);
	}

}
