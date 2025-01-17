package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
	
	public static int[] stack;
	public static int size=0;

	public static void push(int item) {
		stack[size]=item;
		size++;
	}
	
	public static int pop() {
		if(size==0) {
			return -1;
		}
		else {
			int res = stack[size-1];
			stack[size -1]=0;
			size--;
			return res;
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static int top() {
		if(size==0) {
			return -1;
		}
		else {
			return stack[size-1];
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int n =Integer.parseInt(br.readLine());
		
		stack=new int[n];
		
		
		while(n-- > 0) {
			st=new StringTokenizer(br.readLine()," ");
			
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":	
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	
	}

}
