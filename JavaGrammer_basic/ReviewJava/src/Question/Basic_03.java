package Question;

public class Basic_03 {

	public static void main(String[] args) {
		int w; //���� x ������ ���� �ϴ� ���� �̻���
		int x,y,z=50; //z�� �ʱ�ȭ
		
		int x1,y1,z1;
		x1=y1=z1=50; // ����
		System.out.println(x1+" "+y1+" "+z1);
		
		//int x2=y2=z2=30; �Ұ��� ->���� �� �ʱ�ȭ�ϱ�
		
	 //�빮�ڷ� ���̻縦 �ٿ��� �ϴ� �ڷ���(�ҹ��ڰ����ϱ� ��)
		long l=400L;
		float f=3.14F;
	 //formatted, �Ҽ��� %.2f (���� ���ڸ�ŭ ����) \n%n==�ٹٲ�
	 //%o== 8���� , %x==16����
		System.out.printf("%d,%d,%.1f, \nhi%n",x1,y1,f);
	 //	������ ���� ='����'�϶� �ƽ�Ű �ڵ� ���� ��
		short a='A';
		int b='B';
		System.out.println(a);
		System.out.println(b);
	 //	������ ���� = '����'�� �ƽ�Ű�ڵ�->����
		short c=77;
		System.out.println((char)c);
	 //�ƽ�Ű�ڵ峢�� ��� ����
		System.out.println(a*b);
	}

}
