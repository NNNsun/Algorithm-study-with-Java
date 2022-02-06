package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindDecimals {

	public static void main(String[] args) throws NumberFormatException, IOException{
			System.out.println("����");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			br.readLine(); //4�� �Է��ϴ� ��(���x)
			int count=0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreElements()) {
				boolean isPrime=true;
				
				int num=Integer.parseInt(st.nextToken());
				if(num==1) {
					continue;
				}
				//�����ٱ����� �˻��Ѵ�.
				for(int i=2; i<=Math.sqrt(num);i++) {
					if(num%i==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) {
					count++;
				}
			}
			System.out.println(count);
	}

}
