package linkedList;


public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(1);
		
		numbers.add(1, 15);
		
		//System.out.println(numbers.node(2));
		
		//numbers.add(2, 25); // 20, 30 사이에 추가하고 싶을때
		
		System.out.println(numbers);
		
		
	}
}
