package Question;
//for¹® ÁßÃ¸ ¿¹Á¦
public class Basic_37 {

	public static void main(String[] args) {
		String[][]shape=new String[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2&&j==2) {
					System.out.print("¡Ú ");
					continue;
				}
				System.out.print("¡Û ");
			}
			System.out.println();
		}
	}
}
