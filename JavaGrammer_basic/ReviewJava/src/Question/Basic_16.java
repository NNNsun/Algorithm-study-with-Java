package Question;

class TestNumber{
	int num;
	TestNumber(int num){this.num=num;}
}

public class Basic_16 {
	//Call by value->���� ���ؼ� (�޼��带)ȣ��
	//�޼���� ���ڰ��� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ���->sum()�޼��� ���ο��� ����� ������ ó���Ѵ�.
	public static void sum_value(int a) {
		a+=400;
		System.out.println(a); //500
	}
	
	/*
	 * public static void sum_reference_1(Basic_16 a) {
	 * 
	 * System.out.println(a); }
	 */
	public static int sum_reference(TestNumber a) {
		a.num+=400;
		return a.num;
	}
	
	
	
	public static void main(String[] args) {
		
		int a=100;
		sum_value(a);
		System.out.println("[1]Call by value "+a); //100
		// WrapperŬ������ IntegerŬ������ a �����ϰ� new�� ��ü�� �����Ͽ� �ּҰ��� �޼���� ������? (x)
		//Integer k =new Integer(100);
		
		// Basic_16 b = new Basic_16();
		// sum_reference_1(a);
		
		TestNumber c = new TestNumber(100);//Call by reference
		System.out.println("[2]Call by reference "+sum_reference(c));
		
		
	}

}
