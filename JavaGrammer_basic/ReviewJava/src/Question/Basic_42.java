package Question;

import java.util.ArrayList;

public class Basic_42 {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<String>();
		//[1]리스트 추가
		list2.add("홍길동");
		list2.add("이순신");
		list2.add("강감찬");
		list2.add("을지문덕");
		list2.add("김유신");
		//System.out.println(list2.get(3));//김유신
		//String str=list2.get(0); 형변환 필요없이 사용
		
		//[2] 수정
		list2.set(3, "징키스칸");//을지문덕->징키스칸
		System.out.println(list2.get(3));//징키스칸
		
		//[3]삭제->삭제하면 공백으로 두는 것이 아니라 위치가 앞당겨짐
		list2.remove(3);
		System.out.println("[3]---------[삭제후 출력]");
		System.out.println(list2.get(0)); //홍길동
		System.out.println(list2.get(1)); //이순신
		System.out.println(list2.get(2)); //강감찬 
		System.out.println(list2.get(3)); //김유신
		System.out.println("------------[삭제후 출력]");
		
		//[4]출력
		System.out.println();
		System.out.println("[4]출력");
		for(String s : list2) {System.out.println(s);}
		
		
		//[5]한번에 삭제
		list2.removeAll(list2);
		System.out.println("[5]전체 삭제"+(list2.size()));//0
		
		
		
	}

}
