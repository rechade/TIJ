// TIJ generics ex20 p466
package net.gusto.tij.generics;
interface Dances {
	void twirl();
	void shimmy();	
}
class Lady implements Dances {
	public void twirl() {
		System.out.println("twirl");
	}
	public void shimmy() {
		System.out.println("shimmy");
	}
	public void mashedPotato() {
		System.out.println("mashedPotatos");
	}
}

class Dude<T extends Dances> {
	void date (T datee) {
		datee.twirl();
		datee.shimmy();
		// not in bounds
		//!datee.mashedPotatos(); 
	}
}
class LadysNight {
	public static void main (String[] args) {
		Dude d = new Dude();
		d.date(new Lady());
	}
}
