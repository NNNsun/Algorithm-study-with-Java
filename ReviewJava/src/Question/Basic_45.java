package Question;

import java.util.ArrayList;
import java.util.Iterator;

//Iterator(�ݺ���) ����ؾ��ϴ� ����!
//�÷��� ������ ��ũ ���� �ѹ� �̻� ������ ���� �޼���-> java.util.ConcurrentModificationException
//���� �÷��� list ��Ҹ� �ݺ��� �ȿ��� �����鼭 ���� �����ϰ��� �� �� �߻�, ���� �ݺ��� �ȿ��� remove()�޼��� ȣ�⶧ �߻�,Iterator��ü���������� ���󼭵� �߻�
//�� �྿ �����ϴ� ��쿡�� ������ ������ �ݺ��� �ȿ��� ��ȸ�ϸ鼭 ������ �Ф�
//�ݺ��� �������� ���� list�迭�� size(length)�� index���� ���� ����Ǹ鼭-> ��ȸ�� ������ �����ʾ� ������ �߻�
//�̸� �ذ��ϱ����ؼ��� ->Iterator�� ����Ͽ� ��ȸ�ϰ� ->�׶�, iter.remove()�޼���� ó���ؾ��Ѵ�.
public class Basic_45 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list5=new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		
		
		Iterator<Integer>it=list5.iterator();
	
//		for(Integer i :list5) System.out.print(i+" ");
//		System.out.println("----------[����]");
//		list5.remove(1);//2�� ����
//		System.out.println(list5.get(1));
		
		
//		System.out.println("----------[�����߻�]");
//		for(Integer i :list5) {
//			//list5.remove(i); �����߻�, Iterator����ؾ��ϴ� ����
//		}
//		System.out.println("----------[�����߻�]");
		
		while(it.hasNext()) {
			Integer i=it.next();
			if(i==2) {
				it.remove();//2�� ����
				System.out.println(i+" �� ����");
			}
				
		}
		System.out.println("---------------------------");
		for(Integer i : list5) System.out.print(i+" ");
		
	}

}
