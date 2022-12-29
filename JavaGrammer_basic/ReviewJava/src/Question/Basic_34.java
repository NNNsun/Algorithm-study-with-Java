package Question;

import java.util.Arrays;

//빈도수 구하기 algorithm
//ex) 반장 선거의 득표 수
public class Basic_34 {

	public static void main(String[] args) {
		
		int[] target= {1,3,3,2,1,1,3,0,1,2};
		int[] ar=new int [4];
		
		for(int i=0; i<target.length;i++) {ar[target[i]]++;}
		System.out.println(Arrays.toString(ar));
	}
}
