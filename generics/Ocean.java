// TIJ generics ex18 p460
package net.gusto.tij.generics;
import net.mindview.util.*;
import java.util.*;
class LittleFish {
	static long counter=0;
	public final long id;
	private LittleFish() {
		id = counter++;
	}	
	public static Generator<LittleFish> generator = new Generator<LittleFish>() {
		public LittleFish next() {return new LittleFish();}
	};
}
class BigFish {
	private static long counter=0;
	public final long id;
	private BigFish() {
		id = counter++;
	}	
	public static Generator<BigFish> generator = new Generator<BigFish>() {
		public BigFish next() {return new BigFish();}
	};
}

class Ocean {	
	static Random rand = new Random(47);
	public static void main (String[] args) {
		HashSet<LittleFish> sardines = new HashSet<LittleFish>();
		for (int i=1; i<10; i++) {
			sardines.add(LittleFish.generator.next());
		}
		ArrayList<BigFish> tuna = new ArrayList<BigFish>();
		for (int i=0; i<2; i++) {
			tuna.add(BigFish.generator.next());
		}
		Iterator<LittleFish> it = sardines.iterator();
		LittleFish sardine;
		while (it.hasNext()) {
			sardine = it.next();
			System.out.println(tuna.get(rand.nextInt(tuna.size()))+" eating: " + sardine);
			it.remove();
		}
	}
}
