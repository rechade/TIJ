// TIJ innerclasses, ex2 p246
package innerclasses;
class Coffee {
	private String brand;
	Coffee() {
		brand = "";
	}
	Coffee(String s){
		brand = s;
	}
	public String toString() {
		System.out.println(brand);
		return brand;
	}
}

public class CoffeeSequence {
	static Sequence s = new Sequence(3);
	public static void main (String[] args) {
		s.add(new Coffee("Nescafe"));
		s.add(new Coffee("Illy"));
		s.add(new Coffee("Maxwell House"));
		Selector selector = s.selector();
		while(!selector.end()) {
			selector.current().toString();
			selector.next();
		}
	}
}