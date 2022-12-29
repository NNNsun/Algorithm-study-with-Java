package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {

	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
	
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			System.out.println(countPoint(x1,y1, r1, x2, y2, r2));
		}

	}

	public static int countPoint(int a1,int b1,int dist1,int a2,int b2,int dist2) {
		
		//제곱하기때문에 절대값을 씌운거나 다름없음(작은것-큰것을 고려할 필요가 없다.)
		int distance_xy = (int)(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
		
		
		//접점이 무한대인 경우
		if(a1==a2&&b1==b2&&dist1==dist2) 
			return -1;
		
		//접점이 없는 경우, 두 반지름 합(distance_xy)>d+d
		else if(distance_xy>Math.pow(dist2+dist1,2))
			return 0;
		
		//원안에 원이 있지만 내접하지 않는 경우
		else if (distance_xy<Math.pow(dist2-dist1,2))
			return 0;
		
		//내접하는 경우
		else if (distance_xy==Math.pow(dist2-dist1,2))
			return 1;
		
		//한곳 외접
		else if(distance_xy==Math.pow(dist2+dist1,2))
			return 1;
		//나머지 두곳 외접
		else return 2;
	}
}
