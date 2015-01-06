//: innerclasses/Sequence.java
// Holds a sequence of Objects.
package holding;
import java.util.*;

public class Sequence6 {
  private ArrayList<Object> items = new ArrayList<Object>();  
  private final int maxItems;
  public Sequence6(int size) { maxItems = size; }
  public void add(Object x) {
    if(items.size() < maxItems){
      items.add(x);
    } else {
    	System.out.println("Max array size reached: "+maxItems);
    }    
  }
  private class SequenceSelector {
  	  Iterator<Object> iterator;
  	  Object currentItem;
  	  SequenceSelector(Iterator<Object> it) {
  	  	  iterator = it;
  	  	  currentItem = iterator.next();
  	  }
    private int i = 0;
    public boolean end() { return !iterator.hasNext(); }
    public Object current() {return currentItem; }
    public void next() { currentItem = iterator.next(); }
  }
  public SequenceSelector selector(Iterator<Object> it) {
    return new SequenceSelector(it);
  }	
  public static void main(String[] args) {
    Sequence6 sequence = new Sequence6(10);
    for(int i = 0; i < 11; i++)
      sequence.add(Integer.toString(i));
    SequenceSelector selector = sequence.selector(sequence.items.iterator());
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
    System.out.print(selector.current() + " ");
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
