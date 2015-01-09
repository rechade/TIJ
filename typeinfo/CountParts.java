package net.gusto.tij.typeinfo;
import static net.mindview.util.Print.*;
import net.mindview.util.TypeCounter;
import net.gusto.tij.typeinfo.factory.Factory;

class CountParts {
	public static void main (String[] args) {		 
		TypeCounter counter = new TypeCounter(Part.class);
		Part part;
		for(int i = 1; i<10; i++) {
			part = Part.createRandom();
			printnb(part.getClass().getSimpleName() + " ");
			counter.count(part);
		}
		print();
		print(counter);	
	}
}