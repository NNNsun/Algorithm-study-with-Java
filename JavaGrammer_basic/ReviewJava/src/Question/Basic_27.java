package Question;

//������ ����
abstract class Car{
	abstract void run();
}
class Ambulance extends Car{
	void run() {System.out.println("�ں深�� ��������~ �߻ǻ߻�~");}
}
class Cultivator extends Car{
	void run() {System.out.println("���� ��������~ ���ȴ���~");}
}

class SportsCar extends Car{
	void run() {System.out.println("������ī ��������~ ��~");}
}

public class Basic_27 {

	public static void main(String[] args) {
		/*
		 * Car c1 =new Ambulance(); Car c2 =new Cultivator(); Car c3 =new SportsCar();
		 * 
		 * c1.run(); c2.run(); c3.run();
		 */
//		Car[] cars=new Car[3];
//		//System.out.println(cars[0]); ���� null�� ����
//		cars=new Car[] {new Ambulance(),new Cultivator(),new SportsCar()};
		Car[] cars= {new Ambulance(),new Cultivator(),new SportsCar()};
		for(Car c:cars) {
			c.run();
		}
		
		
		
	}

}
