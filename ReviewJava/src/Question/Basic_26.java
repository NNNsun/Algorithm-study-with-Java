package Question;
//������: �θ�Ŭ������ ��ӹ��� �ڽ� Ŭ������ �ν��Ͻ��� �θ��� ��ü�ε� ���ǰ�,
//		�Ӹ��ƴ϶� �ڽ� Ŭ������ ��ü�ε� ���� �� �ִ� �پ��� ��Ȳ�� �ǹ��Ѵ�.
//����Ŭ���� ������ = new ����Ŭ����();

class Person6{
	String str1="�� �θ�Ŭ����";
	void method1() {System.err.println("���̿��̿���");}
	void ppp() {System.out.println("ppp");}
	
}
class Student2 extends Person6{
	String str2="�� �ڽ� Ŭ����";
	void method1() {System.out.println("AAA-���");}//super�޼��� �������̵�
	void sss() {System.out.println("sss");}
	void methodSuper() {super.method1();}//super�� ���� �޼��忡 ����
}

public class Basic_26 {

	public static void main(String[] args) {
		Person6 s1=new Student2();//������->������ �θ��� �ڿ��� ��� ���������� �������̵��� �޼���� �ڽĸ޼���� ����!
		System.out.println(s1.str1);
		//System.out.println(s1.str2); �Ұ���!
		s1.ppp();//ppp
		s1.method1();//�������̵��Ȱ��� �ڽ��� �޼���� ����!!
		
		//�ڽ��� �޼��带 �ٷ� ȣ���ϰ�ʹٸ�?->ĳ��Ʈ�ʿ�
		System.out.println("ĳ��Ʈ ���--------");
		((Student2)s1).sss();
		System.out.println("ĳ��Ʈ ���--------");
				
		//�ڽ�Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼��带 ȣ���ϰ� �ʹٸ�??? super���!
		System.out.println("super���--------");
		Student2 s2 = new Student2();
		s2.methodSuper();
		System.out.println("super���--------");
		
	}

}
