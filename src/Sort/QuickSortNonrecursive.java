package Sort;

import java.util.Arrays;
//������ �̿��� ������
class IntStack {
	private int max; // ���� �뷮
	private int ptr; // ���� ������, �׳� int ����
	private int[] stk; // ���� ��ü

	// ���� �� ����: ������ ��� ����
	public class EmptyIntStackExcption extends RuntimeException {
		public EmptyIntStackExcption() {}
	}

	// ���� �� ����: ������ ���� ��
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}

	// ������
	public IntStack(int capacity) {// capcity: �뷮
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭�� ����, stack element�� �� = stk[0]~stk[max-1]
		} catch (OutOfMemoryError e) { // �����Ҽ� ����
			max = 0;
		}
	}

	// ���ÿ� x�� push
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) { // ������ �������� ���
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;

	}

	// ���ÿ��� �����͸� pop(���� �ִ� data�ϳ��� ����)
	public int pop() throws EmptyIntStackExcption {
		if (ptr <= 0)
			throw new EmptyIntStackExcption();
		return stk[--ptr];
	}

	// ���ÿ��� �����͸� peek(���� �ִ� data�� ���� ��)
	public int peek() throws EmptyIntStackExcption {
		if (ptr <= 0)
			throw new EmptyIntStackExcption();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� ã�� �ε���(������ -1)��ȯ
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}

	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}

	// ������ ����°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� ã�°�?
	public boolean isFull() {
		return ptr >= max;
	}

	// ���� ���� ��� �����͸� �ٴ�->����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ������ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}

}

public class QuickSortNonrecursive {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void quickSort2(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		lstack.push(left);
		rstack.push(right);

		while (lstack.isEmpty() != true) {
			int pl = left = lstack.pop();// ���� Ŀ��
			int pr = right = rstack.pop();// ������ Ŀ��
			int x = a[(left + right) / 2]; // �ǹ�
			do {
				while (a[pl] < x)
					pl++;
				while (a[pr] > x)
					pr--;
				if(pl<=pr)
					swap(a,pl++,pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);
				rstack.push(pr);
			}
			if (pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}

	}

	public static void main(String[] args) {
		int[] a = new int[8];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.print("�� ���� ��: ");
		System.out.println(Arrays.toString(a));
		quickSort2(a, 0, (a.length-1));
		System.out.print("������������ �����߽��ϴ�: ");
		System.out.println(Arrays.toString(a));
		
	}

}
