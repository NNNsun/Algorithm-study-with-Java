package Question;

public class Basic_09 {

	public static void main(String[] args) {
		//삼항연산자= 깔끔할수록 좋은 코드, 불필요한 변수선언 지양
		int hour=10;
		
		hour = hour<=10?hour*100:hour; //콜론으로 나눈다. 참:거짓
		System.out.println(hour);
		
		//반환되는 값이 정수냐 문자열이냐
		//hour=hour<12?"오전":"오후"; -> 오류발생
		String ampm=hour<12?"오전":"오후";
		System.out.println("시간대: "+ampm);
		
	}

}
