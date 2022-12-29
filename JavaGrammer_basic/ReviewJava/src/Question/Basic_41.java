package Question;
//컬렉션: 데이터 값들을 담는 여러 그릇, 용도별로 그릇이 있듯이 어떤 자료구조 데이터를 저장하고 관리할 것인지에 따라서 맞는 그릇을 써야한다.
//컬렉션 프레임 워크를 크게봤을때, Collection과 Map으로 나뉘고 이둘은 Interface로 되어있다.
//Collection은 List와 Set으로 나뉜다.(이들도 인터페이스)->이드릉ㄹ 상속받아 다양한 형태의 배열(그릇,클래스)로 사용된다.
//List,Set 인터페이스 상속->List(중복허용o)계열 구현 클래스 vs Set(중복허용x)계열 구현 클래스
//List->ArrayList,LinkedList,Vector,Stack
//Set->HashSet,SortedSet,TreeSet
//List인터페이스를 상속하는 클래스들 특징 ->인덱스가 있고, (그래서)저장순서가 유지, 데이터 중복 허용
//Set인터페이스를 상속하는 클래스들 특징 ->데이터중복 X

import java.util.ArrayList;


//ArrayList:필요시 언제든 추가, 삭제 가능,import java.util.ArrayList 필요
//제네릭 문법 사용가능,제네릭사용하지않은면 내부적으로 Object타입으로 처리된다.(형변환 해야한다는 단점이 있음)
//vs배열:크기를 미리 지정하고 사용->유연한 메모리관리x



public class Basic_41 {

	public static void main(String[] args) {
		//Object type으로 사용
		ArrayList list1=new ArrayList();
		//data 추가
		list1.add("홍길동");//문자열
		list1.add(20);//정수 자료형
		list1.add("이순신");
		list1.add(100);
		//data 가져오기:이때,Object 타입을 해당 자료형으로 형변환해서 사용
		//System.out.println(list1.get(0));//홍길동
		String str=(String)list1.get(0);//형변환 필요
		System.out.println(str.length());
		int num=(int)list1.get(1);
		System.out.println(num+100);//integer끼리 더하기 가능
		//출력->반복문->배열크기->객체명.size()
		System.out.println(list1.size());//4
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
	}

}
