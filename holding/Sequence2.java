// TIJ holding ex9 p288 - based on
//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package holding;
import java.util.*;

public class Sequence2 {
	public Iterator<Object> it;	
	public Sequence2(int size) { 
		maxItems = size; 
		it = items.iterator();
		currentObject = it.next();
	}
	public void add(Object x) {
		if (items.size() < maxItems) {			
			items.add(x);
		} else {
			System.out.println("can't add more to items, max size is " + maxItems);
		}
	}
	private Object currentObject;
	private int maxItems;
	private ArrayList<Object> items = new ArrayList<Object>();	
	
	public static void main(String[] args) {
		Sequence2 sequence = new Sequence2(10);
		for(int i = 0; i < 11; i++)
			sequence.add(Integer.toString(i));
		while(sequence.it.hasNext()) {
			System.out.print(sequence.it.next() + " ");
		}
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
