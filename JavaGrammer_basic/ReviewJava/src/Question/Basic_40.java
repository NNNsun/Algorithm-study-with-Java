package Question;
//���׸�
class Sample2<T>{
	private T obj;
	Sample2(T x){this.obj=x;}
	T getObj() {return obj;}
	void printInfo() {System.out.println(obj.getClass().getName());}
}


public class Basic_40 {

	public static void main(String[] args) {
		//[1]��ü����->String
		Sample2<String> s1=new Sample2<String>("�ȳ��ϼ���~");
		System.out.println(s1.getObj());
		System.out.println("-------------------------------");
		
		Sample2<Integer> s2= new Sample2<Integer>(100);
		System.out.println(s2.getObj());
		s2.printInfo();
		System.out.println("-------------------------------");
		//����ȯ ���� ����ϱ�
		String str=s1.getObj();
		System.out.println(s1.getObj().length());//6
	}

}
