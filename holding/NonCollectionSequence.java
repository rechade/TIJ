// TIJ holding ex32 p308
//: holding/NonCollectionSequence.java
package holding;
import typeinfo.pets.*;

import java.util.*;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>(){
					int itIndex = NonCollectionSequence.this.pets.length-1;
					public boolean hasNext() {
						return itIndex > -1;
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
					public Pet next() {
						return NonCollectionSequence.this.pets[itIndex--];
					}
				};
			}
		};		
	}
	public Iterable<Pet> randomized() {
		ArrayList<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
		Collections.shuffle(shuffled, new Random(48));
		return shuffled;		
	}
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
    System.out.print("reversed: ");
    for (Pet p : nc.reversed()) {
    	System.out.print(p);
    }
	System.out.println();
    System.out.print("randomized: ");
    for (Pet p : nc.randomized()) {
    	System.out.print(p);
    }
	System.out.println();
    System.out.print("raw object");
    for (Pet p : nc) {
    	System.out.print(p);
    }
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
