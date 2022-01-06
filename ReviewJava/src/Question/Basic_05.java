package Question;

public class Basic_05 {

	public static void main(String[] args) {
		int a=60;
		int b=8;
		
		int rst1;
		double rst2,rst3,rst4;
		
		rst1=a/b;
		System.out.println(rst1);//7
		System.out.println((double)rst1);//7.0
		
		rst2=(double)a/b;//크기가 큰 정수형에 맞춰 계산
		System.out.println(rst2);
		
		rst3=100/(double)3;//double이라 상관없음
		rst4=100/3.0;//애초에 실수로 씀
		System.out.println(rst3);//33.333333333333336
		System.out.println(rst4);//33.333333333333336
		

	}

}
