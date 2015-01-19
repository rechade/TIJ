// TIJ generics p449 ex7
import java.util.*;
class ComposedIterableFibonacci implements Iterable<Integer> {
		
	private Fibonacci f = new Fibonacci();
	
	private int n;
	ComposedIterableFibonacci(int count) {
		n=count;
	}	
		
 	public Iterator<Integer> iterator() {
 		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n>0;
			}
			public Integer next() {
				n--;
				return f.next();
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}	
 		};
 	}
 	public static void main (String[] args) {
 		ComposedIterableFibonacci cif = new ComposedIterableFibonacci(10);
 		for (int fib: cif) {
 			System.out.println(fib);
 		}
	}
}