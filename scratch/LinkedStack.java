public class LinkedStack<T> {
	
	private class Node {
		T item;
		Node next;
		Node(T item, Node next) {
			this.item = item;
			this.next = next;
		}		
		Node() {
			this.item = null;
			this.next = null;
		}		
	}	
	
	Node top;
	LinkedStack() {
		top = new Node();
	}
	void push(T item){
		Node temp = new Node(item, top);
		top = temp;
	}
	T pop() {
		T popped = (T)top.item;
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
	
	