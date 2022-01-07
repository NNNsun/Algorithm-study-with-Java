package Question;
import java.util.*;
public class Basic_12 {

	public static void main(String[] args) {
		//Array class : 반복문을 사용하지않고 출력 가능
		int[]arr= {123,124,45,62,23,24};
		System.out.print(Arrays.toString(arr)+" ");//[123, 124, 45, 62, 23, 24] 괄호도 출력
		System.out.println("\n");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		//int a[], b[], c[];  /(대중적) int[] a,b,c; 다중배열선언 가능
		//int a[],b,c; -> b,c는 정수형으로만 선언된다.
		
		//배열복사 메서드 arraycoppy()System.arraycopy(원본배열명,원본복사시작인덱스,복사배열명,복사될 배열의 시작위치,길이)
		int[]arr1= {1,2,3,4,5};
		int[]arr2= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\n");
		System.arraycopy(arr1, 2, arr2, 4, 3);
		System.out.println(Arrays.toString(arr2));//5,6,7 대신 입력됨
	}

}
