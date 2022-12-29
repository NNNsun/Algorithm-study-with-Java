package String;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {
		System.out.println("실행");
		Scanner sc=new Scanner(System.in);
		int []abc=new int[26];
		
		String s=sc.next();
		
		for(int i=0; i<s.length();i++) {
			if('A'<=s.charAt(i)&&s.charAt(i)<='Z') {
				abc[s.charAt(i)-'A']++;
			}
			else {
				abc[s.charAt(i)-'a']++;
			}
		}
		int max=-1;
		char ch='?';
		for(int i=0; i<26;i++) {
			if(abc[i]>max) {
				max=abc[i];
				ch=(char)(i+65); //65+i 아스키코드를 대문자로 변환
			}
			else if (abc[i]==max) {
				ch='?';
			}
		}
		System.out.print(ch);
	}

}
