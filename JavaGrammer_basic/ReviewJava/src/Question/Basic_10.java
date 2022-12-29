package Question;

public class Basic_10 {

	public static void main(String[] args) {
		//반복문 1.for 2.while 3. do~while 
		//4. 향상된 for문 for(자료형 변수명: 배열명){문장}
		//for(변수초기식;조건식;증감식){조건식->참일때 실행}
		
		for(int i=65; i<91;i++) {
			System.out.print((char)i+"  ");//A~Z 출력,아스키코드 이용
		}
		
		System.out.println();
		
		int a=1;
		while(a<=30) {
			//홀수출력
			if(a%2!=0) {
				System.out.print(a+" ");
			}
			a++;
		}
	}

}
