package Question;

public class Basic_04 {

	public static void main(String[] args) {
		int a=12345;
		//String str="12345";
		
		//정수->문자열
		String str=String.valueOf(a);
		System.out.println(str.length());//5
		//문자열+정수형->그대로 붙여짐
		System.out.println(12345+1);//12346
		System.out.println(str+1);//123451
		//문자열->정수형
		int b=Integer.valueOf(str);
		System.out.println(b);
		//원하는값:12345 실제 나오는값: 123451
		System.out.println("괄호써야하는 이유"+b+1);//(str+int)+str->str+str=str
		System.out.println("괄호써야하는 이유"+(b+1));//괄호로 해결
	}

}
