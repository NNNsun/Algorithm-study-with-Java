package Question;
//���׸��ʿ伺
class Person8{
	public Object obj;
	
	Person8(Object obj){this.obj=obj;}
}
class Student3{
	public int grade;
	Student3(int grade){this.grade=grade;}
}
class Teacher{}

public class Basic_39 {

	public static void main(String[] args) {
		//��ü����->���ڿ�+����
		Person8 p1 =new Person8 (new Student3(1));
		//System.out.println(p1.obj);
		//String str = (String)p1.obj; ����ȯ�� �ʿ���
		
		Student3 s1=(Student3)p1.obj;
		Teacher t1 =(Teacher)p1.obj; //������ �ܰ迡���� ������ �ȳ���, �����ϴµ� ClassCast������ �߻��Ѵ�.

	}

}
