package Question;
//class : ��ü(�ν��Ͻ�)�� �����ϴ� �ϳ��� ����
		//Ư¡�� ���ۿ� ���� �ð��� ���̰� �����ϸ鼭 �����ؾ��Ѵ�.
		//��ü�� Ư¡->�Ӽ�(attribute)
		//��ü�� ����->�޼���(method)

//1. �ϳ��� ���Ͽ� 2���̻��� Ŭ������ �ۼ��� �� �ִ�.
//2. 3���� Ŭ������ �ִٸ� �ڹ� ���ϸ��� �� �� �ִ� ���� public Ű���尡 ���� Ŭ�����̴�.
//3. �ϳ��� ���Ͽ� �ִ� 3���� Ŭ������ ��� public�� ���ϼ��� ����.
//4. �ϳ��� ���Ͽ� �ִ� 3���� Ŭ������ ��� public�� �Ⱥ��ϼ� �ִ�.
//5. �ϳ��� ���Ͽ� �ִ� 3���� Ŭ������ ��� public�� ���ٸ� Ŭ���� �� ������̶� ���ϸ��� �ɼ��ִ�.
//6. �ڹ� ���Ͽ� Ŭ������ �Ѱ� �ִٸ� Ŭ�������� �� ���ϸ��� �Ǿ�� �Ѵ�.

class FarmMachine{
	//[1]�Ӽ�
	int price;
	int year;
	String color;
	//[2]����
	public void move(){
		System.out.println("Farm-machine is moving");
	}
	public void dig(){
		System.out.println("Farm-machine is digging");
	}
	public void grind(){
		System.out.println("Farm-machine is grinding");
	}
}


public class Basic_18 {

	public static void main(String[] args) {
		FarmMachine M =new FarmMachine();
		M.price=1000000;
		M.year=2020;
		M.color="Red";
		//String M_price=String.format("%,d", 1000000);//String.format :1,000,000
		System.out.println(String.format("%,d won",M.price)+"\n"+M.color+"\n"+M.year);
		M.move();
		M.dig();
		M.grind();
		
	}

}
