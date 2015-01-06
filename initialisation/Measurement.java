// TIJ initialisation p126
package initialisation;

class Depth {}

public class Measurement {
	static Depth d; // class member, object, non-primitive, so initialised to null
	public static void main (String[] args) {
		
		//! Depth d; // declaring d as local variable here gives "not initialized" compile error
		
		//! compiles but causes an exception
		d.equals(d);
	}
}