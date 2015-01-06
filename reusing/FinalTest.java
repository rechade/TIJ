// TIJ reusing, ex.18
package reusing;
import java.util.*;

class FinalHolder {
	static final int MAX = 3;
	final int id;
	FinalHolder(int i) {
		this.id = i;
		//this.id = i;
	}
	public String toString() {
		return ("MAX = " + MAX + " id = " + id);
	}
}

class FinalTest {
	public static void main (String[] args) {
		Random rand = new Random(22);
		FinalHolder f = new FinalHolder(rand.nextInt());
		System.out.println(f);  
		// create a new instance of FinalHolder.
		// MAX will not change but a new object at a new
		// reference will be created with a new random id
		f = new FinalHolder(rand.nextInt());
		System.out.println(f);		
	}	
}