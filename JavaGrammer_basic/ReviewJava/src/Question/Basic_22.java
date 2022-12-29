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
	
	public String getName() {return name;}//private 값 가져오기
	public void setName(String name) {this.name=name;}//private 값 세팅하기
	
	public int getAge() {return age;}
	public void  setAge(int age) {this.age=age;}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height=height;}
	
	public int getWeight() {return weight;}
	public void setWeight(int weight) {this.weight=weight;}
	
	public void move() {
		System.out.println("움직이고 있어요~");
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
		System.out.println("악당 이름: "+getName());
		System.out.println("악당 나이: "+getAge()+" 살");
		System.out.println("악당 키: "+getHeight()+" Cm");
		System.out.println("악당 체중: "+getWeight()+" Kg");
		System.out.println("악당 넘버: "+getUnique_key());
		System.out.println("악당 무기: "+getWeaponName(getWeapon()));//메소드안에 메소드 입력 가능 getWeapon()=int 번호
		System.out.println("악당 파워: "+getPower());
		System.out.println("--------------------------------------");
	};
	
	public String getWeaponName(int a) {
		String weapon;
		switch(a) {
		case 1:
			weapon="창";
			break;
		case 2:
			weapon="칼";
			break;
		case 3:
			weapon="방패";
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
		Villain v1= new Villain("좀비",20,180,70,"123452",2,99.5);
		Villain v2= new Villain("도깨비",30,175,40,"533234",1,67);
		v1.printPerson3();
		System.out.print(v1.getName()+"");
		v1.move();
		v2.printPerson3();
		System.out.print(v2.getName()+"");
		v2.move();
	}

}
