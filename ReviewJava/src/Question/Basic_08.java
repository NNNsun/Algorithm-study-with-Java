package Question;

public class Basic_08 {

	public static void main(String[] args) {
		
		//swich(������,char�� ����, longŸ���� �Ұ���)
		//break, default �ʼ�!!
		int age= 60;
		
		//����� �Է� ����ó��
	
		if(age>10&&age<20) {
			System.out.println("10�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
			//age=10;���� ó�� ����, �� ���!
		}
		else if(age>20&&age<30) {
			System.out.println("20�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
		}
		else if(age>30&&age<40) {
			System.out.println("30�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
		}
		else if(age>40&&age<50) {
			System.out.println("40�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
		}
		else if(age>50&&age<60) {
			System.out.println("50�̶�� �ٽ� ���ɴ븦 �Է����ּ���. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
		}
		else {
			 if(age<10)
			System.out.println("����ڰ� �ƴմϴ�. ���α׷��� �����մϴ�.");
			System.exit(0); //�ý��� ����!
		}
		
		switch(age) {
		case 10:
			System.out.println(age+"�� �Դϴ�. ���� �ڳʴ� A�����Դϴ�.");
			break; //�ʼ�
			
		case 20:
			System.out.println(age+"�� �Դϴ�. ������� �ڳʴ� B�����Դϴ�.");
			break;
		case 30:
			System.out.println(age+"�� �Դϴ�. �ڱ��� �ڳʴ� C�����Դϴ�.");
			break;
		case 40:
			System.out.println(age+"�� �Դϴ�. ����ũ �ڳʴ� D�����Դϴ�.");
			break;
		case 50:
			System.out.println(age+"�� �Դϴ�. ����� �ڳʴ� E�����Դϴ�.");
			break;
		default://������ �Է°� ó��, 60�̻� ���ó���ϱ⶧���� ����ó�� �ʿ����
			System.out.println("60�� �̻� �Դϴ�. �ǰ�/��� �ڳʴ� F�����Դϴ�.");
			break;
		}
		
	}

}
