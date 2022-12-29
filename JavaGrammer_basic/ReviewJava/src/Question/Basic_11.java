package Question;

public class Basic_11 {

	public static void main(String[] args) {
		// 배열==동일한 데이터 타입의 값들을 하나의 배열명으로 저장하는 자료구조
		// python은 여러 데이터 타입의 값을 넣을수있다!!

		// 배열 선언
		// 데이터타입[] 배열명=new 데이터타입[배열크기]->standard
		// 배열선언->크기지정-> 배열 공간의 값은 자동으로 초기화(정수형:0,실수형:0.0)

		int[] sales_table = new int[4];// 0으로 초기화 되어있음
		double[] sales_table2 = new double[100];
		System.out.println(sales_table[2]);// 인덱스로 배열을 개별로 접근할 수 있음
		System.out.println(sales_table2[45]);// 0.0
		int arr_size=sales_table.length; //배열의 크기
		System.out.println(sales_table[arr_size-1]);//마지막 배열
		
		int[]arr1 = {3,11,22,33,44,55}; //대중적, 가장 축약형
		int[]arr2=new int[]{3,11,22,33,44,55}; //축약형,번거로움->다음 예제를 위해 필요함
		int[]arr3;
		arr3= new int[]{3,11,22,33,44,55};//new int[]필요!
		for(int i:arr3) {
			System.out.println(i);//i만 쓴다, arr[i]형식 x
		}
		
		int[]arr4= {3,4,5,6,7,8};
		double[]arr5= {3.2,4.1,5.2,6.1,7.4,8.6};
		
		System.out.println(arr4);//[I@4361bd48->I:정수형 의미
		System.out.println(arr5);//[D@53bd815b->D:실수형 의미
		
	}

}
