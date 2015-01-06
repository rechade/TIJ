// TIJ innerclasses ex13 p254 (based on ex9 p250)
package innerclasses;
class Dancer {
	Dances getDances() {
		return new Dances() {
			public void dance1() { System.out.println("dance1()");}
		};
	}
	public static void main (String[] args) {
		Dancer p = new Dancer();
		p.getDances().dance1();
	}
}

interface Dances {
	void dance1();
}