package BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		
		int box5=N/5;
		int R=N%5;
		
		if(R==0) {
			System.out.println(box5);
		}else if(R==1&&box5>=1){
			System.out.println((box5-1+2));
		}else if(R==2&&box5>=2){
			System.out.println((box5-2+4));
		}else if(R==3){
			System.out.println((box5+1));
		}else if(R==4&&box5>=1){
			System.out.println((box5-1+3));
		}else {
			System.out.println(-1);
		}

	}

}
