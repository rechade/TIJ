// TIJ polymorphism, ex.10
package polymorphism;

class Vessel {
	void flick() {
		System.out.println("Vessel.flick()");
		squeeze();
	}
	void squeeze() {
		System.out.println("Vessel.squeeze()");
	}
}

class Bottle extends Vessel {
	@Override void squeeze () {
		System.out.println("Bottle.squeeze()");		
	}
}

public class VesselTest {
	static void makeNoise (Vessel v) {
		v.flick();
	}
	public static void main (String[] args) {		
		Bottle b = new Bottle();
		makeNoise(b);
	}
}