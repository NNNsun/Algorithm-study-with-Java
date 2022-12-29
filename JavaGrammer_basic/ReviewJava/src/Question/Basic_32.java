package Question;

import java.util.Arrays;
import java.util.Collections;

public class Basic_32 {

	public static void main(String[] args) {
		//기본형타입은 sort내림차순 불가능(큰값부터 출력)
		Integer[]score=new Integer[10];
		for(int i=0;i<score.length;i++) score[i]=(int)(Math.random()*100);
		System.out.print("정렬 전= ");
		System.out.println(Arrays.toString(score));
		Arrays.sort(score,Collections.reverseOrder());
		System.out.print("정렬 후= ");
		System.out.println(Arrays.toString(score));
	}

}
