// TIJ access ex.5 pt3
package access2;
import access.AllAccesses;

class AllAccesses2 extends AllAccesses {
	public String getI() {
		m(); // public will work
		return ("AllAccesses2 can access AllAccesses public i=" + i);
	}
	public String getJ() {
		//! n(); // private won't find = error: cannot find symbol
		//! return ("AllAccesses2 cannot print AllAccesses private j=" + j);
		return ("AllAccesses2 cannot print AllAccesses private j");
	}
	public String getK() {
		o(); // protected will be accessible
		return ("AllAccesses2 can print AllAccesses protected k=" + k);
	}
	public String getL() {
		//! p(); // default won't be found = error: cannot find symbol		
		//! return ("AllAccesses2 cannot print AllAccesses default l=" + l);
		return ("AllAccesses2 cannot print AllAccesses default l");
	}
	
	
}

public class CompilerMessages2 {
	public static void main (String[] args) {
		AllAccesses2 a = new AllAccesses2();	
		// public i works
		System.out.println(a.i);
		System.out.println(a.getI());
		// error: j has private access in AllAccesses
		//! System.out.println(a.j); 
		System.out.println(a.getJ());
		// error: k has protected access in AllAccesses
		//! System.out.println(a.k);
		System.out.println(a.getK());
		// error: l is not public in AllAccesses  
		//! System.out.println(a.l);
		System.out.println(a.getL());
		a.m();// public ok
		//! a.n();// private = error: cannot find symbol 
		//! a.o();// protected = error: o() has protected access in AllAccesses
		//! a.p();// default = error: cannot find symbol
	}
}