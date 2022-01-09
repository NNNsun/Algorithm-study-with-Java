package Question;
//제네릭필요성
class Person8{
	public Object obj;
	
	Person8(Object obj){this.obj=obj;}
}
class Student3{
	public int grade;
	Student3(int grade){this.grade=grade;}
}
class Teacher{}

public class Basic_39 {

	public static void main(String[] args) {
		//객체생성->문자열+숫자
		Person8 p1 =new Person8 (new Student3(1));
		//System.out.println(p1.obj);
		//String str = (String)p1.obj; 형변환이 필요함
		
		Student3 s1=(Student3)p1.obj;
		Teacher t1 =(Teacher)p1.obj; //컴파일 단계에서는 에러가 안나고, 실행하는데 ClassCast오류가 발생한다.

	}

}
