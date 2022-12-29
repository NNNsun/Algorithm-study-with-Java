package JoAlgorithm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HW1 extends AbstractSort {
	static void reset(String[] a, ArrayList<String> list) {
		for (int i = 0; i < a.length; i++) {
			a[i] = list.get(i);
		}
	}
	public static void main(String[] args) throws IOException {
		System.out.println("�Է� ���� �̸���? ");
		Scanner sc = new Scanner(System.in);
		
		Scanner fs = new Scanner(new File(sc.next()));
		ArrayList<String> list = new ArrayList<>();
		String str = "";
		while (fs.hasNext()) {
			str = fs.next();
			list.add(str);
		}
		System.out.println("1. �ܾ��� �� = " + list.size());
		String[] text = new String[list.size()];
		reset(text, list);
		System.out.println(" ��ø� ��ٷ��ּ���...");
		long begin1 = System.currentTimeMillis();
		Selection.sort(text);
		long finish1 = System.currentTimeMillis();
		
		System.out.println("2. ��������: ���� ���� =" + isSorted(text) + ", �ҿ� �ð� = " + (finish1 - begin1) + "ms");
		reset(text, list);
		System.out.println(" ��ø� ��ٷ��ּ���...");
		long begin2 = System.currentTimeMillis();
		Insertion.sort(text);
		long finish2 = System.currentTimeMillis();
		
		System.out.println("3. ��������: ���� ���� =" + isSorted(text) + ", �ҿ� �ð� = " + (finish2 - begin2) + "ms");
		reset(text, list);
		
		long begin3 = System.currentTimeMillis();
		Shell.sort(text);
		long finish3 = System.currentTimeMillis();
		
		System.out.println("4. Shell����: ���� ���� =" +isSorted(text) + ", �ҿ� �ð� = " + (finish3 - begin3) + "ms");
		reset(text, list);
		
		long begin4 = System.currentTimeMillis();
		MergeTD.sort(text);
		long finish4 = System.currentTimeMillis();
		
		System.out.println("5. Top Down �պ�����: ���� ���� =" + isSorted(text) + ", �ҿ� �ð� = " + (finish4 - begin4) + "ms");
		reset(text, list);
		
		long begin5 = System.currentTimeMillis();
		MergeBU.sort(text);
		long finish5 = System.currentTimeMillis();
		
		System.out.println("6. Bottom Up �պ�����: ���� ���� =" + isSorted(text) + ", �ҿ� �ð� = " + (finish5 - begin5) + "ms");

	}

}
