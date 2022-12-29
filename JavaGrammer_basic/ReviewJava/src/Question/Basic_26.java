package Question;
//다형성: 부모클래스를 상속받은 자식 클래스의 인스턴스가 부모의 객체로도 사용되고,
//		뿐만아니라 자식 클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.
//상위클래스 변수명 = new 하위클래스();

class Person6{
	String str1="난 부모클래스";
	void method1() {System.err.println("에이에이에이");}
	void ppp() {System.out.println("ppp");}
	
}
class Student2 extends Person6{
	String str2="난 자식 클래스";
	void method1() {System.out.println("AAA-상속");}//super메서드 오버라이딩
	void sss() {System.out.println("sss");}
	void methodSuper() {super.method1();}//super로 원본 메서드에 접근
}

public class Basic_26 {

	public static void main(String[] args) {
		Person6 s1=new Student2();//다형성->범위는 부모의 자원만 사용 가능하지만 오버라이딩된 메서드는 자식메서드로 실행!
		System.out.println(s1.str1);
		//System.out.println(s1.str2); 불가능!
		s1.ppp();//ppp
		s1.method1();//오버라이딩된것은 자식의 메서드로 실행!!
		
		//자식의 메서드를 바로 호출하고싶다면?->캐스트필요
		System.out.println("캐스트 사용--------");
		((Student2)s1).sss();
		System.out.println("캐스트 사용--------");
				
		//자식클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면??? super사용!
		System.out.println("super사용--------");
		Student2 s2 = new Student2();
		s2.methodSuper();
		System.out.println("super사용--------");
		
	}

}
