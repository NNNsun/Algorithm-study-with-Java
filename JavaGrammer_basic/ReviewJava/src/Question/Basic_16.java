package Question;

class TestNumber{
	int num;
	TestNumber(int num){this.num=num;}
}

public class Basic_16 {
	//Call by value->값에 의해서 (메서드를)호출
	//메서드로 인자값을 넘길 때 해당 값을 복사하여 넘기는 방식->sum()메서드 내부에서 복사된 값으로 처리한다.
	public static void sum_value(int a) {
		a+=400;
		System.out.println(a); //500
	}
	
	/*
	 * public static void sum_reference_1(Basic_16 a) {
	 * 
	 * System.out.println(a); }
	 */
	public static int sum_reference(TestNumber a) {
		a.num+=400;
		return a.num;
	}
	
	
	
	public static void main(String[] args) {
		
		int a=100;
		sum_value(a);
		System.out.println("[1]Call by value "+a); //100
		// Wrapper클래스의 Integer클래스로 a 선언하고 new로 객체를 생성하여 주소값을 메서드로 보낸다? (x)
		//Integer k =new Integer(100);
		
		// Basic_16 b = new Basic_16();
		// sum_reference_1(a);
		
		TestNumber c = new TestNumber(100);//Call by reference
		System.out.println("[2]Call by reference "+sum_reference(c));
		
		
	}

}
