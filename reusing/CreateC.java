// TIJ reusing, ex.5, 7
package reusing;
class A {
	static {
		System.out.println("Static Block A");
	}
	int bounces;
	A(int i) {			
		System.out.println("Making an A");
		bounces = i;
	}
}

class B {
	int skips;
 	B(int j) {
 		System.out.println("Making a B");
 		skips = j;
 	}
 	
}

class C extends A {	
	private B myObject;
	C () {
		super(0);
		myObject = new B(0);
		System.out.println("Making a C");
	}
}

public class CreateC {
	
	public static void main (String[] args) {
		C objectC = new C();
		// results (ex5):
		// Static Block A (base class statics) 
		// Making a B (derived class C's statics)  
		// ^^ static access and init (base to derived) before constructors (base to derived)
		// making an A (base class constr)
		// making a C (derived class constr)
	}
}