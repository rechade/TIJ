// TIJ ex 20 p340
//: exceptions/StormyInning.java
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.
package exceptions;
class BaseballException extends RuntimeException {}
class UmpireArgument extends RuntimeException {}
class Foul extends RuntimeException {}
class Strike extends RuntimeException {}

abstract class Inning {
	public Inning()  {}
	public void event()  {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() ;
	public void walk() {} // Throws no checked exceptions
}

class StormException extends RuntimeException {}
class RainedOut extends RuntimeException {}
class PopFoul extends RuntimeException {}

interface Storm {
	public void event() ;
	public void rainHard() ;
	public void sockViolation() ;
}

public class StormyInning extends Inning implements Storm {
	// OK to add new exceptions for constructors, but you
	// must deal with the base constructor exceptions:
	public StormyInning() {}
	public StormyInning(String s) {}
	// Regular methods must conform to base class:
	public void walk() {} //Compile error
	// Interface CANNOT add exceptions to existing
	// methods from the base class:
 public void event() {}
	// If the method doesn't already exist in the
	// base class, the exception is OK:
	public void rainHard() {
		throw new StormException();
	}

	public void sockViolation() {
		throw new UmpireArgument();
	}
	// You can choose to not throw any exceptions,
	// even if the base version does:
	// public void event() {}
	// Overridden methods can throw inherited exceptions:
	public void atBat() {
		throw new PopFoul();
	}
	public static void main(String[] args) {
		
			StormyInning si = new StormyInning();
			si.rainHard();
			si.atBat();
			si.sockViolation();
		/*
		try {
			StormyInning si = new StormyInning();
			si.atBat();
			si.sockViolation();
		} catch(PopFoul e) {
			System.out.println("Pop foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(UmpireArgument e) {
				System.out.println("Umpire argument");
				e.printStackTrace();
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the
			// base-class version of the method:
		} catch(Strike e) {
			System.out.println("Strike");
		} catch(Foul e) {
			System.out.println("Foul");
		} catch(RainedOut e) {
			System.out.println("Rained out");
		} catch(UmpireArgument e) {
				System.out.println("Umpire argument");
		} catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		*/
	}
} ///:~
