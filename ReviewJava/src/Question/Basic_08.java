package Question;

public class Basic_08 {

	public static void main(String[] args) {
		
		//swich(정수형,char형 가능, long타입은 불가능)
		//break, default 필수!!
		int age= 60;
		
		//사용자 입력 예외처리
	
		if(age>10&&age<20) {
			System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
			//age=10;으로 처리 가능, 더 깔끔!
		}
		else if(age>20&&age<30) {
			System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
		}
		else if(age>30&&age<40) {
			System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
		}
		else if(age>40&&age<50) {
			System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
		}
		else if(age>50&&age<60) {
			System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
		}
		else {
			 if(age<10)
			System.out.println("대상자가 아닙니다. 프로그램을 종료합니다.");
			System.exit(0); //시스템 종료!
		}
		
		switch(age) {
		case 10:
			System.out.println(age+"대 입니다. 참고서 코너는 A구역입니다.");
			break; //필수
			
		case 20:
			System.out.println(age+"대 입니다. 취업서적 코너는 B구역입니다.");
			break;
		case 30:
			System.out.println(age+"대 입니다. 자기계발 코너는 C구역입니다.");
			break;
		case 40:
			System.out.println(age+"대 입니다. 재테크 코너는 D구역입니다.");
			break;
		case 50:
			System.out.println(age+"대 입니다. 재취업 코너는 E구역입니다.");
			break;
		default://나머지 입력값 처리, 60이상 모두처리하기때문에 예외처리 필요없음
			System.out.println("60대 이상 입니다. 건강/장수 코너는 F구역입니다.");
			break;
		}
		
	}

}
