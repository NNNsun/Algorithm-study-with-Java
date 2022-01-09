package Question;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator(반복자) 사용해야하는 이유!
//컬렉션 프레임 워크 쓸때 한번 이상 만나는 에러 메세지-> java.util.ConcurrentModificationException
//보통 컬렉션 list 요소를 반복문 안에서 돌리면서 값을 삭제하고자 할 때 발생, 보통 반복문 안에서 remove()메서드 호출때 발생,Iterator객체생성순서에 따라서도 발생
//한 행씩 삭제하는 경우에는 별문제 없으나 반복문 안에서 순회하면서 삭제시 ㅠㅠ
//반복문 들어가기전의 기존 list배열의 size(length)나 index정보 등이 변경되면서-> 순회시 정보가 맞지않아 오류가 발생
//이를 해결하기위해서는 ->Iterator를 사용하여 순회하고 ->그때, iter.remove()메서드로 처리해야한다.
public class Basic_45 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list5=new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		
		
		Iterator<Integer>it=list5.iterator();
	
//		for(Integer i :list5) System.out.print(i+" ");
//		System.out.println("----------[삭제]");
//		list5.remove(1);//2가 삭제
//		System.out.println(list5.get(1));
		
		
//		System.out.println("----------[오류발생]");
//		for(Integer i :list5) {
//			//list5.remove(i); 오류발생, Iterator사용해야하는 이유
//		}
//		System.out.println("----------[오류발생]");
		
		while(it.hasNext()) {
			Integer i=it.next();
			if(i==2) {
				it.remove();//2만 삭제
				System.out.println(i+" 번 삭제");
			}
				
		}
		System.out.println("---------------------------");
		for(Integer i : list5) System.out.print(i+" ");
		
	}

}
