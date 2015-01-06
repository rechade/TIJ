// TIJ exceptions ex30, p352
//: exceptions/Human.java
// Catching exception hierarchies.

class Annoyance extends RuntimeException {
}
class Sneeze extends Annoyance {}

public class Human {
	static void tickleNoseHair(int severity) {
		if (severity > 1) {
			throw new RuntimeException(new Sneeze());
		} else {
			throw new RuntimeException(new Annoyance());
		}
	}
		
	
	public static void main(String[] args) {
		// Catch the exact type:
		
		try {
			tickleNoseHair(2);
		} catch (Exception e) {
			//System.out.println(e);
			
			//System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("---------------");
			e.getCause().printStackTrace();
		}
		/*
		} catch(Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch(Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch(Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		*/
	}
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
