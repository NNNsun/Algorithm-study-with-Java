package Question;
//continue를 이용한 짝수출력
public class Basic_35 {

	public static void main(String[] args) {
		int n=0;
		while(n<31){
			n++;
			if(n%2!=0) {
				continue;//if뿐만아니라 while문 안을 전체 실행하지 않는다.
			}
			System.out.print(n+" ");
			
		}

	}

}
