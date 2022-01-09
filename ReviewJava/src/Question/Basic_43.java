package Question;

import java.util.ArrayList;

//ArrayList와 이차원 배열 ->ArrayList 안에 배열 == 2차원 배열의 꼴
public class Basic_43 {

	public static void main(String[] args) {
		//[1]객채생성
		ArrayList<Integer[]> list3=new ArrayList<Integer[]>();
		//[2]추가
		list3.add(new Integer[] {11,12,13,14});
		list3.add(new Integer[] {21,22,23,24,25});
		list3.add(new Integer[] {31,32,33,34,35});
		//[3]출력
		/*
		 * for(int i=0;i<list3.size();i++)
		 * 		System.out.println(list3.get(i)[0]);//11,21,31 
		 */
		System.out.println("-----------------------[전체 요소 출력]");
		for(int i=0;i<list3.size();i++) { //ArrayList길이를 알기위해 size()이용
			for(int j=0;j<list3.get(i).length;j++) //배열의 길이를 알기위해 length 사용
				System.out.print(list3.get(i)[j]+" ");//11,21,31
			System.out.println();
		}
		System.out.println("-----------------------[전체 요소 출력]");
		
	}

}
