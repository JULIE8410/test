package linkedList;

public class LinkedList {
	private Node head; // 누가 첫번째 인가?
	private Node tail; // 누가 마지막인가?
	private int size = 0; // 사이즈는 몇개?

	private class Node {
		private Object data; // 각 노드가 저장할 데이터
		private Node next; // 누가 다음 노드인가?

		public Node(Object input) {
			// input은 노드가 처음 생성시 가지는 값
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;

		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		// 사이즈가 0이면(데이터가 없으므로)
		if (size == 0) {
			addFirst(input); // 어디 넣어도 상관없으니까
		} else { // 데이터가 1개 이상 존재하는 경우
			tail.next = newNode;	// tail이 가리키고 있는 노드에서 (마지막 노드) next를 새로운 노드 가리키게 함
			tail = newNode;	// 테일은 새로 생성한 노드 가리킴  
			size++;
		}
	}

	Node node(int index) {
		Node x = head;
//		x = x.next;
//		x = x.next;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// 노드에 데이터 추가하기
	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1);  // 넣으려는 위치 -1 해서 index 넣어서 k-1 index가 가르키는 위치의 것 
			Node temp2 = temp1.next;  
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str = str + temp.data + ", ";
			temp = temp.next;
		}
		str = str + temp.data;
		return str +"]";
	}

}
