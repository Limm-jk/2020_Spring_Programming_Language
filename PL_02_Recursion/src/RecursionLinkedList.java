
public class RecursionLinkedList {
	private Node head;
	private static char UNDEF = Character.MIN_VALUE;
	
	private void linkFirst(char element) {
		head = new Node(element,head);
		//노드의 처음으로 연결
	}
	private void linkLast(char element, Node x) {
		//과제1
		//recursion사용
		//x의 마지막으로 연결된 노드의 다음
		//ele는 데이터 x는 노드
		if(x.next == null) {
			x.next = new Node(element,null);
			return;
		}
		linkLast(element,x.next);//다음이 null일때까지 재귀
	}
	private void linkNext(char element, Node pred) {
		Node next = pred.next;
		pred.next = new Node(element,next);
		//pred의 다음에 연결
	}
	private char unlinkedFirst() {
		Node x = head;
		char element = x.item;
		head = head.next;
		x.item = UNDEF;
		x.next = null;
		return element;//첫 노드 데이터
		//리스트의 첫 노드 해제
	}
	private char unlinkedNext(Node pred) {
		Node x = pred.next;
		Node next = x.next;
		char element = x.item;
		x.item = UNDEF;
		x.next = null;
		pred.next = next;
		return element;//첫 노드 데이터
		//리스트의 첫 노드 해제
	}
	private Node node(int index, Node x) {
		//과제 2
		// x에서 index만큼 떨어진 노드 반환
		//recursion사용
		if(index == 0) return x;
		return node(index-1,x.next);
	}
	private int length(Node x) {
		//과제 3
		//x부터 끝까지 노드 수 반환
		//rexursion사용
		int count = 1;
		
		if(x.next == null) return 1;//자기자신일때 1
		
		return count+length(x.next);//재귀 반복마다 1씩증가
	}
	private String toString(Node X) {
		//과제 4
		//노드부터 시작하는 리스트의 내용 반환
		String st = Character.toString(X.item);//element가 char형이므로 string으로 변환
		if(X.next == null) {
			return st;//끝이면 리턴
		}
		return st.concat(toString(X.next));//뒤부터 하나씩 붙여나감
	}
	private void reverse(Node x, Node pred) {
		//과제 5
		//이전노드부터 리스트 끝까지 거꾸로
		//x현재노드 pred 이전노드
		if(x.next == null) {
			head = x;
			x.next = pred;
			return;
		}
		reverse(x.next, x);
		x.next = pred;
		//맨 끝까지 탐색해 들어간 이후에, 노드의 진행방향을 바꾸어준다.
	}
	public void reverse() {
		//그냥 거꾸로 ㅎ
		reverse(head, null);
	}
	private void addAll(Node x, Node y) {
		//과제 6
		//두 리스트를 합침
		//x는 1번리스트의노드
		//y는 2번 리스트의 head
		//x의 뒤에 y부터
		//y는 새로만들어서 쓰도록햐여라
		//y합쳐도 y가 살아있어야함
		if(y.next == null) {
			this.linkNext(y.item, x);//마지막인경우 붙이고 return
			return;
		}
		this.linkNext(y.item, x);
		//처음부터 하나붙이고 재귀 하나붙이고 재귀식으로 전체를 붙임
		this.addAll(x.next, y.next);//점점 작아지는 y
	}
	public void addAll(RecursionLinkedList list) {
		addAll(this.head, list.head);
		//두리스트를 합침
	}
	public boolean add(char element) {
		if(head == null) {
			linkFirst(element);
		}
		else {
			linkLast(element, head);
		}
		return true;
		//원소를 리스트 마지막에 추가
	}
	public void add(int index, char element) {
		//원소를 주어진 index의 위치에 추가
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
		//index위치의 원소 반환
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
