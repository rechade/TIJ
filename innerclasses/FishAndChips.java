package innerclasses;
public class FishAndChips {	
	// you can return an anonymous inner class, based on Chips, using any
	// Chips() constructors, and override the members as you like. The anonymous class
	// is derived from Chips and the interface is a Chips
	public Chips chips(final Integer i) {
		return new Chips(i) {
			Integer j=i;			
			public Integer howMany() { return super.howMany() -1;}
		};
	}
	public static void main (String[] args) {
		FishAndChips f = new FishAndChips();
		Chips c = f.chips((Integer)33);
		System.out.println(c.howMany());
	}
}

class Chips {
	private Integer number;
	Chips (Integer j) {	number = j;	}
	Chips() {}
	public Integer howMany() {return number;}	
}

