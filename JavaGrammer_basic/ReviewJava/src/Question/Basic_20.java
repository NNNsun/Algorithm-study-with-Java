package Question;
//[1]������: new Ű����� Ŭ������ ��ü�� ������ �� ���� ���� �ڵ������� ȣ��Ǵ� Ư���� �޼����̴�.
	//��ü�� �ʱⰪ�� �����ϴ� �䵵�� ���� ���ȴ�.
	//�����ڸ��� Ŭ������� �����ϰ� �����.
	//��ȯ���� ����.->��ü�� ������ �� ���� ���� ȣ��ȴ�.
	//�����ڴ� �����ε��� �����ϴ�.
	//default �����ڶ�°� �ִ�. ->Ŭ�������� �����ڰ� ���ٸ� default�����ڰ� �ڵ� ȣ��->Ŭ������� �����ϰ�, �޴� ���ڰ�X

//[2]������ ��ġ
	//���� �Ӽ��� �޼��� ���̿� ����Ѵ�.
	//�����ڵ� �޼����̹Ƿ� �޼��� �׷쿡 ���ϴµ� ���� ���� ��ܿ� ��ġ�Ѵ�.

class Person{
	int age;
	String name;
	Person(){};
	Person(int age, String name){
		//this.:��ü �ڱ� �ڽ�->main���� �޾ƿ� ��ü�� ��
		this.age=age;
		this.name=name;
	};
	void printPerson() {
		System.out.println("���� "+age+", �̸�: "+name);
	}
}


public class Basic_20 {

	public static void main(String[] args) {
		Person Men1= new Person(20,"ȫ�浿");
		Person Men2= new Person(30,"�̼���");
		Person Men3= new Person(40,"��������");
		Men1.printPerson();
		Men2.printPerson();
		Men3.printPerson();
		
		
	}

}
