// TIJ reusing ex.8 p171
package reusing;
class ClassA {
	ClassA (int i) {
	}	
}

public class ClassB extends ClassA {
	ClassB () {
			super(0);
	}
	ClassB (int i) {
			super(i);
	}
	public static void main (String[] args) {
		System.out.println("test");
	}
}