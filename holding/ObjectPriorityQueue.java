// TIJ holding ex29 p301
package holding;
import java.util.*;

class EmptyObject extends Object implements Comparable<EmptyObject> {
	public int compareTo (EmptyObject e) {
		return -1;
	}
}

public class ObjectPriorityQueue {
	
	static Queue<EmptyObject> q = new PriorityQueue<EmptyObject>();	
	
	public static void main(String[] args) {
		q.offer(new EmptyObject());
		q.offer(new EmptyObject());
	}
}