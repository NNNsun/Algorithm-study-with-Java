package Question;


class Person7{}
class Batman extends Person7{}

class Human{}
class Superman extends Human{}
public class Basic_28 {

	public static void main(String[] args) {
		Person7[] persons=new Person7[10];//Person7����̤�
		persons[0]=new Person7();
		
		Batman[] batmans=new Batman[10];//Batman����̤�
		batmans[0]=new Batman();
		//batmans[1]=new Person7(); �ڽİ�ü�迭���� �θ�ü ���x
		
		Human[]humans=new Human[10];
		humans[0]=new Human();
		humans[1]=new Superman();
		
		//�Ű������� ������
		//	�Լ��� �޼��带 ȣ���Ҷ��� �׿� �´� ������ �Ķ���͸� ��������Ѵ�.
		//System.out.println()->� Ÿ��,��ü�� �Ű������� �޴��� �������� �ش� ��ü�� ���� ���->�������� Ȱ���ϱ� �ֱ⿡ ����!
		//public void println(Object x)�� �Ǿ�����
		System.out.println(new Person7());
		System.out.println(new Batman());
		System.out.println(new Human());
		System.out.println(new Superman());
	}

}
