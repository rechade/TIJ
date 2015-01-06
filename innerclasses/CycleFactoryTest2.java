// TIJ innerclasses ex16 p256
// modified from TIJ interfaces, ex.18 p241
package innerclasses;
interface Cycle {
	void pedal();
	void brake();
}

class Unicycle implements Cycle {
	private Unicycle() {}
	static CycleFactory factory = new CycleFactory() { 
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
	public void pedal() {		
		System.out.println("Unicycle.pedal()");	
	}
	public void brake() {
		System.out.println("Unicycle.brake()");	
	}
}
class Bicycle implements Cycle {
	private Bicycle() {}
	static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
	public void pedal() {		
		System.out.println("Bicycle.pedal()");	
	}
	public void brake() {
		System.out.println("Bicycle.brake()");	
	}
}
class Tricycle implements Cycle {
	private Tricycle() {}
	static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
	public void pedal() {		
		System.out.println("Tricycle.pedal()");	
	}
	public void brake() {
		System.out.println("Tricycle.brake()");	
	}
}
interface CycleFactory {
	Cycle getCycle();
}
class CycleFactoryTest2 {
	static void goCycling(CycleFactory c) {
		c.getCycle().pedal();
		c.getCycle().brake();
	}
	public static void main (String[] args) {
		goCycling(Unicycle.factory);
		goCycling(Bicycle.factory);
		goCycling(Tricycle.factory);
	}	
}