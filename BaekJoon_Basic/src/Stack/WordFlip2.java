package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;
public class WordFlip2 {

	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean inout = false;
		Stack<Character> buf = new Stack<>();
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)=='<') {
				inout=true;
				while(!buf.isEmpty()) {
					System.out.print(buf.pop());
				}
				System.out.print(str.charAt(i));
			}else if (str.charAt(i)=='>') {
				inout=false;
				System.out.print(str.charAt(i));
			}
			
			
			
			else if(inout){
				System.out.print(str.charAt(i));
			}else if (!inout) {
				if(str.charAt(i)==' ') {
					while(!buf.isEmpty()) {
						System.out.print(buf.pop());
					}
					System.out.print(str.charAt(i));
				}else {
					buf.push(str.charAt(i));
				}
			}
			
		}
		while(!buf.isEmpty()) {
			System.out.print(buf.pop());
		}
	}

}
