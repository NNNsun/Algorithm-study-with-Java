package Question;
//[1]상속(Inheritance)이란?
//말 그대로 부모클래스가 가지고 있는 속성(변수)들과 동작/기능(메서드)들을 그대로 물려받아 새로운 클래스를 만드는 것.
//상속을 활용하면 물려받은 것들은 그대로 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 세이브 됨.
//이때, 물려받게되는 원본 클래스를 부모클래스(Parent class)또는 슈퍼 클래스(Super class)라고 부른다.
//상속받아 새롭게 만들어진 클래스는 말 그대로 자식 클래스(Child class) 또는 서브/하위 클래스(Sub class)라고 부른다.

//[2]상속의 장점
//가장 큰 장점->재활용성!!
//완전히 새로운 것을 만드는 것이 아니라 기존 부모로 부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것.
//부모 클래스에 정의되어져 있는 멤버필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.
//상속받은 메서드라 해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능.

//[3]상속의 사용
//기존 부모 클래스를 확장한다는 개념->extends
//부모 클래스의 멤버필드,메서드는 상속이 가능하나 생성자는 상속이 안된다.
//부모 클래스의 접근 제한자 private인 경우에는 아무리 자식 클래스가 상속을 받았다 하더라도 접근 불가능.

class Person2{
	String gender;
	int power;
	Person2(){
		this.gender="Men";  //1:남성, 2:여성
		this.power=100; //기본파워
	}
	void walk() {
		System.out.println("걷고 있어요~");
	}
}
class Hero extends Person2{
	String name;
	int age;
	Hero(){};
	Hero(String name,int age){
		super();//생략해도 컴파일러가 super class에서 가져와서 컴파일 한다.
		this.name=name;
		this.age=age;
	}
	void walk() {
		System.out.println("2배로 빨리 걷고있어요~");
	}
	void eat() {
		System.out.println("밥먹고 있어요~");
	}
	void displayPerson() {
		System.out.println("이름: "+name+", 나이: "+age+", 성별: "+gender+", 파워: "+power);
	}
}

public class Basic_21 {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.walk();
		
		Hero h1 = new Hero("슈퍼맨",20);
		h1.displayPerson();
		h1.walk();
		Hero h2 = new Hero("원더우먼",30);
		h2.gender="women";
		h2.power=200;
		h2.displayPerson();
	}

}
