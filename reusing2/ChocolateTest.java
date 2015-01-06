// TIJ reusing, ex15
package reusing2;
import reusing.*;

class Aero extends Chocolate {
	void consume () {
		super.eat();	
	}
}

public class ChocolateTest {
	public static void main (String[] args) {
		Aero a = new Aero();
		a.consume();
	}
}