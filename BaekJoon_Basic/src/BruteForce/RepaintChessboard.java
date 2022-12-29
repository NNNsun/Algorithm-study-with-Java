package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepaintChessboard {

	public static boolean[][]ches;
	public static int min =64;
	
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		

		int n= Integer.parseInt(st.nextToken());
		int m= Integer.parseInt(st.nextToken());
		int count=0;
		
		ches=new boolean[n][m];
		for(int i=0;i<n;i++) {
			String str=br.readLine();
			for(int j=0;j<m;j++) {
				if(str.charAt(j)=='W') {
					ches[i][j]=true;
				}else {
					ches[i][j]=false;
				}
			}
		}
		int row=n-7;
		int col=m-7;
		
		//체스판을 쪼갰을때 생기는 작은 체스판의 경우의 수
		for(int i=0; i<row;i++) {
			for (int j=0; j<col;j++) {
				find(i,j);
			}
		}
		System.out.println(min);

	}



	public static void find(int x, int y) { //칠해야하는 칸의 갯수를 알아내는 함수
		int end_x = x+8; //원상복구
		int end_y = y+8; //원상복구
		int count =0;
		
		boolean TF=ches[x][y]; //전역변수라서 데이터가 고스란히 담겨있음,쪼갠후 작아진 체스판의 시작점을 정확히 알수있음
		
		for(int i=x; i<end_x;i++) {
			for(int j=y; j<end_y;j++) {
				if(ches[i][j]!=TF) {
					count++;
				}
				TF=(!TF);
			}
			TF=!TF;
		}
		
		count =Math.min(count,64-count);
		min= Math.min(min, count);
	}
	
	

}
