package Question;
//[1]���(Inheritance)�̶�?
//�� �״�� �θ�Ŭ������ ������ �ִ� �Ӽ�(����)��� ����/���(�޼���)���� �״�� �����޾� ���ο� Ŭ������ ����� ��.
//����� Ȱ���ϸ� �������� �͵��� �״�� ���� �ǰ�, �ű⿡ ���ٿ� ���ο� �͸� ����� �ǹǷ� �׸�ŭ ��°� �ð��� ���̺� ��.
//�̶�, �����ްԵǴ� ���� Ŭ������ �θ�Ŭ����(Parent class)�Ǵ� ���� Ŭ����(Super class)��� �θ���.
//��ӹ޾� ���Ӱ� ������� Ŭ������ �� �״�� �ڽ� Ŭ����(Child class) �Ǵ� ����/���� Ŭ����(Sub class)��� �θ���.

//[2]����� ����
//���� ū ����->��Ȱ�뼺!!
//������ ���ο� ���� ����� ���� �ƴ϶� ���� �θ�� ���� ����� �޾� �ʿ��� �͸� �߰��� ���ؼ� ����� ��.
//�θ� Ŭ������ ���ǵǾ��� �ִ� ����ʵ�(����)�� �޼������ �״�� ��ӹ޾� ����ϸ� �ȴ�.
//��ӹ��� �޼���� �ص� �ʿ信 ���� �ڽ� Ŭ�������� �뵵�� �����ؼ� ����ϴ� �͵� ����.

//[3]����� ���
//���� �θ� Ŭ������ Ȯ���Ѵٴ� ����->extends
//�θ� Ŭ������ ����ʵ�,�޼���� ����� �����ϳ� �����ڴ� ����� �ȵȴ�.
//�θ� Ŭ������ ���� ������ private�� ��쿡�� �ƹ��� �ڽ� Ŭ������ ����� �޾Ҵ� �ϴ��� ���� �Ұ���.

class Person2{
	String gender;
	int power;
	Person2(){
		this.gender="Men";  //1:����, 2:����
		this.power=100; //�⺻�Ŀ�
	}
	void walk() {
		System.out.println("�Ȱ� �־��~");
	}
}
class Hero extends Person2{
	String name;
	int age;
	Hero(){};
	Hero(String name,int age){
		super();//�����ص� �����Ϸ��� super class���� �����ͼ� ������ �Ѵ�.
		this.name=name;
		this.age=age;
	}
	void walk() {
		System.out.println("2��� ���� �Ȱ��־��~");
	}
	void eat() {
		System.out.println("��԰� �־��~");
	}
	void displayPerson() {
		System.out.println("�̸�: "+name+", ����: "+age+", ����: "+gender+", �Ŀ�: "+power);
	}
}

public class Basic_21 {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.walk();
		
		Hero h1 = new Hero("���۸�",20);
		h1.displayPerson();
		h1.walk();
		Hero h2 = new Hero("�������",30);
		h2.gender="women";
		h2.power=200;
		h2.displayPerson();
	}

}
