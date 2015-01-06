// TIJ innerclasses ex.4 p247 and ex22 p261
//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package holding;
import java.util.*;

interface Selector {
  boolean end();
  Object current();
  void next();
  Object getSequence();
}	

public class Sequence {
	static final int NUM_TERMS=17;
	@SuppressWarnings("unchecked")
  private ArrayList items;
  private int next = 0;
  public Sequence() { items = new ArrayList(); }
  public void add(Object x) {
      items.add(x);
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public Object current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
    public Sequence getSequence() {
    	return Sequence.this;
    }
  }
  
  private class ReverseSelector implements Selector {
    private int i = items.size();
    public boolean end() { return i == 0; }
    public Object current() { return items.get(i-1); }
    public void next() { if(i > 0) i--; }
    public Sequence getSequence() {
    	return Sequence.this;
    }
  }
  
  public Selector selector() {
    return new SequenceSelector();
  }	
  public Selector reverseSelector() {
    return new ReverseSelector();
  }	
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    for(int i = 0; i < NUM_TERMS; i++)
      sequence.add(Integer.toString(i));
  	
    Selector selector = sequence.selector();    
    ((Sequence)selector.getSequence()).add("99");
    
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();      
    }
    Selector r = sequence.reverseSelector();
    for(int i = 0; i < NUM_TERMS; i++)
      sequence.add(Integer.toString(i));
  	while(!r.end()) {
      System.out.print(r.current() + " ");
      r.next();      
     }    
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
