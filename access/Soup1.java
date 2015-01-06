// TIJ access, p160 singleton test
package access;
class Soup2 {
	// creating our own default constructor and making it private
	// no one else can create an instance, only the class itself
	private Soup2() {
	}
	// there's a single private instance of a Soup2 object created on first access	
	static private Soup2 s2 = new Soup2();	
	// public access method returns the pointer 
	// does this need to be static? yes because you're accessing it via the 
	// Classname.
	public static Soup2 access() {
		return (s2);
	}
	public void foo() {
		System.out.println("foo");
	}
}
public class Soup1 {
	public static void main (String[] args) {
		// Soup2 is static so access() cannot be non-static
		// foo is non-static but being accessed via the
		// non-static object reference
		Soup2.access().foo();
	}
}