// TIJ exceptions ex4, 5, 8, 28 p319
package exceptions;

class Wronggg extends Exception {
	private String message;
	Wronggg(){}
	Wronggg(String s){
		super(s);
		message = s;
	}
	public void display() {
		System.err.println(message);
	}
}


public class DoingItWrong {
	static int i =0;
	static void checkSentinel(int sentinel) throws Wronggg {
		if (sentinel < 3) {
			throw new Wronggg("sentinel =" +i); 
		}
	}
	public static void main(String[] args) {
		while (true) {
			try {	
				checkSentinel(i);
			} catch (Wronggg w) {
				System.out.println(w.getMessage());
				System.out.println("You're doing it wrong! i =" + i);
				i++;
				continue;
			}
			break;
		}
		System.out.println("Done jeah boyeee");
	}
}
