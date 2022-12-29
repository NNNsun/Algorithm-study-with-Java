package Question;

public class Basic_03 {

	public static void main(String[] args) {
		int w; //에러 x 하지만 선언만 하는 것은 이상함
		int x,y,z=50; //z만 초기화
		
		int x1,y1,z1;
		x1=y1=z1=50; // 가능
		System.out.println(x1+" "+y1+" "+z1);
		
		//int x2=y2=z2=30; 불가능 ->선언 후 초기화하기
		
	 //대문자로 접미사를 붙여야 하는 자료형(소문자가능하긴 함)
		long l=400L;
		float f=3.14F;
	 //formatted, 소수는 %.2f (이후 숫자만큼 남김) \n%n==줄바꿈
	 //%o== 8진수 , %x==16진수
		System.out.printf("%d,%d,%.1f, \nhi%n",x1,y1,f);
	 //	정수형 변수 ='문자'일때 아스키 코드 값을 찍어냄
		short a='A';
		int b='B';
		System.out.println(a);
		System.out.println(b);
	 //	문자형 변수 = '정수'는 아스키코드->문자
		short c=77;
		System.out.println((char)c);
	 //아스키코드끼리 계산 가능
		System.out.println(a*b);
	}

}
