package Question;

public class Basic_10 {

	public static void main(String[] args) {
		//�ݺ��� 1.for 2.while 3. do~while 
		//4. ���� for�� for(�ڷ��� ������: �迭��){����}
		//for(�����ʱ��;���ǽ�;������){���ǽ�->���϶� ����}
		
		for(int i=65; i<91;i++) {
			System.out.print((char)i+"  ");//A~Z ���,�ƽ�Ű�ڵ� �̿�
		}
		
		System.out.println();
		
		int a=1;
		while(a<=30) {
			//Ȧ�����
			if(a%2!=0) {
				System.out.print(a+" ");
			}
			a++;
		}
	}

}
