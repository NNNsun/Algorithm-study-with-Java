package Question;

import java.util.Arrays;
//��������ϱ�
public class Basic_46 {

	public static void main(String[] args) {
		int []arr8=new int [10];
		for(int i=0; i<arr8.length;i++) {
			arr8[i]=(int)(Math.random()*10+1);
		}
		System.out.println(Arrays.toString(arr8));
	}
}
