// TIJ holding, ex14 p291
package holding;
import java.util.*;

class MiddleInsertion {
	static final int NUM_ITEMS = 4;
	static LinkedList<Integer> list1 = new LinkedList<Integer>();
	public static void main (String[] args) {
		ListIterator<Integer> li1;
		for (int i=0; i< Integer.parseInt(args[0]); i++) {
			int index = i/2;			
			li1 = list1.listIterator();
			for (int j=0; j<index; j++) {
				li1.next();
			}
			li1.add(i);
		}
		System.out.println(list1);
	}	
}