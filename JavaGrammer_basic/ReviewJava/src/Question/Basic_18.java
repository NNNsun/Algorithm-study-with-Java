package Question;
//class : 객체(인스턴스)를 생성하는 하나의 공장
		//특징과 동작에 많은 시간을 들이고 집중하면서 설계해야한다.
		//객체의 특징->속성(attribute)
		//객체의 동작->메서드(method)

//1. 하나의 파일에 2개이상의 클래스를 작성할 수 있다.
//2. 3개의 클래스가 있다면 자바 파일명이 될 수 있는 것은 public 키워드가 붙은 클래스이다.
//3. 하나의 파일에 있는 3개의 클래스에 모두 public을 붙일수는 없다.
//4. 하나의 파일에 있는 3개의 클래스에 모두 public를 안붙일수 있다.
//5. 하나의 파일에 있는 3개의 클래스에 모두 public가 없다면 클래스 중 어느것이라도 파일명이 될수있다.
//6. 자바 파일에 클래스가 한개 있다면 클래스명이 곧 파일명이 되어야 한다.

class FarmMachine{
	//[1]속성
	int price;
	int year;
	String color;
	//[2]동작
	public void move(){
		System.out.println("Farm-machine is moving");
	}
	public void dig(){
		System.out.println("Farm-machine is digging");
	}
	public void grind(){
		System.out.println("Farm-machine is grinding");
	}
}


public class Basic_18 {

	public static void main(String[] args) {
		FarmMachine M =new FarmMachine();
		M.price=1000000;
		M.year=2020;
		M.color="Red";
		//String M_price=String.format("%,d", 1000000);//String.format :1,000,000
		System.out.println(String.format("%,d won",M.price)+"\n"+M.color+"\n"+M.year);
		M.move();
		M.dig();
		M.grind();
		
	}

}
