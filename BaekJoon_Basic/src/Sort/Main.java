package Sort;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("./salmon_bass_data.csv");
		BufferedReader br = new BufferedReader(fr);
		br.readLine();

		StringBuffer sb = new StringBuffer();
		String line;
		int length = 0;
		int num = 0;
		int count = 0;

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(",");
			// System.out.println(strArr[1]);
			sb.append(strArr[1]+" ");
			//System.out.println(strArr[2]);
			num = Integer.parseInt(strArr[1]);
			count++;
			// System.out.println(num);
			if (num > length)
				length = num;
		}
		//System.out.println(count);
		int[] histogram = new int[length + 1];
		StringTokenizer st = new StringTokenizer(sb.toString(), " ");
		while (count-- > 0) {//318
			String str = st.nextToken();
			int k = Integer.parseInt(str);
			histogram[k]++;
		}
		for (int i = 0; i < histogram.length; i++) {
			int d = histogram[i];
			if (d != 0) {
				System.out.print(i + "cm" + "\t");
				System.out.print("|");
				for (int j = 0; j < d; j++) {
					System.out.print("+");
				}
				System.out.println();
			}
		}
	}
}
