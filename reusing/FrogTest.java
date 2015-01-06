// TIJ reusing, ex.16 + 17 p182
package reusing;
class Amphibian {
	void goLand(Amphibian a) {
		System.out.println("Amphibian going on land");
	}             
	void goWater(Amphibian a) {
		System.out.println("Amphibian going in water");
	}
}

class Frog extends Amphibian {	
	void goLand(Amphibian a) {
		System.out.println("Frog going on land");
	}             
	void goWater(Amphibian a) {
		System.out.println("Frog going in water");
	}
}

public class FrogTest {
	public static void main (String[] args) {
		Frog f = new Frog();
		f.goLand(f);
		f.goWater(f);
	}
}