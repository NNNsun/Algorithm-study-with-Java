package Question;

public class Basic_07 {

	public static void main(String[] args) {
		int kor=50, eng=60, math=59;
		int total_score;
		total_score=kor+eng+math;
		
		//if~else if ~else 조건문
		if(total_score>=270) {
			System.out.println("당신의 토탈점수는 "+total_score+"입니다. 매우 잘했어요");
			System.out.println("축하해요");
		}
		else if(total_score>=240) 
			System.out.println("당신의 토탈점수는 "+total_score+"입니다.  잘했어요");
		
		else if(total_score>=210)
			System.out.println("당신의 토탈점수는 "+total_score+"입니다. 노력하세요");
		
		else 
			if(math>=60)
				System.out.printf("당신의 토탈점수는 %d이고 수학점수는 %d 입니다 수학이 60이상이므로 재수강대상자가 아닙니다",total_score,math);
			else
				System.out.printf("당신의 토탈점수는 %d이고 수학점수는 %d 입니다 수학이 60미만이므로 재수강대상자입니다",total_score,math);
				
	}

}
