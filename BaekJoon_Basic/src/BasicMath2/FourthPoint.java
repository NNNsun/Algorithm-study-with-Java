package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourthPoint {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int []point_1= {
				Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st=new StringTokenizer(br.readLine(), " ");
		int []point_2= {
				Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
		st=new StringTokenizer(br.readLine(), " ");
		int []point_3= {
				Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};

		int x, y;
		
		x=(point_1[0]==point_2[0])?point_3[0]:((point_1[0]==point_3[0])?point_2[0]:point_1[0]);
		y=(point_1[1]==point_2[1])?point_3[1]:((point_1[1]==point_3[1])?point_2[1]:point_1[1]);
		System.out.println(x+" "+y);
		
	}

}
