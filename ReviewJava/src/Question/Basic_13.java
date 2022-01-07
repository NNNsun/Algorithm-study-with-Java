package Question;

public class Basic_13 {

	public static void main(String[] args) {

		String[] province = new String[3];// null로 초기화
		// 직접초기화
		province[0] = "강원도";
		province[1] = "전라도";
		province[2] = "경상도";
		// 배열 선언,생성시 동시 초기화
		String[] nation = new String[] { "한국", "미국", "중국" };
		String[] flower = { "무궁화", "개나리", "해바라기" };// 대중적

		for (String str : nation)// 배열을 단순하게 전부 출력시 사용
			System.out.print(str + " ");
		
		System.out.println("\n");
		//2차원 배열
		String[][] asia = { 
				{ "한국","일본","중국" }, //System.out.println(asia[0]); 주소값출력
				{ "태국","인도","베트남"}, //asia[1]
		};
		System.out.println(asia[1][1]);
		for(int i=0;i<asia.length;i++) {
			for(int j=0; j<asia[i].length;j++)
				System.out.print(asia[i][j]+" ");
			System.out.println();
		}
		
		//charAt()매서드 사용->해당인덱스에 있는 값을 반환->단어를 char배열에 한글자씩 저장 가능
		String[]strAr= {"hong","kim","park"};
		System.out.println(strAr[0].charAt(2));//hong의 n만 출력
		
		//length: 배열의 길이 vs length(): 문자열의 길이,공백포함!!!!
		
		for(int i=0; i<strAr.length;i++) {
			 //배열안에 한글자씩 출력할땐
			 //length가 아닌 length()를 사용한다!!
			for(int j=0; j<strAr[i].length();j++) {
				System.out.println(strAr[i].charAt(j));
			}
		}
		
		
	}

}
