// TIJ access, ex.5 pt2
package access;
import access.AllAccesses;
public class CompilerMessages {
	public static void main (String[] args) {
		AllAccesses a = new AllAccesses();
		System.out.println(a.i);
		//! System.out.println(a.j); //private won't compile
		System.out.println(a.k);
		System.out.println(a.l);
		a.m(); //public
		//! a.n(); //private won't compile	
		a.o(); //protected
		a.p(); //default
	}
}