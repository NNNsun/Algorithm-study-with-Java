package Question;

import java.util.Arrays;

public class Basic_31 {

	public static void main(String[] args) {
		
		int [] arr2= new int[8];
		for(int i=0;i<arr2.length;i++) arr2[i]=(int)(Math.random()*100);
		System.out.println("------------------정렬전-------------------");
		for(int i:arr2) System.out.print(i+" ");
		System.out.println();
		Arrays.sort(arr2);
		System.out.println("------------------정렬후-------------------");
		System.out.println(Arrays.toString(arr2));
	} 
	
}
