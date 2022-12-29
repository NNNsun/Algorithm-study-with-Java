package List;

import java.util.Comparator;
import java.util.Scanner;

import List.LinkedListTester.Data;
import List.LinkedListTester.Menu;
//���� ���߸���Ʈ ���
public class DbLinkedListTester {
	static Scanner circleList = new Scanner(System.in);

	//������ (ȸ����ȣ+�̸�)
	
	static class Data{
		static final int NO =1;		//��ȣ�� �Է¹޽��ϱ�?
		static final int NAME =2;	//�̸��� �Է¹޽��ϱ�?
		
		private Integer no;			//ȸ�� ��ȣ
		private String name;		//ȸ�� �̸�
		
		//���ڿ��� ��ȯ�մϴ�.
		
		public String toString() {
			return "("+no+")"+name;
		}
		//�����͸� �Է��մϴ�.
		void scanData(String guide,int sw) {
			System.out.println(guide+"�� �����͸� �Է��ϼ���.");
			
			if ((sw&NO)==NO) {
				System.out.println("��ȣ: ");
				no=circleList.nextInt();
			}
			if ((sw&NAME)==NAME) {
				System.out.println("�̸�: ");
				name=circleList.next();
			}
		}
		//ȸ����ȣ ������ ������ �ű�� comparator
		public static final Comparator<Data> NO_ORDER=new NoOrderComparator();
		private static class NoOrderComparator implements Comparator<Data>{
			public int compare(Data d1, Data d2) {
				return (d1.no>d2.no)?1:(d1.no<d2.no)?-1:0;
			}
		}
		//�̸������� ������ �ű�� comparator
		public static final Comparator<Data> NAME_ORDER=new NoOrderComparator();
		private static class NameOrderComparator implements Comparator<Data>{
			public int compare(Data d1, Data d2) {
				return d1.name.compareTo(d2.name);
			}
		}
	}
	enum Menu {
		ADD_FIRST("head�� ��带 ����"), 
		ADD_LAST("������ ��带 ����"), 
		ADD("���ó�� �ٷ� �ڿ� ����"), 
		RMV_FIRST("head�� ��带 ����"), 
		RMV_LAST("������ ��带 ����"),
		RMV_CRNT("���� ��带 ����"), 
		CLEAR("��� ��带 ����"), 
		SEARCH_NO("ȸ����ȣ�� �˻�"),
		SEARCH_NAME("�̸����� �˻�"),
		NEXT("���� ��带�������� �̵�"), 
		PREV("���� ��带�������� �̵�"), 
		PRINT_CRNT("���ó�带 ���"), 
		DUMP("��� ��带 ���"), 
		TERMINATE("����");
		
		

		private final String message;		//����� ���ڿ�
		
		static Menu MenuAt(int idx) {		//������ idx�� ���Ÿ� ��ȯ
			for(Menu m : Menu.values())
				if(m.ordinal()==idx)
					return m;
			return null;
		}
		
		
		Menu(String string) {				//������
			message=string;
		}
		
		String getMessage() {				//����� ���ڿ��� ��ȯ
			return message;
		}
		
	}
	//�޴� ����
			static Menu SelectMenu() {
				int key;
				do {
					for(Menu m: Menu.values()) {
						System.out.printf("(%d) %s ",m.ordinal(),m.getMessage()); //m.message() == "head�� ��带 ����"
						if((m.ordinal()%3)==2&& m.ordinal()!=Menu.TERMINATE.ordinal()) //�Ǿ� ���  3�� ����� 3���� ����ض�
							System.out.println();
					}
					System.out.print(" : ");
					key=circleList.nextInt();
				}while (key<Menu.ADD_FIRST.ordinal()||
									key>Menu.TERMINATE.ordinal());
				return Menu.MenuAt(key);
			}
	
	
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data ptr;				//�˻��� ������ ����
		Data temp=new Data();	//�Է¿� ������
		
		DblLinkedList<Data> list =new DblLinkedList<Data>(); //����Ʈ ����
		
		do {
			switch(menu=SelectMenu()){
			
				case ADD_FIRST:				//�Ӹ��� ��带 ����
					data=new Data();
					data.scanData("�Ӹ��� ����", Data.NO|Data.NAME);
					list.addFirst(data);
					break;
					
				case ADD_LAST:				//������ ��带 ����
					data=new Data();
					data.scanData("������ ����", Data.NO|Data.NAME);
					list.addLast(data);
					break;
				case ADD:
					data=new Data();
					data.scanData("���ó�� �ٷ� �ڿ� ����", Data.NO|Data.NAME);
					list.add(data);
				case RMV_FIRST:				//�Ӹ� ��带 ����
					list.removeFirst();
					break;
				case RMV_LAST:				//���� ��带 ����
					list.removeLast();
					break;
				case RMV_CRNT:				//���ó�带 ����
					list.removeCurrentNode();
					break;
				case SEARCH_NO:				//ȸ����ȣ�� �˻�
					temp.scanData("�˻�", Data.NO);
					ptr=list.search(temp, Data.NO_ORDER);
					if(ptr==null)
						System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
					else
						System.out.println("�˻� ����: "+ptr);
					break;
				case SEARCH_NAME:			//�̸����� �˻�
					temp.scanData("�˻�", Data.NAME);
					ptr=list.search(temp, Data.NAME_ORDER);
					if(ptr==null)
						System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
					else
						System.out.println("�˻� ����: "+ptr);
					break;
				case NEXT:					//���ó�带 �������� �̵�
					list.next();
					break;
				case PREV:
					list.prev();
					break;
				case PRINT_CRNT:			//���ó���� �����͸� ���
					list.printCurrentNode();
					break;
				case DUMP:
					list.dump();
					break;
					
				case CLEAR:					//����带 ����
					list.clear();
					break;
					
			}
		}while (menu!=Menu.TERMINATE);
	}
}
