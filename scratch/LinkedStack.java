public class LinkedStack<T> {
	
	private static class Node<U> {
		U item;
		Node<U> next;
		Node(U item, Node next) {
			this.item = item;
			this.next = next;
		}		
		Node() {
			this.item = null;
			this.next = null;
		}		
	}
	
	
	
	Node<T> top;
	LinkedStack() {
		top = new Node<T>();
	}
	void push(T item){
		Node<T> temp = new Node<T>(item, top);
		top = temp;
	}
	T pop() {
		T popped = top.item;
		if (null!=top.next){
			top = top.next;
		}
		return popped;
	}
	public static void main (String[] args) {
		LinkedStack<Integer> ls = new LinkedStack<Integer>();
		ls.push(1);
		ls.push(2);
		ls.push(3);
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
	}
}
	
	