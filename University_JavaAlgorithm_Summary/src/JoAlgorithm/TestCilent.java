package JoAlgorithm;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TestCilent {
	public static void main(String[] args) {
		//<key:����, value:����>�� �̷���� ����
		SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
		File file;
		//�ڹٽ���
		//JFileChooser : �������� ���Ͽ���, ������ ���� ������ Dialog�� ����Ҽ�����
		final JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) file= fc.getSelectedFile();
		else {
			JOptionPane.showMessageDialog(null, "������ �����ϼ���","����",JOptionPane.ERROR_MESSAGE);
			return;
		}
		Scanner sc = null;
		try {
			sc=new Scanner(file);
			for(int i=0;sc.hasNext(); i++) {String key= sc.next(); st.put(key,i);}
			for(String s : st.keys()) System.out.print(s+" "+st.get(s));
		}catch (FileNotFoundException e ) {e.printStackTrace();}
		if(sc != null) sc.close();
		
	}

}
