package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeStar5 {
	static char[][]arr;
	public static void main(String[] args) throws IOException {
		System.out.println("실행");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr=new char[n][n];
		
		getStar5(0,0,n,false);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

	static void getStar5(int x, int y, int n, boolean b) {
		if(b) {
			for(int i=x;i<x+n;i++) {
				//System.out.println(x);
				for(int j=y;j<y+n;j++) {
					//System.out.println(y);
					arr[i][j]=' ';
				}
			}
			return;
		}
		//더이상 쪼갤수 없는 블록
		if(n==1) {
			arr[x][y]='*';
			//System.out.println(x+","+y);
			return;
		}
		
		//size: 해당블록의 한간을 담을 변수
		//count: 별의 누적
		int size=n/3;
		int count =0;
		for(int i=x; i<x+n;i+=size) {
			//System.out.println(x);
			for(int j=y;j<y+n;j+=size) {
				//System.out.println(y);
				count++;
				if(count==5) {
					getStar5(i,j,size,true);
				}else {
					getStar5(i,j,size,false);
				}
			}
		}

	}

}
