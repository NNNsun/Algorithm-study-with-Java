package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeRectangle {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());

		int xMin = Math.min(x, w-x);
		int yMin= Math.min(y,h-y);
		
		System.out.println(Math.min(xMin, yMin));
		
	}

}
