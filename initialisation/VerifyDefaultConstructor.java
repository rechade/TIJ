// TIJ initialisation ex.7
package initialisation;
class WithoutConstructor {
}

public class VerifyDefaultConstructor {
	public static void main (String[] args) {
		WithoutConstructor w = new WithoutConstructor();
		// below gives compile fail against the default constructor method signature
		//! WithoutConstructor w = new WithoutConstructor();
		System.out.println("w==null is " + (w==null));
	}
} 