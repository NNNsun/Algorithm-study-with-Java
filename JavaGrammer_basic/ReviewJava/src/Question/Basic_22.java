package Question;
//getter, setter
class Person3{
	private String name;
	private int age;
	private int height;
	private int weight;
	int power;
	
	Person3(){}
	Person3(String name, int age, int height, int weight){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	};
	
	public String getName() {return name;}//private �� ��������
	public void setName(String name) {this.name=name;}//private �� �����ϱ�
	
	public int getAge() {return age;}
	public void  setAge(int age) {this.age=age;}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height=height;}
	
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight=weight;}
	
	public void move() {
		System.out.println("�����̰� �־��~");
	}
}
class Villain extends Person3{
	private String unique_key;
	private int weapon;
	private double power;
	
	 Villain() {}
	 Villain(String name, int age, int height, int weight,String unique_key,int weapon,double power) {
		 super( name, age, height, weight);
		 this.unique_key=unique_key;
		 this.weapon=weapon;
		 this.power=power;
		 
	 }
	
	
	public String getUnique_key() {return unique_key;}
	public int getWeapon() {return weapon;}
	public double getPower() {return power;}
	
	
	public void setUnique_key(String unique_key) {this.unique_key=unique_key;}
	public void setWeapon(int weapon) {this.weapon= weapon;}
	public void setPower(double power) {this.power= power;}
	
	
	
	
	public void printPerson3() {
		System.out.println("--------------------------------------");
		System.out.println("�Ǵ� �̸�: "+getName());
		System.out.println("�Ǵ� ����: "+getAge()+" ��");
		System.out.println("�Ǵ� Ű: "+getHeight()+" Cm");
		System.out.println("�Ǵ� ü��: "+getWeight()+" Kg");
		System.out.println("�Ǵ� �ѹ�: "+getUnique_key());
		System.out.println("�Ǵ� ����: "+getWeaponName(getWeapon()));//�޼ҵ�ȿ� �޼ҵ� �Է� ���� getWeapon()=int ��ȣ
		System.out.println("�Ǵ� �Ŀ�: "+getPower());
		System.out.println("--------------------------------------");
	};
	
	public String getWeaponName(int a) {
		String weapon;
		switch(a) {
		case 1:
			weapon="â";
			break;
		case 2:
			weapon="Į";
			break;
		case 3:
			weapon="����";
			break;
		default:
			weapon="------";
			break;
		}
		return weapon;
	}
}


public class Basic_22 {

	public static void main(String[] args) {
		Villain v1= new Villain("����",20,180,70,"123452",2,99.5);
		Villain v2= new Villain("������",30,175,40,"533234",1,67);
		v1.printPerson3();
		System.out.print(v1.getName()+"");
		v1.move();
		v2.printPerson3();
		System.out.print(v2.getName()+"");
		v2.move();
	}

}
