package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class SortNumbers2 {

	public static void main(String[] args) throws  IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n= Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}

}
