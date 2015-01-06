// TIJ holding ex12 p289
package holding;
import java.util.*;

class ListIterators {
	static List<Integer> list1;
	static List<Integer> list2;
	static final int NUM_ITEMS = 12;	
	static void printIterator(Iterator it) {
		while (it.hasNext()){
			System.out.print(it.next()+ ", ");
		}
		System.out.println();
	}
	public static void main (String[] args) {		
		list1 = new ArrayList();
		list2 = new ArrayList();
		for (int i = 0; i<NUM_ITEMS; i++) {
			list1.add(i);
			list2.add(0);
		}
		ListIterator<Integer> li1 = list1.listIterator();
		ListIterator<Integer> li2 = list2.listIterator(NUM_ITEMS);		
		while (li1.hasNext()) {
			li2.previous();
			li2.set(li1.next());
		}
		printIterator(list1.listIterator());	
		printIterator(list2.listIterator());			
	}
}