package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyAlpha {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			
			int x= Integer.parseInt(st.nextToken());
			int y= Integer.parseInt(st.nextToken());
			int dist=y-x;
			
			int max=(int)Math.sqrt(dist);
			if(max==Math.sqrt(dist)) {
				sb.append(max*2-1).append('\n');
			}
			else if(dist <=max*max+max) {
				sb.append(max*2).append('\n');
			}
			else {
				sb.append(max*2+1).append('\n');
			}
		}
		System.out.println(sb);

	}

}
