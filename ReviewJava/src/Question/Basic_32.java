package Question;

import java.util.Arrays;
import java.util.Collections;

public class Basic_32 {

	public static void main(String[] args) {
		//�⺻��Ÿ���� sort�������� �Ұ���(ū������ ���)
		Integer[]score=new Integer[10];
		for(int i=0;i<score.length;i++) score[i]=(int)(Math.random()*100);
		System.out.print("���� ��= ");
		System.out.println(Arrays.toString(score));
		Arrays.sort(score,Collections.reverseOrder());
		System.out.print("���� ��= ");
		System.out.println(Arrays.toString(score));
	}

}
