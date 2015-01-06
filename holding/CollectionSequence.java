//: holding/CollectionSequence.java
package holding;
import typeinfo.pets.*;

import java.util.*;
import java.lang.UnsupportedOperationException;
import net.mindview.util.Print;

public class CollectionSequence implements Collection<Pet> {

	public boolean add(Pet p) {
		throw new UnsupportedOperationException();
		/*
		boolean result= false;
		if (contains(p)==false) {
			if (contains(null)) {
				for (Pet q: pets) {
					 if (q==null) {
						 q = p;
						 result = true;
					 }
				}
			} else { // no null
				// exception because no change, but element wasn't found
				throw new IllegalStateException();
			} 			
		} else { // contains p
				// no change made because set contains element and no duplicates allowed.
			result = false;			
		}		 
		return result;
		*/	
	}
	public boolean addAll(Collection<? extends Pet> p) {
		throw new UnsupportedOperationException();
	}
	public void clear() {
		throw new UnsupportedOperationException();
		/*
		for (Pet s: pets) {
			s=null;
		}
		*/
	}
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
		/*
		for (Pet p : pets) {
			if (o.equals(p)) {
				p=null;
			}
		}
		return false;
		*/
	}
	@Override public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	@Override public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}	
	
	public boolean contains(Object o) {
		boolean result = false;
		for (Pet p: pets) {
			if (o.equals(p)) {
				result = true;
			}
		}		
		return result;
	}	
	
	@Override public boolean containsAll(Collection<?> c) {
		return Arrays.asList(pets).containsAll(c);		
	}		
	
	private Pet[] pets = Pets.createArray(8);
	public int size() { return pets.length; }
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
	public Object[] toArray() {
		Pet[] p2 = Pets.createArray(size());
		int i=0;
		for (Pet p: pets) {
			p2[i++] = p;
		}
		return p2;	
	}	
	/*
	 * 
	@SuppressWarnings("unchecked")	
	public Object[] toArray(Object[] o) {	
		Object[] resultArray;
		if(o.length < size()) {
			resultArray = new Object[size()];
		} else {
			resultArray = o;
		}			
		int i = 0;
		for (Pet p : pets) {
			resultArray[i++] = p;
		}		
		return resultArray;
	}(non-Javadoc)
	 * @see java.util.Collection#toArray(java.lang.Object[])
	 */	
	
	public <T> T[] toArray(T[] o) {	
		T[] resultArray;
		
		if(o.length < size()) {
			resultArray = (T[])java.lang.reflect.Array.newInstance(o.getClass().getComponentType(),size());
		} else {
			resultArray = o;
		}
		int i = 0;
		for (Pet p : pets) {
			resultArray[i++] = (T)p;
		}
		return resultArray;
	}
		
	public boolean isEmpty() {
		return pets.length == 0;
	}
	
	public static void main(String[] args) {
	    CollectionSequence c = new CollectionSequence();
	    InterfaceVsIterator.display(c);
	    System.out.println ("c is empty = " + c.isEmpty());
	    Pet x = new Pet();
	    System.out.println ("c contains x is " + c.contains(x));
	    System.out.println ("c containsAll x is " + c.containsAll( Arrays.asList(new Pet[]{x})));
	    System.out.println ("c contains c.pets[0] is " + c.contains(c.pets[0]));
	    System.out.println ("c containsAll (c.pets[0]) is " + c.containsAll(Arrays.asList(c.pets[0])));
	    System.out.println ("c containsAll (c.pets[0],x) is " + c.containsAll(Arrays.asList(c.pets[0],x)));
	    InterfaceVsIterator.display(c.toArray());
	    Object[] emptyArray = new Object[0];
	    emptyArray = c.toArray(emptyArray);
	    System.out.println();
	    InterfaceVsIterator.display(c.iterator());
	    //Integer[] emptyArray2 = new Integer[0];
	    //emptyArray = c.toArray(emptyArray2);
	}
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
