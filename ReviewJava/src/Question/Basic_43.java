package Question;

import java.util.ArrayList;

//ArrayList�� ������ �迭 ->ArrayList �ȿ� �迭 == 2���� �迭�� ��
public class Basic_43 {

	public static void main(String[] args) {
		//[1]��ä����
		ArrayList<Integer[]> list3=new ArrayList<Integer[]>();
		//[2]�߰�
		list3.add(new Integer[] {11,12,13,14});
		list3.add(new Integer[] {21,22,23,24,25});
		list3.add(new Integer[] {31,32,33,34,35});
		//[3]���
		/*
		 * for(int i=0;i<list3.size();i++)
		 * 		System.out.println(list3.get(i)[0]);//11,21,31 
		 */
		System.out.println("-----------------------[��ü ��� ���]");
		for(int i=0;i<list3.size();i++) { //ArrayList���̸� �˱����� size()�̿�
			for(int j=0;j<list3.get(i).length;j++) //�迭�� ���̸� �˱����� length ���
				System.out.print(list3.get(i)[j]+" ");//11,21,31
			System.out.println();
		}
		System.out.println("-----------------------[��ü ��� ���]");
		
	}

}
