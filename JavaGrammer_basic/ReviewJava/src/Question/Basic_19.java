package Question;


public class Basic_19 {

	public static void main(String[] args) {
		//[1]���ڳ��� ����
		int a=1, b=2, c=a+b;
		System.out.println("a+b= "+c);
		
		//[2]���ڿ������� ����
		String a1="1";
		String b1="2";
		String c1=a1+b1;
		System.out.println("a1+b1= "+c1);//12
		System.out.println(c1.getClass().getName());//Ŭ���� ����Ȯ��
		
		//[3]���ڿ�->���ڷ� ��ȯ �� ����
		int a2=Integer.parseInt(a1);
		int b2=Integer.parseInt(b1);
		System.out.println(a2+b2);
		
		//[4]���� ����
		System.out.println("----��������----");
		System.out.println(Integer.parseInt("2022"));//2022
		System.out.println(Integer.parseInt("2022",10));//2022
		System.out.println(Integer.parseInt("1",10));//1
		System.out.println(Integer.parseInt("1001",2));//9
		System.out.println(Integer.parseInt("1004",8));//516
		System.out.println(Integer.parseInt("A",16));//10
		System.out.println(Integer.parseInt("FF",16));//255
		System.out.println("----��������----");
	}

}
