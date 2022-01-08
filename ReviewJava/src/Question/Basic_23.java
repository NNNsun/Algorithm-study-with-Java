package Question;
//객체 배열
class Person4{
	private String name;
	private int age;
	Person4(){}
	Person4(String name, int age){
		this.age=age;
		this.name=name;
	}
	public void setName(String name) {this.name=name;} //셋팅할때(set) 인자값을 받아온다->가져올땐(get) 그냥 전달만 하기때문에 인자값 x
	public void setAge(int age) {this.age=age;}
	
	public String getName() {return name;}//가져올때 return을 해야하기 때문에 return type을 지정해준다.
	public int getAge() {return age;}
	
	public void printP() {
		System.out.println("이름: "+getName()+", "+"나이: "+getAge());
	}
}

public class Basic_23 {

	public static void main(String[] args) {
		
		//익숙한 배열꼴
		int[]ar1={1,2,3,4,5};
		char[]ar2= {'a','b','c','d','e'};
		
		//객체배열
		
		Person4[] pa= new Person4[5];
		System.out.println("---------------------");
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person4(i+"번 후보자",i+30);//i만 보내면 안되지만, i와 문자열을 같이 전달하면 문자열로 인식
			pa[i].printP();
		}
		System.out.println("---------------------");
		System.out.println(pa[0].getName()+" -> 나이: "+pa[0].getAge());
		/*pa[0]=new Person4("홍길동",30); //new Person4를 사용해서 객체 정보 설정
		pa[1]=new Person4("이순신",20);
		pa[2]=new Person4("을지문덕",40);
		pa[3]=new Person4("장영실",50);
	    pa[4]=new Person4("신사임당",10);*/
		
		/*
		 * System.out.println("---------------------"); for(int i=0;i<pa.length;i++) {
		 * pa[i].printP(); System.out.println("---------------------"); }
		 */
	}

}
