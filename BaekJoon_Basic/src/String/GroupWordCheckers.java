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
				//검사하는 문자가 처음인 경우(false인 상태)
				if(check[now-'a']==false) { //[now-'a']==해당 알파벳 위치를 말한다.
					check[now-'a']=true;	//처음이니 true로 바꿔준다.
					prev=now;		//다음 턴을 위해 prev 값을 최신화 시켜준다.
				}
				
				//해당 문자가 이미 나온 적 있는 경우 (그룹단어가 아님)
				else {
					return false; //함수종료->앞에 검사했었던 true였던 요소들도 모두 날라간다.
				}
			}
			
			//앞선 문자와 i번째 문자가 같다면?
			//else문은 없어도 됨
			else {
				continue;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("실행");
		int count=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) { //n번 입력한다.
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
