package Question;

public class Basic_06 {

	public static void main(String[] args) {
		int kor=80, eng=90, math=100;
		//if 조건문
		if(kor>=80) 
			System.out.println("당신의 국어 점수는 B학점입니다.");//들여쓰기는 당연하다, python은 엄격함
		System.out.println("학점이 안나왔다면 80점이 안되어서 입니다.");
		
		//if~else
		if(eng>90) { //if문이 두 줄 이상을 포함할 때 무조건 괄호
			System.out.println("A학점입니다.");
			System.out.println("축하합니다");
		}
		else
			System.out.println("90점 미만입니다..ㅜㅜ");
	}

}
