package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class FiveBigNumber {

	static final int MAX = 1_000_001;
	public static void main(String[] args) throws  IOException {
		
		System.out.println("½ÇÇà");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack =new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int []arr = new int[n];
		int ans[] = new int[n];
		int []arrbigN = new int[MAX];
		
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			arrbigN[arr[i]]++;
		}
		
		   for(int i=0; i<n; i++) {
	            while(!stack.empty() && arrbigN[arr[i]]>arrbigN[arr[stack.peek()]]) {
	                ans[stack.pop()] = arr[i];
	            }
	            stack.push(i);
	        }
	        
	        while(!stack.empty()) {
	            ans[stack.pop()] = -1;
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i=0; i<n; i++) {
	        	sb.append(ans[i] + " ");
	        }
	        System.out.println(sb.toString());
		}

}
