package net.gusto.tij.typeinfo;
import net.gusto.tij.generics.coffee.*;
import static net.mindview.util.Print.*;    
import net.mindview.util.TypeCounter;

class CountCoffees {
	public static void main (String[] args) {
		TypeCounter counter = new TypeCounter(Coffee.class);
		for(Coffee coffee : new CoffeeGenerator(20)) {
			printnb(coffee.getClass().getSimpleName() + " ");
			counter.count(coffee);
		}
		print();
		print(counter);	
	}	
}