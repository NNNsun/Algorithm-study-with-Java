package Question;
//추상클래스(abstract) : 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언->return값 조차도 없이 메서드명만 선언.
//추상클래스를 상속받으면 무조건 추상메소드를 강제적으로 사용해야한다!!
//추상클래스를 사용하는 이유
//:부모클래스가 선언해놓은 메서드를 상속받은 자식 클래스들이 이름 그대로 재정의해서 구현하라고 강제하는 것이다.
//	상속받은 자식 클래스 입장에서는 자칫 상속만 받고 재정의해서 사용을 안할 수도 있기때문이다.
//	->일반 멤서드로 구현하면 누군가는 해당 메서드를 구현 안 할수도있다.
//	무조건 상속받은 자식 클래스 입장에서는 추상 메서드를 재정의해서 구현하도록 강제하기 위함이다.
//꼭, 재정의를 해야한다.
//재정의를 하고싶지않다면->자식클래스에서 상속받은 추상메서드를 구현하지 않는다면 자식 클래스도 abstract를 붙여서 추상으로 만들어야한다. 
//분업화된 시스템에서 공통의 프로젝트를 진행할때 많이 사용되는 중요한 문법이다.

abstract class Animal{
	//추상메서드가 없어도 에러가 나지않는다.
	abstract void cry();
	
	//추상클래스도 일반 메서드를 가질수있다.
	void eat() {System.out.println("먹다");}
}

class Dog extends Animal{
	void cry() {System.out.println("멍멍~");}
	//재정의하지않으면 Err
}
class Cat extends Animal{
	void cry() {System.out.println("야옹~");}
}
class Cow extends Animal{
	void cry() {System.out.println("음메~");}
}

public class Basic_24 {

	public static void main(String[] args) {
		//[1] 추상클래스는 구체적인 내용이 없기때문에 객체를 생성할수없다.
		//[2] 추상클래스는 자식클래스가 상속을 받아서 사용, 오버라이딩 개념
		
		Dog dog = new Dog();
		dog.cry();
		Cat cat = new Cat();
		cat.cry();
		Cow cow = new Cow();
		cow.cry();
		
	}

}
