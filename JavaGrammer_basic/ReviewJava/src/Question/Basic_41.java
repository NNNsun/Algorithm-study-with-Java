package Question;
//�÷���: ������ ������ ��� ���� �׸�, �뵵���� �׸��� �ֵ��� � �ڷᱸ�� �����͸� �����ϰ� ������ �������� ���� �´� �׸��� ����Ѵ�.
//�÷��� ������ ��ũ�� ũ�Ժ�����, Collection�� Map���� ������ �̵��� Interface�� �Ǿ��ִ�.
//Collection�� List�� Set���� ������.(�̵鵵 �������̽�)->�̵帪�� ��ӹ޾� �پ��� ������ �迭(�׸�,Ŭ����)�� ���ȴ�.
//List,Set �������̽� ���->List(�ߺ����o)�迭 ���� Ŭ���� vs Set(�ߺ����x)�迭 ���� Ŭ����
//List->ArrayList,LinkedList,Vector,Stack
//Set->HashSet,SortedSet,TreeSet
//List�������̽��� ����ϴ� Ŭ������ Ư¡ ->�ε����� �ְ�, (�׷���)��������� ����, ������ �ߺ� ���
//Set�������̽��� ����ϴ� Ŭ������ Ư¡ ->�������ߺ� X

import java.util.ArrayList;


//ArrayList:�ʿ�� ������ �߰�, ���� ����,import java.util.ArrayList �ʿ�
//���׸� ���� ��밡��,���׸�������������� ���������� ObjectŸ������ ó���ȴ�.(����ȯ �ؾ��Ѵٴ� ������ ����)
//vs�迭:ũ�⸦ �̸� �����ϰ� ���->������ �޸𸮰���x



public class Basic_41 {

	public static void main(String[] args) {
		//Object type���� ���
		ArrayList list1=new ArrayList();
		//data �߰�
		list1.add("ȫ�浿");//���ڿ�
		list1.add(20);//���� �ڷ���
		list1.add("�̼���");
		list1.add(100);
		//data ��������:�̶�,Object Ÿ���� �ش� �ڷ������� ����ȯ�ؼ� ���
		//System.out.println(list1.get(0));//ȫ�浿
		String str=(String)list1.get(0);//����ȯ �ʿ�
		System.out.println(str.length());
		int num=(int)list1.get(1);
		System.out.println(num+100);//integer���� ���ϱ� ����
		//���->�ݺ���->�迭ũ��->��ü��.size()
		System.out.println(list1.size());//4
		for(int i=0; i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
	}

}
