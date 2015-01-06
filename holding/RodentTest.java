// TIJ holding ex10 p288 modifying:
// TIJ polymorphism, ex.9, ex.12 p208, ex.14 p210
package holding;
import java.util.*;

class Printing {
	static int messageInit(String s) {
		//System.out.println(s);
		return 0;
	}
}

class Flea {	
	private int diseases = Printing.messageInit("Flea instance: diseases");
	private static int legs = Printing.messageInit("Flea static: legs");
	Flea() {
		System.out.println("Flea() constructor");
	}
	void dispose() {
		System.out.println("Flea.dispose()");
	}
}
	
class Shared {
	private int refCount = 0;
	void addRef() {
		System.out.println("Shared adding ref " + refCount++);		
	}
	private static int numShared = 0;
	private final long id = numShared++;
	void dispose() {		
		System.out.println("Shared removing ref " + --refCount);
		if (0==refCount) {
			System.out.println("Shared.dispose()");		
		}
	}
}

class Rodent {
	private static int paws = Printing.messageInit("Rodent static: paws");
	private int eyes = Printing.messageInit("Rodent instance: eyes");
	private int tail = Printing.messageInit("Rodent instance: tail");
	Flea f = new Flea();
	
	private static final Shared s = new Shared();
	
	Rodent() {
		System.out.println("Rodent() constructor");
		s.addRef();
	}
	void gnaw() {
		System.out.println("Rodent.gnaw()");
	}
	void scurry() {
		System.out.println("Rodent.scurry()");
	}
	private static int heart = Printing.messageInit("Rodent static: heart");
	void dispose() {
		System.out.println("Rodent.dispose()");
		s.dispose();
		f.dispose();
	}
}

class Mouse extends Rodent {
	private static int paws = Printing.messageInit("Mouse static: paws");
	private static int tail = Printing.messageInit("Mouse static: tail");
	private int eyes = Printing.messageInit("Mouse instance: eyes");
	//Flea f = new Flea();
	Mouse() {
		System.out.println("Mouse() constructor");
	}
	@Override void gnaw() {
		System.out.println("Mouse.gnaw()");
	}
	@Override void scurry() {
		System.out.println("Mouse.scurry()");
	}
	@Override void dispose() {		
		System.out.println("Mouse.dispose()");
		super.dispose();
	}
	private static int heart = Printing.messageInit("Mouse static: heart");
}
class Gerbil extends Rodent {
	Gerbil() {
		System.out.println("Gerbil() constructor");
	}
	@Override void gnaw() {
		System.out.println("Gerbil.gnaw()");
	}
	@Override void scurry() {
		System.out.println("Gerbil.scurry()");
	}
	@Override void dispose() {
		System.out.println("Gerbil.dispose()");
		super.dispose();
	}
}
class Hamster extends Rodent {
	Hamster() {
		System.out.println("Hamster() constructor");	
	}
	@Override void gnaw() {
		System.out.println("Hamster.gnaw()");
	}
	@Override void scurry() {
		System.out.println("Hamster.scurry()");
	}
	@Override void dispose() {
		System.out.println("Hamster.dispose()");
		super.dispose();
	}
}

public class RodentTest {
	static Mouse m = new Mouse();
	static List<Rodent> rodentArray = Arrays.asList(new Rodent(), new Mouse(), new Gerbil(), new Hamster());
	
	public static void main (String[] args) {	
		Iterator<Rodent> it = rodentArray.iterator();
		Rodent r;
		while(it.hasNext()) {
			r = it.next();
			r.gnaw();
			r.scurry();
		}
		/*
		for (Rodent r: rodentArray) {
			r.gnaw();
			r.scurry();
		}		
		for (Rodent r: rodentArray) {
			r.dispose();			
		}
		m.dispose();
		*/
	}
}
