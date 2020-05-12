
public class RecursionLinkedList {
	private Node head;
	private static char UNDEF = Character.MIN_VALUE;
	
	private void linkFirst(char element) {
		head = new Node(element,head);
		//����� ó������ ����
	}
	private void linkLast(char element, Node x) {
		//����1
		//recursion���
		//x�� ���������� ����� ����� ����
		//ele�� ������ x�� ���
		if(x.next == null) {
			x.next = new Node(element,null);
			return;
		}
		linkLast(element,x.next);//������ null�϶����� ���
	}
	private void linkNext(char element, Node pred) {
		Node next = pred.next;
		pred.next = new Node(element,next);
		//pred�� ������ ����
	}
	private char unlinkedFirst() {
		Node x = head;
		char element = x.item;
		head = head.next;
		x.item = UNDEF;
		x.next = null;
		return element;//ù ��� ������
		//����Ʈ�� ù ��� ����
	}
	private char unlinkedNext(Node pred) {
		Node x = pred.next;
		Node next = x.next;
		char element = x.item;
		x.item = UNDEF;
		x.next = null;
		pred.next = next;
		return element;//ù ��� ������
		//����Ʈ�� ù ��� ����
	}
	private Node node(int index, Node x) {
		//���� 2
		// x���� index��ŭ ������ ��� ��ȯ
		//recursion���
		if(index == 0) return x;
		return node(index-1,x.next);
	}
	private int length(Node x) {
		//���� 3
		//x���� ������ ��� �� ��ȯ
		//rexursion���
		int count = 1;
		
		if(x.next == null) return 1;//�ڱ��ڽ��϶� 1
		
		return count+length(x.next);//��� �ݺ����� 1������
	}
	private String toString(Node X) {
		//���� 4
		//������ �����ϴ� ����Ʈ�� ���� ��ȯ
		String st = Character.toString(X.item);//element�� char���̹Ƿ� string���� ��ȯ
		if(X.next == null) {
			return st;//���̸� ����
		}
		return st.concat(toString(X.next));//�ں��� �ϳ��� �ٿ�����
	}
	private void reverse(Node x, Node pred) {
		//���� 5
		//���������� ����Ʈ ������ �Ųٷ�
		//x������ pred �������
		if(x.next == null) {
			head = x;
			x.next = pred;
			return;
		}
		reverse(x.next, x);
		x.next = pred;
		//�� ������ Ž���� �� ���Ŀ�, ����� ��������� �ٲپ��ش�.
	}
	public void reverse() {
		//�׳� �Ųٷ� ��
		reverse(head, null);
	}
	private void addAll(Node x, Node y) {
		//���� 6
		//�� ����Ʈ�� ��ħ
		//x�� 1������Ʈ�ǳ��
		//y�� 2�� ����Ʈ�� head
		//x�� �ڿ� y����
		//y�� ���θ��� �������Ῡ��
		//y���ĵ� y�� ����־����
		if(y.next == null) {
			this.linkNext(y.item, x);//�������ΰ�� ���̰� return
			return;
		}
		this.linkNext(y.item, x);
		//ó������ �ϳ����̰� ��� �ϳ����̰� ��ͽ����� ��ü�� ����
		this.addAll(x.next, y.next);//���� �۾����� y
	}
	public void addAll(RecursionLinkedList list) {
		addAll(this.head, list.head);
		//�θ���Ʈ�� ��ħ
	}
	public boolean add(char element) {
		if(head == null) {
			linkFirst(element);
		}
		else {
			linkLast(element, head);
		}
		return true;
		//���Ҹ� ����Ʈ �������� �߰�
	}
	public void add(int index, char element) {
		//���Ҹ� �־��� index�� ��ġ�� �߰�
		if(!(index >= 0 && index <= size())) {
			throw new IndexOutOfBoundsException(""+index);
		}
		if(index == 0)
			linkFirst(element);
		else
			linkNext(element, node(index-1, head));
	}
	public char get(int index) {
		if(!(index >= 0 && index < size())) {
			throw new IndexOutOfBoundsException(""+index);
		}
		
		return node(index, head).item;
		//index��ġ�� ���� ��ȯ
	}
	public char remove(int index) {
		if(!(index >= 0 && index < size())) {
			throw new IndexOutOfBoundsException(""+index);
		}
		if(index == 0) {
			return unlinkedFirst();
		}
		return unlinkedNext(node(index-1,head));
	}
	public int size() {
		return length(head);
	}
	@Override
	public String toString() {
		if(head == null) return "[]";
		
		return "[" + toString(head) + "]";
	}
	private static class Node{
		char item;
		Node next;
		
		Node(char element, Node next){
			this.item = element;
			this.next = next;
		}
	}
}
