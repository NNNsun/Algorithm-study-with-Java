package Question;

import java.util.Arrays;

public class Basic_38 {

	public static void main(String[] args) {
		int[] candidate=new int[3];
		int[] student=new int[10];
		for(int i=0;i<student.length;i++) {
			student[i]=(int)(Math.random()*3);
			System.out.print(student[i]+" ");
			candidate[student[i]]++;
		}
		
			int max=candidate[0];
			int min=candidate[0];
			int j=0;
			int k=0;
				for(int i=0;i<candidate.length;i++) {
					if(max<candidate[i]) {
						max=candidate[i];
						j=i;
					}
					if(min>candidate[i]){
						min=candidate[i];
						k=i;
					}
				}
		System.out.println();
		System.out.println(Arrays.toString(candidate));
		System.out.print("최다 득표 후보자: "+(j+1)+"  득표수: "+max);
		if(max>=(student.length/2)) System.out.println("  당선이 되었습니다.");
		else System.out.println("   당선된 후보가 없습니다.");
		System.out.println("가장 적게 득표를 한 후보자: "+(k+1)+"   득표수: "+candidate[0]);
	}

}
