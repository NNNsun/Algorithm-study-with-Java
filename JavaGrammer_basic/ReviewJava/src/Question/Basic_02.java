package Question;

public class Basic_02 {

	public static void main(String[] args) {
		
		//byte, short, int, long, char의 크기 (대문자==래퍼클래스)
		//1byte==8bit(Size)
		System.out.println("int == "+Integer.BYTES+"byte");
		System.out.println("int == "+Integer.SIZE+"bit");
		System.out.println("int의 범위 == "+ Integer.MIN_VALUE+" ~" + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("char == "+Character.BYTES+"byte");
		System.out.println("char == "+Character.SIZE+"bit");
		//문자형 타입이라 숫자로 나올 수 없음-> 형변환 필요
		System.out.println("char의 최대 크기(이상한 값) == "+ Character.MIN_VALUE+" ~ "+ Character.MAX_VALUE);
		//char은 음수가 없음
		System.out.println("char의 최대 크기(정상) == "+ (int)Character.MIN_VALUE+" ~ "+ (int)Character.MAX_VALUE);
		
	}

}
