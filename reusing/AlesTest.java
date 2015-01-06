// TIJ reusing, Ex.8 p171
package reusing;
class Ale {
	Ale (int i) {
		System.out.println ("Ale constructed: " + i);
	}
}

class Blonde extends Ale {
	Blonde() {
		super (0);
		System.out.println ("Blonde constructed: " + 0);
	}
	
	Blonde(int i) {
		super (i);
		System.out.println ("Blonde constructed: " + i);
	}
}

public class AlesTest {
	public static void main (String[] args) {
		Blonde b;
		if (args.length > 0) {
				for (String s: args) {							
						b = new Blonde(Integer.parseInt(s));
				}
		} else {
			b = new Blonde();		
		}
	}	
}