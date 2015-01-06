// TIJ reusing ex.13 p178
package reusing;
class Shoe {
	void tie(int i) {
		System.out.println("tie int");
	}
	void tie(float i) {
		System.out.println("tie float");
	}
	void tie(char i) {
		System.out.println("tie char");
	}	
}

class Brogues extends Shoe {	
	void tie(String s) {
		System.out.println("tie String");
	}	
}

public class BroguesTest {
	public static void main (String[] args) {
		Brogues b = new Brogues();
		b.tie('c');
		b.tie(1);
		b.tie(1.0f);
		b.tie("asdf");
	}	
}