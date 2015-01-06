// TIJ interfaces, ex.18 p241
package interfaces;
interface Cycle {
	void pedal();
	void brake();
}

class Unicycle implements Cycle {
	public void pedal() {		
		System.out.println("Unicycle.pedal()");	
	}
	public void brake() {
		System.out.println("Unicycle.brake()");	
	}
}
class Bicycle implements Cycle {
	public void pedal() {		
		System.out.println("Bicycle.pedal()");	
	}
	public void brake() {
		System.out.println("Bicycle.brake()");	
	}
}
class Tricycle implements Cycle {
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
class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}
class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}
class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

class CycleFactoryTest {
	static void goCycling(CycleFactory c) {
		c.getCycle().pedal();
		c.getCycle().brake();
	}
	public static void main (String[] args) {
		goCycling(new UnicycleFactory());
		goCycling(new BicycleFactory());
		goCycling(new TricycleFactory());
	}	
}