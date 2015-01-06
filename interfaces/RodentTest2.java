// TIJ interfaces, ex.7 p225
package interfaces;
interface Rodent {
	void gnaw();
	void scurry();
}

class Mouse implements Rodent {
	public void gnaw() {
		System.out.println("Mouse.gnaw()");
	}
	public void scurry() {
		System.out.println("Mouse.scurry()");
	}
}
class Gerbil implements Rodent {
	public void gnaw() {
		System.out.println("Gerbil.gnaw()");
	}
	public void scurry() {
		System.out.println("Gerbil.scurry()");
	}
}

class RodentTest2 {
	public static void main (String[] args) {
		Rodent[] rodentArray = {new Gerbil(), new Mouse()};
		for (Rodent r: rodentArray) {
			r.gnaw();
			r.scurry();
		}	
	}
}