package Question;

import java.util.ArrayList;

public class Basic_42 {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<String>();
		//[1]����Ʈ �߰�
		list2.add("ȫ�浿");
		list2.add("�̼���");
		list2.add("������");
		list2.add("��������");
		list2.add("������");
		//System.out.println(list2.get(3));//������
		//String str=list2.get(0); ����ȯ �ʿ���� ���
		
		//[2] ����
		list2.set(3, "¡Ű��ĭ");//��������->¡Ű��ĭ
		System.out.println(list2.get(3));//¡Ű��ĭ
		
		//[3]����->�����ϸ� �������� �δ� ���� �ƴ϶� ��ġ�� �մ����
		list2.remove(3);
		System.out.println("[3]---------[������ ���]");
		System.out.println(list2.get(0)); //ȫ�浿
		System.out.println(list2.get(1)); //�̼���
		System.out.println(list2.get(2)); //������ 
		System.out.println(list2.get(3)); //������
		System.out.println("------------[������ ���]");
		
		//[4]���
		System.out.println();
		System.out.println("[4]���");
		for(String s : list2) {System.out.println(s);}
		
		
		//[5]�ѹ��� ����
		list2.removeAll(list2);
		System.out.println("[5]��ü ����"+(list2.size()));//0
		
		
		
	}

}
