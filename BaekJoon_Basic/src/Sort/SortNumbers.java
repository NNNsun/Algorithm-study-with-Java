package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []n= new int [Integer.parseInt(br.readLine())];
		for(int i=0;i<n.length;i++) {
			n[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(n);
		for(int a:n) {
			System.out.println(a);
		}
		
	}

}
