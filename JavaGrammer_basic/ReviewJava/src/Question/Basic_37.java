package Question;
//for�� ��ø ����
public class Basic_37 {

	public static void main(String[] args) {
		String[][]shape=new String[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2&&j==2) {
					System.out.print("�� ");
					continue;
				}
				System.out.print("�� ");
			}
			System.out.println();
		}
	}
}
