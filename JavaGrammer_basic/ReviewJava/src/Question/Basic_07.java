package Question;

public class Basic_07 {

	public static void main(String[] args) {
		int kor=50, eng=60, math=59;
		int total_score;
		total_score=kor+eng+math;
		
		//if~else if ~else ���ǹ�
		if(total_score>=270) {
			System.out.println("����� ��Ż������ "+total_score+"�Դϴ�. �ſ� ���߾��");
			System.out.println("�����ؿ�");
		}
		else if(total_score>=240) 
			System.out.println("����� ��Ż������ "+total_score+"�Դϴ�.  ���߾��");
		
		else if(total_score>=210)
			System.out.println("����� ��Ż������ "+total_score+"�Դϴ�. ����ϼ���");
		
		else 
			if(math>=60)
				System.out.printf("����� ��Ż������ %d�̰� ���������� %d �Դϴ� ������ 60�̻��̹Ƿ� ���������ڰ� �ƴմϴ�",total_score,math);
			else
				System.out.printf("����� ��Ż������ %d�̰� ���������� %d �Դϴ� ������ 60�̸��̹Ƿ� �����������Դϴ�",total_score,math);
				
	}

}
