package Question;
//��ü �迭
class Person4{
	private String name;
	private int age;
	Person4(){}
	Person4(String name, int age){
		this.age=age;
		this.name=name;
	}
	public void setName(String name) {this.name=name;} //�����Ҷ�(set) ���ڰ��� �޾ƿ´�->�����ö�(get) �׳� ���޸� �ϱ⶧���� ���ڰ� x
	public void setAge(int age) {this.age=age;}
	
	public String getName() {return name;}//�����ö� return�� �ؾ��ϱ� ������ return type�� �������ش�.
	public int getAge() {return age;}
	
	public void printP() {
		System.out.println("�̸�: "+getName()+", "+"����: "+getAge());
	}
}

public class Basic_23 {

	public static void main(String[] args) {
		
		//�ͼ��� �迭��
		int[]ar1={1,2,3,4,5};
		char[]ar2= {'a','b','c','d','e'};
		
		//��ü�迭
		
		Person4[] pa= new Person4[5];
		System.out.println("---------------------");
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person4(i+"�� �ĺ���",i+30);//i�� ������ �ȵ�����, i�� ���ڿ��� ���� �����ϸ� ���ڿ��� �ν�
			pa[i].printP();
		}
		System.out.println("---------------------");
		System.out.println(pa[0].getName()+" -> ����: "+pa[0].getAge());
		/*pa[0]=new Person4("ȫ�浿",30); //new Person4�� ����ؼ� ��ü ���� ����
		pa[1]=new Person4("�̼���",20);
		pa[2]=new Person4("��������",40);
		pa[3]=new Person4("�念��",50);
	    pa[4]=new Person4("�Ż��Ӵ�",10);*/
		
		/*
		 * System.out.println("---------------------"); for(int i=0;i<pa.length;i++) {
		 * pa[i].printP(); System.out.println("---------------------"); }
		 */
	}

}
