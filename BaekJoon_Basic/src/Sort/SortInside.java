package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class SortInside {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int length = n.length();
		int num = Integer.parseInt(n);
		Integer[] arr = new Integer[length];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=num%10;
			num=num/10;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(Integer s : arr) {
			System.out.print(s);
		}
	}

}
