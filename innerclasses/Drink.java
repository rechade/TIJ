// TIJ innerclasses ex15 p254
package innerclasses;
class MilkShake {
	String flavour;
	MilkShake(String whatFlavour) { flavour = whatFlavour; }	
	void taste() { System.out.println(flavour + "-y"); }
}

class Drink {
	MilkShake getMilkShake() {
		return new MilkShake("Vanilla") {			
		};
	}             
	MilkShake getMilkShake(String s) {
		return new MilkShake(s) {			
		};
	}
	public static void main (String[] args) {
		Drink d = new Drink();
		d.getMilkShake().taste();
		d.getMilkShake("Strawberry").taste();
	}
}