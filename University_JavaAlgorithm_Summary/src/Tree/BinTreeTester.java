package Tree;
//�����˻�Ʈ�� Ȱ��
import java.util.Scanner;


public class BinTreeTester {
	static Scanner binTree=new Scanner(System.in);
	
	//������(ȸ����ȣ+�̸�)
	static class Data{
		public static final int NO=1;			//��ȣ �Է�
		public static final int NAME=2;			//�̸� �Է�
		
		private Integer no;						//ȸ�� ��ȣ(Ű ��)
		private String name;					//�̸�
		
		//Ű��
		Integer keyCode() {
			return no;
		}
		//���ڿ��� ��ȯ�մϴ�.
		public String toString() {
			return name;
		}
		//data�� �Է��մϴ�.
		void scanData(String guide, int sw) {
			System.out.println(guide+"�� �����͸� �Է��ϼ���.");
			
			if ((sw&NO)==NO) {
				System.out.print("��ȣ: ");
				no=binTree.nextInt();
			}
			if ((sw&NAME)==NAME) {
				System.out.print("�̸�: ");
				name=binTree.next();
			}
		}
	}
	//�޴� ������
	enum Menu{
		ADD("����"),
		REMOVE("����"),
		SEARCH("�˻�"),
		PRINT("ǥ��"),
		TERMINATE("����");
		
		private final String message;	//����� ���ڿ�
		
		Menu(String string) {			//������
			message=string;
		}
		
		String getMessage() {
			return message;
		}
		
		static Menu MenuAt(int idx) { 	//������ idx�� ���Ÿ� ��ȯ
			for(Menu m:Menu.values())
				if(m.ordinal()==idx)
					return m;
			return null;
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
			key=binTree.nextInt();
		}while (key<Menu.ADD.ordinal()||key>Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}
	
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data ptr;				//�˻��� ������ ����
		Data temp=new Data();	//�Է¿� ������
		
		BinTree<Integer,Data> tree =new BinTree<Integer,Data>(); //Ʈ�� ����
		
		do {
			switch(menu=SelectMenu()) {
			case ADD:										//��带 ����
				data=new Data();
				data.scanData("����", Data.NO|Data.NAME);
				tree.add(data.keyCode(), data);
				break;
			
			case REMOVE:									//��� ����
				temp.scanData("����", Data.NO);
				tree.remove(temp.keyCode());
				break;
			
			case SEARCH:									//��� �˻�
				temp.scanData("�˻�", Data.NO);
				ptr=tree.search(temp.keyCode());
				if(ptr!=null)
					System.out.println("�� ��ȣ�� �̸��� "+ptr+"�Դϴ�.");
				else
					System.out.println("�ش� �����Ͱ� �����ϴ�.");
				break;
				
			case PRINT:										//��� ��带 Ű���� ������������ ���
				tree.print();
				break;
			}
			
		}while(menu!=Menu.TERMINATE);
		
	}

}
