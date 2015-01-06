// TIJ initialisation, ex.10
package initialisation;
class Book2 {
	Book2 () {
		System.out.println("Got a new book");
	}
	public void finalize() {
		System.out.println("Sell me");
	}
}

public class Reader {
	public static void main (String[] args) {
		new Book2();
		//System.gc();
	}
}