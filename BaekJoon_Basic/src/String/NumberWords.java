package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberWords {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st= new StringTokenizer(str," "); //StringTokenizer�� Ȱ��
		System.out.println(st.countTokens());
	}

}
