package Question;

public class Basic_13 {

	public static void main(String[] args) {

		String[] province = new String[3];// null�� �ʱ�ȭ
		// �����ʱ�ȭ
		province[0] = "������";
		province[1] = "����";
		province[2] = "���";
		// �迭 ����,������ ���� �ʱ�ȭ
		String[] nation = new String[] { "�ѱ�", "�̱�", "�߱�" };
		String[] flower = { "����ȭ", "������", "�عٶ��" };// ������

		for (String str : nation)// �迭�� �ܼ��ϰ� ���� ��½� ���
			System.out.print(str + " ");
		
		System.out.println("\n");
		//2���� �迭
		String[][] asia = { 
				{ "�ѱ�","�Ϻ�","�߱�" }, //System.out.println(asia[0]); �ּҰ����
				{ "�±�","�ε�","��Ʈ��"}, //asia[1]
		};
		System.out.println(asia[1][1]);
		for(int i=0;i<asia.length;i++) {
			for(int j=0; j<asia[i].length;j++)
				System.out.print(asia[i][j]+" ");
			System.out.println();
		}
		
		//charAt()�ż��� ���->�ش��ε����� �ִ� ���� ��ȯ->�ܾ char�迭�� �ѱ��ھ� ���� ����
		String[]strAr= {"hong","kim","park"};
		System.out.println(strAr[0].charAt(2));//hong�� n�� ���
		
		//length: �迭�� ���� vs length(): ���ڿ��� ����,��������!!!!
		
		for(int i=0; i<strAr.length;i++) {
			 //�迭�ȿ� �ѱ��ھ� ����Ҷ�
			 //length�� �ƴ� length()�� ����Ѵ�!!
			for(int j=0; j<strAr[i].length();j++) {
				System.out.println(strAr[i].charAt(j));
			}
		}
		
		
	}

}
