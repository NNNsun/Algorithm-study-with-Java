package Question;


class Person7{}
class Batman extends Person7{}

class Human{}
class Superman extends Human{}
public class Basic_28 {

	public static void main(String[] args) {
		Person7[] persons=new Person7[10];//Person7전용ㅜㅜ
		persons[0]=new Person7();
		
		Batman[] batmans=new Batman[10];//Batman전용ㅜㅜ
		batmans[0]=new Batman();
		//batmans[1]=new Person7(); 자식객체배열에서 부모객체 사용x
		
		Human[]humans=new Human[10];
		humans[0]=new Human();
		humans[1]=new Superman();
		
		//매개변수의 다형성
		//	함수나 메서드를 호출할때는 그에 맞는 적절한 파라미터를 보내줘야한다.
		//System.out.println()->어떤 타입,객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력->다형성을 활용하기 있기에 가능!
		//public void println(Object x)로 되어있음
		System.out.println(new Person7());
		System.out.println(new Batman());
		System.out.println(new Human());
		System.out.println(new Superman());
	}

}
