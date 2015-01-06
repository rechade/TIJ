// TIJ initialisation, ex.1
package initialisation;
public class InitialNull {

	public static String string1;
	
	public static void main (String[] args) {	
		String string2; 
		
		System.out.println("string1==null is " + (string1==null));
		// this won't compile, because you're trying to use an uninitialised Object variable.
		// (whereas primitive variables are initialised to zeroed memory,
		// and using string1 works because class member Objects are initialised to null by default).
		//! System.out.println("string2==null is " + (string2==null));
		
		// question: what does a "new String()" contain
	}
}