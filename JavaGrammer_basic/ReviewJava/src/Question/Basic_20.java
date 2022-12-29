package Question;
//[1]생성자: new 키워드로 클래스의 객체가 생성될 대 제일 먼저 자동적으로 호출되는 특별한 메서드이다.
	//객체의 초기값을 설정하는 요도로 많이 사용된다.
	//생성자명은 클래스명과 동일하게 만든다.
	//반환값이 없다.->객체가 생성될 때 제일 먼저 호출된다.
	//생성자는 오버로딩이 가능하다.
	//default 생성자라는게 있다. ->클래스내에 생성자가 없다면 default생성자가 자동 호출->클래스명과 동일하고, 받는 인자값X

//[2]생성자 위치
	//보통 속성과 메서드 사이에 기술한다.
	//생성자도 메서드이므로 메서드 그룹에 속하는데 보통 제일 상단에 위치한다.

class Person{
	int age;
	String name;
	Person(){};
	Person(int age, String name){
		//this.:객체 자기 자신->main에서 받아온 객체의 값
		this.age=age;
		this.name=name;
	};
	void printPerson() {
		System.out.println("나이 "+age+", 이름: "+name);
	}
}


public class Basic_20 {

	public static void main(String[] args) {
		Person Men1= new Person(20,"홍길동");
		Person Men2= new Person(30,"이순신");
		Person Men3= new Person(40,"을지문덕");
		Men1.printPerson();
		Men2.printPerson();
		Men3.printPerson();
		
		
	}

}
