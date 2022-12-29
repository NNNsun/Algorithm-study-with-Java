package Hash;

public class OpenHash <K,V> {
	//��Ŷ�� ����
	enum Status {OCCUPIED,EMPTY,DELETED};	//{������ ����, �������, ����}
	
	//��Ŷ
	static class Bucket<K,V>{
		private K key;			//Ű��
		private V data;			//������
		private Status stat;	//����
		
		//������
		Bucket(){
			stat=Status.EMPTY;	//��Ŷ�� �������
		}
		
		void set(K key, V data, Status stat) {
			this.key=key;			//Ű ��
			this.data=data;			//������
			this.stat=stat;			//����
		}
		
		//���¸� �����մϴ�.
		void setStat(Status stat) {
			this.stat=stat;
		}
		
		//�� ���� ��ȯ�մϴ�.
		K getKey() {
			return key;
		}
		//�����͸� ��ȯ�մϴ�.
		V getValue() {
			return data;
		}
		
		//Ű�� �ؽ� ���� ��ȯ�մϴ�.
		public int hashcode() {
			return key.hashCode();
		}
	}
	private int size;		//�ؽ� ���̺��� ũ��
	private Bucket<K,V>[] table; //�ؽ� ���̺�
	
	//������
	public OpenHash(int size) {
		try {
			table=new Bucket[size];
			for (int i=0;i<size;i++)
				table[i]=new Bucket<K,V>();
			this.size=size;
		}catch (OutOfMemoryError e) {	//���̺��� �����Ҽ�����
			this.size=0;
		}
	}
	//�ؽð��� ����
	public int hashValue(Object key) {
		return key.hashCode()%size;
	}
	//���ؽ� ���� ����
	public int rehashValue(int hash) {
		return (hash+1)%size;
	}
	//Ű �� key�� ���� ��Ŷ�� �˻�
	private Bucket<K,V> searchNode(K key){
		int hash = hashValue(key);
		Bucket<K,V>p=table[hash];
		
		for(int i=0; p.stat != Status.EMPTY&&i<size;i++) {
			if(p.stat==Status.OCCUPIED&&p.getKey().equals(key))
				return p;
			hash=hashValue(hash);	//���ؽ�
			p=table[hash];
		}
		return null;
	}
	//Ű �� key�� ���� ����� �˻�(�����͸� ��ȯ)
	public V search(K key) {
		Bucket<K,V> p =searchNode(key);
		if(p!=null)
			return p.getValue();
		else
			return null;
	}
	//Ű �� key, �����͸� ���� ��� �߰�
	public int add(K key, V data) {
		if(search(key)!=null)
			return 1;					//�� Ű���� �̹� ��ϵ�
		
		int hash=hashValue(key);		//�߰��� �������� �ؽð�
		Bucket<K,V>p=table[hash];		//���� ��Ŷ
		for(int i=0; i<size; i++) {
			if(p.stat==Status.EMPTY||p.stat==Status.DELETED) {
				p.set(key, data, Status.OCCUPIED);
				return 0;
			}
			hash=rehashValue(hash); //���ؽ�
			p=table[hash];
		}
		return 2;
	}
	//Ű �� key�� ���� ����� ����
	public int remove(K key) {
		Bucket<K,V>p=searchNode(key);	//���ù�Ŷ
		if(p==null)
			return 1;
		p.setStat(Status.DELETED);
		return 0;
	}
	//�ؽ� ���̺��� ����
	public void dump() {
		for(int i=0; i<size; i++) {
			System.out.printf("%02d",i);
			switch (table[i].stat) {
			case OCCUPIED:
				System.out.printf("%s (%s)\n",table[i].getKey(),table[i].getValue());
				break;
			case EMPTY:
				System.out.println("---�̵��---");break;
				
			case DELETED:
				System.out.println("--���� ��ħ--");break;
			}
		}
	}
	
}
