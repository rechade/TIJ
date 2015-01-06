// TIJ holding ex28 p301
package holding;
import java.util.*;
public class DoublesPriorityQueue {
	static final int NUM_VALUES = 22;
	static Queue<Double> q = new PriorityQueue<Double>();
	
	private static void fillQueue(Queue<Double> aQueue) {
		Random rand = new Random(47);
		for(int i=0; i<NUM_VALUES; i++) {
			aQueue.offer(rand.nextDouble());
		}
	}
	
	public static void main(String[] args) {
		fillQueue(q);
		System.out.println(q);
		while (!q.isEmpty()) {
			System.out.print(q.poll()+", ");
		}
	}
}
