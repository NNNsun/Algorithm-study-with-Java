package Function;

public class SelfNumber {

	public static void main(String[] args) {
		boolean[] check= new boolean[10001];
		
		for(int i=1; i<10001;i++) {
			int n=d(i);
			
			if (n<10001) {	//n�� 10000�� �Ѵ� ���� ����
				check[n]=true;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {	//false�� ��츸 sb�� �̾Ƴ��� ->self number
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	public static int d(int num) {
		int sum=num;
		while(num!=0) {
			sum=sum+(num%10);//sum=123+3, sum=123+3+2, sum=123+3+2+1
			num=num/10;//12, 1, 0->while�� ����
		}
		return sum;
	}

}
