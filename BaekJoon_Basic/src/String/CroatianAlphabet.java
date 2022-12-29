package String;

import java.util.Scanner;

public class CroatianAlphabet {

	public static void main(String[] args) {
		System.out.println("½ÇÇà");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (a == 'c') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			} 
			else if (a == 'd') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'z') {
						if (i < str.length() - 2) {
							if (str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					} 
					else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			else if (a == 'l') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			} 
			else if (a == 'n') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			else if (a == 's') {
				if (i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						i++;
					}
				}
			} 
			else if (a == 'z') {
				if (i < str.length() - 1) {
						if (str.charAt(i + 1) == '=') {
							i++;
						}
				}
			}
			
			count++;
			
		}
		
		
		System.out.println(count);
	}

}
