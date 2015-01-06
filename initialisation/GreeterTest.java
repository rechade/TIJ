// TIJ initialisation ex.8
package initialisation;
class Greeter {
	void hello() {
		System.out.println("Hello.");
	}
	void sayHellos () {
		hello();
		// has to be in an object instance to use this
		// can't use this in a static method
		this.hello();
	}
}

public class GreeterTest {
	// you are not making a GreeterTest object. You are running a static main, so
	// you could make 
	GreeterTest () {
		System.out.println("constructed");
	}
	static Greeter g = new Greeter();
	public static void main (String[] args) {		
		Greeter h = new Greeter();
		g.sayHellos();
		h.sayHellos();
	}	
}