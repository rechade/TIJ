// TIJ interfaces, ex.2 p222, ex.3
package interfaces;
abstract class Vessel {
	abstract void print();
	Vessel() {
		print();	
	}
	void fill() {
		System.out.println("Filling Vessel");	
	}
}

class Cup extends Vessel {
	int volume = 450;
	void print() {
		System.out.println("Volume = " + volume + "ml");
	}
}

class Drink {
	public static void main (String[] args) {
		Cup c = new Cup();
		c.print();
	}
}