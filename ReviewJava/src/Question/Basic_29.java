package Question;

import java.util.Arrays;

public class Basic_29 {

	public static void main(String[] args) {
		int[]arr= {4,2,5,36,-2};
		System.out.println(Arrays.toString(arr));
		System.out.println("현재배열내 가장 큰 값은?");
		
		//System.out.println(Math.max(10 ,4 ));//10
		//int max=Integer.MIN_VALUE;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		

	}

}
