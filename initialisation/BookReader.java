// TIJ initialisation, ex.10,11
package initialisation;
class Book {
	Book () {
		System.out.println("Got a new book");
	}
	protected void finalize() {
		System.out.println("Sell me");
	}
}

public class BookReader {
	public static void main (String[] args) {
		new Book();
		System.gc();
	}
}