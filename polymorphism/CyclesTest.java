// TIJ polymorphism ex.1 p195 + ex.17
package polymorphism;
class Cycle {
	void pedal () {
		System.out.println("Cycle.pedal()");
	}
	int wheels () {
		return 0; // conceptual cycle - don't know how many 
	}
}

class Unicycle extends Cycle {
	void balance () {
		System.out.println("Unicycle.balance()");
	}
	void pedal () {
		System.out.println("Unicycle.pedal()");
	}
	int wheels () {
		return 1;
	}
}

class Bicycle extends Cycle {
	void pedal () {
		System.out.println("Bicycle.pedal()");
	}
	void balance () {
		System.out.println("Bicycle.balance()");
	}
	int wheels () {
		return 2;
	}
}

class Tricycle extends Cycle {
	void pedal () {
		System.out.println("Tricycle.pedal()");
	}
	int wheels () {
		return 3;
	}
}


class  CyclesTest {

	static void ride(Cycle c) {
		c.pedal();
		if (0==c.wheels()) {
			System.out.println("num wheels = base class conceptual Cycle... at least one");
		} else {			
			System.out.println("num wheels = " + c.wheels());
		}			
	}

	public static void main (String[] args) {
			Cycle c = new Cycle();
			Unicycle u = new Unicycle();
			Bicycle b = new Bicycle();
			Tricycle t = new Tricycle();
			Cycle[] cycleArray = {u,b,t};
			for (Cycle cycleElement: cycleArray){
				//! cycleElement.balance();				
			}
			((Unicycle)cycleArray[0]).balance();
			((Bicycle)cycleArray[1]).balance();
			//! ((Tricycle)cycleArray[2]).balance();
			
			ride(c);
			ride(u);
			ride(b);
			ride(t);
		}
}