package String;

import java.util.Scanner;

public class GroupWordCheckers {
static Scanner sc = new Scanner(System.in);

	public static boolean check() {
		boolean[] check=new boolean[26];
		int prev=0;
		String str=sc.next();
		
		for(int i=0;i<str.length();i++) {
			int now=str.charAt(i);
			
			if(prev!=now) {
				//�˻��ϴ� ���ڰ� ó���� ���(false�� ����)
				if(check[now-'a']==false) { //[now-'a']==�ش� ���ĺ� ��ġ�� ���Ѵ�.
					check[now-'a']=true;	//ó���̴� true�� �ٲ��ش�.
					prev=now;		//���� ���� ���� prev ���� �ֽ�ȭ �����ش�.
				}
				
				//�ش� ���ڰ� �̹� ���� �� �ִ� ��� (�׷�ܾ �ƴ�)
				else {
					return false; //�Լ�����->�տ� �˻��߾��� true���� ��ҵ鵵 ��� ���󰣴�.
				}
			}
			
			//�ռ� ���ڿ� i��° ���ڰ� ���ٸ�?
			//else���� ��� ��
			else {
				continue;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("����");
		int count=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) { //n�� �Է��Ѵ�.
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
