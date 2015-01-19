//: generics/RandomList.java
import java.util.*;
import net.gusto.tij.typeinfo.pets.*;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item) { storage.add(item); }
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> rs = new RandomList<String>();
		for(String s: ("The quick brown fox jumped over " +
				"the lazy brown dog").split(" "))
			rs.add(s);
		for(int i = 0; i < 11; i++)
			System.out.print(rs.select() + " ");
		RandomList<Integer> ri = new RandomList<Integer>();
		for (Integer i=0; i<10; i++) {
			ri.add(i);
		}		
		for(int i = 0; i < 11; i++)
			System.out.print(ri.select() + " ");
		RandomList<Pet> pets = new RandomList<Pet>();
		for(int i=0; i<10; i++) {
			pets.add(Pets.randomPet());
		}
		for(int i = 0; i < 11; i++)
			System.out.print(pets.select() + " ");		
	}
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
                                                