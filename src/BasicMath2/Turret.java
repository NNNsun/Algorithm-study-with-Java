package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {

	public static void main(String[] args) throws IOException {
		System.out.println("����");
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
		
		//�����ϱ⶧���� ���밪�� ����ų� �ٸ�����(������-ū���� ����� �ʿ䰡 ����.)
		int distance_xy = (int)(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
		
		
		//������ ���Ѵ��� ���
		if(a1==a2&&b1==b2&&dist1==dist2) 
			return -1;
		
		//������ ���� ���, �� ������ ��(distance_xy)>d+d
		else if(distance_xy>Math.pow(dist2+dist1,2))
			return 0;
		
		//���ȿ� ���� ������ �������� �ʴ� ���
		else if (distance_xy<Math.pow(dist2-dist1,2))
			return 0;
		
		//�����ϴ� ���
		else if (distance_xy==Math.pow(dist2-dist1,2))
			return 1;
		
		//�Ѱ� ����
		else if(distance_xy==Math.pow(dist2+dist1,2))
			return 1;
		//������ �ΰ� ����
		else return 2;
	}
}
