// TIJ innerclasses ex.4 p247 and ex22 p261
//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package net.gusto.tij.innerclasses;

interface Selector<T> {
  boolean end();
  T current();
  void next();
  Object getSequence();
}	

public class Sequence<T> {
  private Object[] items;
  private int next = 0;
  public Sequence(int size) { items = new Object[size]; }
  public void add(T x) throws ArrayIndexOutOfBoundsException {
    if(next < items.length) {
      items[next++] = x;
    } else {
    	throw new ArrayIndexOutOfBoundsException("Sequence.add()");
    }
  }
  private class SequenceSelector implements Selector<T> {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public T current() { return (T)items[i]; }
    public void next() throws ArrayIndexOutOfBoundsException { 
    	if(i < items.length) {
    		i++;
    	} else {
    		throw new ArrayIndexOutOfBoundsException("SequenceSelector.next()");
    	}
    }
    public Sequence<T> getSequence() {
    	return Sequence.this;
    }
  }
  
  /*private class ReverseSelector implements Selector {
		private int i = items.length;
		public boolean end() { return i == 0; }
		public Object current() { return items[i-1]; }
		public void next() throws ArrayIndexOutOfBoundsException { 
			if(i > 0) {
				i--;    	 
			} else {
				throw new ArrayIndexOutOfBoundsException("ReverseSelector.next()");
			}
		} 
		public Sequence<T> getSequence() {
			return Sequence.this;
		} 
  } */ 
  
  public Selector<T> selector() {
    return new SequenceSelector();
  }	
 /* public Selector reverseSelector() {
    return new ReverseSelector();
  } */	
  public static void main(String[] args) {
    Sequence<Integer> sequence = new Sequence<Integer>(10);
    for(int i = 0; i < 9; i++) {
      //sequence.add(Integer.toString(i));
       sequence.add(i);
    }
  	
    Selector<Integer> selector = sequence.selector();
    ((Sequence<Integer>)selector.getSequence()).add(99);
    
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
   
    /*Selector r = sequence.reverseSelector();     
  	while(!r.end()) {
      System.out.print(r.current() + " ");
      r.next();      
     } */    
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
