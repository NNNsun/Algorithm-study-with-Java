package String;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int[]arr=new int [26];
		for(int i=0; i<arr.length;i++) {
			arr[i]=-1;
		}
		for(int i=0; i<st.length();i++) {
			char c= st.charAt(i);
			
			if(arr[c-'a']==-1)  //ù ���ڸ� ������
				arr[c-'a']=i;
				
			
		}
		for(int k: arr) System.out.print(k+" ");
		
		
	}

}
