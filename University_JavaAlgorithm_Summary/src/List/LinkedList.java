package List;

import java.util.Comparator;

public class LinkedList<E> {
	class Node<E>{
		//���
		private E data;			//������
		private Node<E>next;	//���� ������(���� ��� ����)
		
		//������
		Node(E data, Node<E> next){
			this.data=data;
			this.next=next;
		}
	}
	private Node<E> head;	//�Ӹ����
	private Node<E> crnt;	//���� ���
	//��� �˻�
	public E search(E obj, Comparator<? super E> c ) {
		Node<E> ptr=head;					 //���� ��ĵ ���� ���
		
		while (ptr!=null) {
			if(c.compare(obj, ptr.data)==0) {//�˻�����
				crnt=ptr;
				return ptr.data;
			}
			ptr=ptr.next;					 //���� ��带 ����
		}
		return null;						 //�˻� ����
	}
	//�Ӹ��� ��� ����
	public void addFirst(E obj) {
		Node<E>ptr=head;
		head=crnt=new Node<E>(obj,ptr);
	}
	//������ ��� ����
	public void addLast(E obj) {
		if(head==null)
			addFirst(obj);
		else {
			Node<E> ptr=head;
			while (ptr.next!=null)
				ptr=ptr.next;
			ptr.next=crnt=new Node<E>(obj,null);
		}
	}
	//�Ӹ� ��带 ����
	public void removeFirst() {
		if(head!=null)
			head=crnt=head.next;//head.next�� null�̱� ������ �ᱹ head�� null�� �Ǿ� ������ ���� ȿ���� �Ͼ.
	}
	//���� ��带 ����
	public void removeLast() {
		if(head!=null) {
			if(head.next==null)
				removeFirst(); 				//head�� ������� ����
			else {
				Node<E>ptr=head;			//��ĵ���� ���
				Node<E>pre=head;			//��ĵ���� ����� ���� ���
				while (ptr.next!=null) {	//pre-ptr������ �����ϰ� ��
					pre=ptr;		
					ptr=ptr.next;
				}
				pre.next=null;				//ptr�� null�� ����(����)
				crnt=pre;
			}
		}
	}
	//��� p�� ����
	public void remove(Node p) {
		if(head!=null) {
			if(p==head)
				removeFirst();
			else{
				Node<E> ptr=head;
				
				while (ptr.next!=p) {
					ptr=ptr.next;
					if(ptr==null)return; //p�� ����Ʈ�� �����ϴ�.
				}
				ptr.next=p.next; //ptr - p - p.next ���̿��µ� ptr�� next�� p.next�� �Ǿ������ ������ ȿ���� ���� �� ����.
				crnt=ptr;
			}
		}
	}
	//���ó�带 ����
	public void remveCurrentNode() {
		remove(crnt);
	}
	//��� ��带 ����
	public void clear() {
		while (head!=null)		
			removeFirst();	//��忡 �ƹ��͵� ������ ���� head��带 ����
		crnt=null;
	}
	//���ó�带 �ϳ� �������� �̵�
	public boolean next() {
		if(crnt==null||crnt.next==null)	//����ó��
			return false;
		crnt=crnt.next;
		return true;
	}
	//���ó�带 ���
	public void printCurrentNode() {
		if(crnt==null)
			System.out.println("������ ��尡 �����ϴ�.");
		else
			System.out.println(crnt.data);
	}
	//��� ��带 ���
	public void dump() {
		Node<E>ptr=head;
		
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}
