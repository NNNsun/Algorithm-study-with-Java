package Question;

public class Basic_02 {

	public static void main(String[] args) {
		
		//byte, short, int, long, char�� ũ�� (�빮��==����Ŭ����)
		//1byte==8bit(Size)
		System.out.println("int == "+Integer.BYTES+"byte");
		System.out.println("int == "+Integer.SIZE+"bit");
		System.out.println("int�� ���� == "+ Integer.MIN_VALUE+" ~" + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("char == "+Character.BYTES+"byte");
		System.out.println("char == "+Character.SIZE+"bit");
		//������ Ÿ���̶� ���ڷ� ���� �� ����-> ����ȯ �ʿ�
		System.out.println("char�� �ִ� ũ��(�̻��� ��) == "+ Character.MIN_VALUE+" ~ "+ Character.MAX_VALUE);
		//char�� ������ ����
		System.out.println("char�� �ִ� ũ��(����) == "+ (int)Character.MIN_VALUE+" ~ "+ (int)Character.MAX_VALUE);
		
	}

}
