package Question;

public class Basic_09 {

	public static void main(String[] args) {
		//���׿�����= ����Ҽ��� ���� �ڵ�, ���ʿ��� �������� ����
		int hour=10;
		
		hour = hour<=10?hour*100:hour; //�ݷ����� ������. ��:����
		System.out.println(hour);
		
		//��ȯ�Ǵ� ���� ������ ���ڿ��̳�
		//hour=hour<12?"����":"����"; -> �����߻�
		String ampm=hour<12?"����":"����";
		System.out.println("�ð���: "+ampm);
		
	}

}
