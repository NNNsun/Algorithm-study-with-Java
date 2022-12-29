package Question;

//�������̽�: ū Ʋ-> ���ΰ��� ����� �����ϰ� �ϴ� ��.
//�������̽�==�԰�, ǥ��ȭ ����

//�߻�Ŭ���� vs �������̽�
//	����ϳ� �������̽��� �߻�ȭ ������ �� �����ϴ�.->�������̽��� �Ϲ� ����ʵ�, �޼��带 ����������.->��ӹ��� Ŭ������ �������̽��� �޼��带 �����ؾ��Ѵ�!
//	�������̽� ���� ���, ���߻���� �����ϴ�!!
//interface, implement
//����: �޼����� �߻����� '����'�� �޼������ ��ü���� '����'�κ��� �и��Ҽ��ִ�!!
//�о�ȭ�� �ý����� �����Ͽ� ���� ���� ���������� ������Ʈ ������ �س������ִ�!
//�켱����(extends vs implements) extends�� �׻� ���� ���δ�.
//class Student extends person implements A,B

class Person5{
	String name;
	int age;
	int weight;
	
	Person5(){}
	Person5(String name,int age,int weight){
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	void wash() {System.out.println("�Ĵ�.");}
	void study() {System.out.println("�����ϴ�.");}
	void play() {System.out.println("���.");}
}

interface Allowance{
	
	//public static final->������ �ȵ����� ����� ����, public static final ��������
	public static final String aaa="�ڸ���";
	int bbb=100;
	
	//abstract �޼��常 ��밡��
	//�������̽� �� ��� �޼���� public abstract�̾�� ��->��������
	//body�� ������ ����
	public abstract void in(int price, String name);
	void out(int price, String name);
}
interface Train{
	abstract void train(int training_pay, String name);
}


class Student extends Person5 implements Allowance, Train{
	Student(){}
	Student(String name, int age, int weight){
		//super�����ڴ� ��� ���� 
		super(name, age, weight);
	}
	public void in(int price, String name) {System.out.printf("%s���� %d�� �뵷�� �޾ҽ��ϴ�.\n",name,price);}
	public void out(int price, String name) {System.out.printf("%d�� �ݾ��� �����߽��ϴ�.[����뵵->%s]\n",price,name);}
	public void train(int training_pay,String name) {System.out.printf("[%s->%d��] �ԱݿϷ�\n",name,training_pay);}
}





public class Basic_25 {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿",25,70);
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "����");
		s1.out(5000, "������");
		s1.train(4000,"�ƺ�");
		
		//����ʵ� ����ϱ�
		System.out.println(s1.aaa);
		System.out.println(Allowance.bbb);
		
	}

}
