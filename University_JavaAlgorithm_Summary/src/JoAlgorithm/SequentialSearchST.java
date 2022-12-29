package JoAlgorithm;

import java.util.ArrayList;

//��� ����
class Node<K,V>{
	K key; V value; Node<K,V>next;
	
	
	public Node(K key, V value,Node<K,V>next) {
		this.key=key; this.value=value; this.next=next;
	}
}


//���Ḯ��Ʈ�� �̿��� ���� �˻�
//�˻�: ��� Ű�� ��ĵ�ϸ鼭 �Է� Ű���� ��ġ ���� Ȯ��
//����: ��� Ű�� ��ĵ�ϸ鼭 �Է� Ű���� ��ġ ���� Ȯ��, ��ġ�ϴ� Ű�� ������ ����Ʈ�� ���� �տ� (Ű,��)�� ���� �߰�
public class SequentialSearchST<K,V> {
	
	//first==�� �� pointer
	private Node<K,V>first;
	//��ü node�� ��
	int N;
	
	//Ű�� ������ ���� �������ش�
	public V get(K key) {
		//�տ������� ���������� �����Ѵ�
		for(Node<K,V> x=first; x!=null; x=x.next)
			//���� ���� �ִٸ� return ���ش�
			if(key.equals(x.key))	
				return x.value;		//search ����
		return null;				//search ����
	}
	//���� ó�� ��忡 Ű�� �Է��ϴ� �Լ�
	public void put(K key, V value) {
		//��� Ž��
		for(Node<K,V>x=first; x!=null; x=x.next)
			if(key.equals(x.key)) { //Ű�� ���� ���, ���� ����
				x.value=value;
				return;
			}
		first= new Node<K,V>(key,value,first); //Ű�� ������, �տ� ��� �߰�
		//��ü ��� ��++
		N++;
	}
	//
	public void delete(K key) {
		//first�� key�� ���� ���
		if(key.equals(first.key)) {
			//first�� ���� ��带 first�� �������ش� ->�ڿ������� first���� ���� delete�� �ȴ�.
			first=first.next; N--;
			return;
		}
		//first�� �����ϰ� ���ؾ��ϱ⶧���� x.next�� �������� ���Ѵ�.
		for(Node<K,V>x=first; x.next!=null;x=x.next) {
			if(key.equals(x.next.key)) {
				//x.next�� delete�ϱ����� x.next.next�� ������ش�.
				x.next=x.next.next;N--;
				return;
			}
		}
	}
	//Iterable:collection�� �߻�ȭ�� ��������� ���
	//key�� ��ȯ
	public Iterable<K>keys(){
		ArrayList<K> keyList =new ArrayList<K>(N);
		for(Node<K,V>x=first; x!=null; x=x.next)
			keyList.add(x.key);
		return keyList;
	}
	
	//���ԵǾ��ִ��� ������ Ȯ��
	public boolean contains(K key) {return get(key)!=null;}
	//������ִٸ� true
	public boolean isEmpty() {return N==0;}
	//���� ������
	public int size() {return N;}
	
}
