package Question;

import java.util.Arrays;
//ranking algorithm
public class Basic_33 {

	public static void main(String[] args) {
		int[]scores=new int[5];
		int[]rank=new int[scores.length];
		for(int i=0;i<scores.length;i++) scores[i]=(int)(Math.random()*100);
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			rank[i]=1;
			for(int j=0;j<scores.length;j++) {
				//System.out.println(scores[i]+"-"+scores[j]); ���ϴ� ���� ������ Ȯ���ϱ�
				if(scores[i]<scores[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0;i<scores.length;i++) {
			
			System.out.println(scores[i]+" ��"+" --> "+rank[i]+"��");
		}
		
	}

}
