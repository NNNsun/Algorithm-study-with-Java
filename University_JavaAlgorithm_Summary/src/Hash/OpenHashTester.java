package Hash;

import java.util.Scanner;
public class OpenHashTester {
	static Scanner ophash=new Scanner(System.in);
	
	static class Data{
	public static final int NO=1;			//��ȣ �Է�
	public static final int NAME=2;			//�̸� �Է�
	
	private Integer no;			//ȸ����ȣ(Ű ��)
	private String name;		//�̸�
	
	//Ű ��
			Integer keyCode() {
				return no;
			}
			
			//���ڿ��� ��ȯ
			public String toString() {
				return name;
			}
			
			//�����͸� �Է��մϴ�.
			void scanData(String guide,int sw) {
				System.out.println(guide+"�� �����͸� �Է��ϼ���.");
				
				if((sw&NO)==NO) {
					System.out.print("��ȣ: ");
					no=ophash.nextInt();
				}
				if((sw&NAME)==NAME) {
					System.out.print("��ȣ: ");
					name=ophash.next();
				}
			}
	}
		//�޴� ������
			enum Menu{
				ADD("�߰�"),
				REMOVE("����"),
				SEARCH("�˻�"),
				DUMP("ǥ��"),
				TERMINATE("����");
				
				private final String message;	//����� ���ڿ�
				
				Menu(String string) {			//������
					message=string;
				}
				
				String getMessage() {			//����� ���ڿ��� ��ȯ
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
					key=ophash.nextInt();
				}while (key<Menu.ADD.ordinal()||key>Menu.TERMINATE.ordinal());
				return Menu.MenuAt(key);
			}
	
	
	public static void main(String[] args) {
		Menu menu;				//�޴�
		Data data;				//�߰��� ������ ����
		Data temp=new Data();	//�Է¿� ������
		
		OpenHash<Integer,Data> ophash =new OpenHash<Integer,Data>(13); //Ʈ�� ����
		
		do {
			switch(menu=SelectMenu()) {
			case ADD:										//��带 ����
				data=new Data();
				data.scanData("�߰�", Data.NO|Data.NAME);
				ophash.add(data.keyCode(), data);
				break;
			
			case REMOVE:									//��� ����
				temp.scanData("����", Data.NO);
				ophash.remove(temp.keyCode());
				break;
			
			case SEARCH:									//�˻�
				temp.scanData("�˻�", Data.NO);
				Data t=ophash.search(temp.keyCode());
				if(t!=null)
					System.out.println("�� ��ȣ�� �̸��� "+t+"�Դϴ�.");
				else
					System.out.println("�ش� �����Ͱ� �����ϴ�.");
				break;
				
			case DUMP:										//��� ��带 Ű���� ������������ ���
				ophash.dump();
				break;
			}
			
		}while(menu!=Menu.TERMINATE);
		
	}

}
