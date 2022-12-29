package Question;

public class Basic_36 {

	public static void main(String[] args) {
		int output=0;
		int k=0;
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<10;j++) {
				 output=i*10+j;
				if(j%2==0) {
					System.out.print(output+" ");
				}
				if(j==0) {k=output;}
			}
			System.out.print("\t"+k);
			//int k=output+1;
			//System.out.print("\t\t"+k);
			System.out.println();
		}

	}

}
