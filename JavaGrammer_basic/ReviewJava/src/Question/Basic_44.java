package Question;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator(�ݺ���) : Collection�� ���� �ݺ���
//���Ҹ� �о�ö� Iterator Interface�� ǥ��ȭ �ϰ��ִ�.
//hasNext(),next(), remove()->��ȯŸ���� boolean,Object(���׸�),void
//hasNext() ->������Ұ� �ִ����� �˻��Ͽ� true�� ����
//next() ->������Ҹ� ����->���� ���� ��ĥ Ŀ���� �̵�->lterator������ �������� �ʰ�, Ŀ���� �̵�.
//remonve() ->����

//next() ->�迭�� ���� ������ ����ϸ� �翬�� �����߻�!(����)
//���� ������ hasNext()�޼��带 ����Ͽ� ������Ұ� �ִ��� Ȯ���� ->next()�޼���� �������� ��Ҹ� �����´�
//import java.util.Iterator;

//Iterator(�ݺ���) ����ؾ��ϴ� ����!
//�÷��� ������ ��ũ ���� �ѹ� �̻� ������ ���� �޼���-> java.util.ConcurrentModificationException
//���� �÷��� list ��Ҹ� �ݺ��� �ȿ��� �����鼭 ���� �����ϰ��� �� �� �߻�, ���� �ݺ��� �ȿ��� remove()�޼��� ȣ�⶧ �߻�,Iterator��ü���������� ���󼭵� �߻�
//�� �྿ �����ϴ� ��쿡�� ������ ������ �ݺ��� �ȿ��� ��ȸ�ϸ鼭 ������ �Ф�
//�ݺ��� �������� ���� list�迭�� size(length)�� index���� ���� ����Ǹ鼭-> ��ȸ�� ������ �����ʾ� ������ �߻�
//�̸� �ذ��ϱ����ؼ��� ->Iterator�� ����Ͽ� ��ȸ�ϰ� ->�׶�, iter.remove()�޼���� ó���ؾ��Ѵ�.
public class Basic_44 {

	public static void main(String[] args) {
		
		ArrayList<String> list4=new ArrayList<String>();
		list4.add("Alligator");
		list4.add("Hippo");
		list4.add("Ostrich");
		list4.add("Donkey");
		
		Iterator<String>iter=list4.iterator();
//		System.out.println(iter.hasNext());//true ->ù��° ����� Alligator�� �����ϱ� ����
//		System.out.println(iter.next());
		while(iter.hasNext()) {
			String str=iter.next();
			if("Hippo".equals(str)) {
				iter.remove();//Ư���� ����
				System.out.println("�ϸ�����");
				//System.out.println(iter.next()); ��� ��� 1
			}
				
		}
		for(String s :list4) System.out.println(s); //������ 2
		
		
	}

}
