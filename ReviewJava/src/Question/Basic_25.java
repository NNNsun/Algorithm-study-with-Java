package Question;

//인터페이스: 큰 틀-> 서로간의 통신을 가능하게 하는 것.
//인터페이스==규격, 표준화 제공

//추상클래스 vs 인터페이스
//	비슷하나 인터페이스가 추상화 정도가 더 엄격하다.->인터페이스는 일반 멤버필드, 메서드를 가질수없다.->상속받은 클래스는 인터페이스의 메서드를 구현해야한다!
//	인터페이스 간의 상속, 다중상속이 가능하다!!
//interface, implement
//장점: 메서드의 추상적인 '선언'과 메서드들의 구체적인 '구현'부분을 분리할수있다!!
//분업화된 시스템을 구축하여 갑과 을이 독립적으로 프로젝트 개발을 해나갈수있다!
//우선순위(extends vs implements) extends가 항상 먼저 쓰인다.
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
	void wash() {System.out.println("씻다.");}
	void study() {System.out.println("공부하다.");}
	void play() {System.out.println("놀다.");}
}

interface Allowance{
	
	//public static final->변수는 안되지만 상수는 가능, public static final 생략가능
	public static final String aaa="코리아";
	int bbb=100;
	
	//abstract 메서드만 사용가능
	//인터페이스 내 모든 메서드는 public abstract이어야 함->생략가능
	//body가 있으면 에러
	public abstract void in(int price, String name);
	void out(int price, String name);
}
interface Train{
	abstract void train(int training_pay, String name);
}


class Student extends Person5 implements Allowance, Train{
	Student(){}
	Student(String name, int age, int weight){
		//super생성자는 없어도 무관 
		super(name, age, weight);
	}
	public void in(int price, String name) {System.out.printf("%s한테 %d원 용돈을 받았습니다.\n",name,price);}
	public void out(int price, String name) {System.out.printf("%d의 금액을 지출했습니다.[지출용도->%s]\n",price,name);}
	public void train(int training_pay,String name) {System.out.printf("[%s->%d원] 입금완료\n",name,training_pay);}
}





public class Basic_25 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",25,70);
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "엄마");
		s1.out(5000, "편의점");
		s1.train(4000,"아빠");
		
		//상수필드 사용하기
		System.out.println(s1.aaa);
		System.out.println(Allowance.bbb);
		
	}

}
