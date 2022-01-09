package Question;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator(반복자) : Collection에 대한 반복자
//원소를 읽어올때 Iterator Interface로 표준화 하고있다.
//hasNext(),next(), remove()->반환타입은 boolean,Object(제네릭),void
//hasNext() ->다음요소가 있는지를 검사하여 true를 리턴
//next() ->다음요소를 리턴->그후 다음 위칠 커서가 이동->lterator에서는 삭제하지 않고, 커서만 이동.
//remonve() ->제거

//next() ->배열에 값이 없을때 사용하면 당연히 오류발생!(주의)
//따라서 사전에 hasNext()메서드를 사용하여 다음요소가 있는지 확인후 ->next()메서드로 안저낳게 요소를 가져온다
//import java.util.Iterator;

//Iterator(반복자) 사용해야하는 이유!
//컬렉션 프레임 워크 쓸때 한번 이상 만나는 에러 메세지-> java.util.ConcurrentModificationException
//보통 컬렉션 list 요소를 반복문 안에서 돌리면서 값을 삭제하고자 할 때 발생, 보통 반복문 안에서 remove()메서드 호출때 발생,Iterator객체생성순서에 따라서도 발생
//한 행씩 삭제하는 경우에는 별문제 없으나 반복문 안에서 순회하면서 삭제시 ㅠㅠ
//반복문 들어가기전의 기존 list배열의 size(length)나 index정보 등이 변경되면서-> 순회시 정보가 맞지않아 오류가 발생
//이를 해결하기위해서는 ->Iterator를 사용하여 순회하고 ->그때, iter.remove()메서드로 처리해야한다.
public class Basic_44 {

	public static void main(String[] args) {
		
		ArrayList<String> list4=new ArrayList<String>();
		list4.add("Alligator");
		list4.add("Hippo");
		list4.add("Ostrich");
		list4.add("Donkey");
		
		Iterator<String>iter=list4.iterator();
//		System.out.println(iter.hasNext());//true ->첫번째 요소인 Alligator가 존재하기 때문
//		System.out.println(iter.next());
		while(iter.hasNext()) {
			String str=iter.next();
			if("Hippo".equals(str)) {
				iter.remove();//특정값 삭제
				System.out.println("하마삭제");
				//System.out.println(iter.next()); 모두 출력 1
			}
				
		}
		for(String s :list4) System.out.println(s); //모두출력 2
		
		
	}

}
