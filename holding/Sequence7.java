// TIJ ex9, p288
//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package holding;
import java.util.*;
interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence7 {
	private Object[] items;
	private int next = 0;
	public Sequence7(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
		  items[next++] = x;
	}
	private class SequenceIterator implements Iterator<Object> {
		private int index = 0;
		public Object next() {return items[index++];}
		public boolean hasNext() {return index<items.length;}
		public void remove() { // not implemented for plain array[]
		}
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public SequenceIterator iterator() {
		return new SequenceIterator();
	}
	public static void main(String[] args) {
		Sequence7 sequence = new Sequence7(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		/*
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		*/
		SequenceIterator si = sequence.iterator();
		sequence.testSequenceIterator(si);
	}
	public void testSequenceIterator(Iterator<Object> it) {
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
