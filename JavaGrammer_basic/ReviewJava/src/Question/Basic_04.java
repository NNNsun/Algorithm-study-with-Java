package Question;

public class Basic_04 {

	public static void main(String[] args) {
		int a=12345;
		//String str="12345";
		
		//����->���ڿ�
		String str=String.valueOf(a);
		System.out.println(str.length());//5
		//���ڿ�+������->�״�� �ٿ���
		System.out.println(12345+1);//12346
		System.out.println(str+1);//123451
		//���ڿ�->������
		int b=Integer.valueOf(str);
		System.out.println(b);
		//���ϴ°�:12345 ���� �����°�: 123451
		System.out.println("��ȣ����ϴ� ����"+b+1);//(str+int)+str->str+str=str
		System.out.println("��ȣ����ϴ� ����"+(b+1));//��ȣ�� �ذ�
	}

}
