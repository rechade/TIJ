// TIJ holding ex5 p286
//: holding/ListFeatures2.java
// import typeinfo.pets.*;
package holding;
import java.util.*;
import static net.mindview.util.Print.*;

class Integers {
	static ArrayList<Integer> arrayList(int size) {		
		ArrayList<Integer> al = new ArrayList<Integer> (size);
		for (int i=0; i<size; i++) {
			al.add(i);
		}
		return al;
	}
}

public class ListFeatures2 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Integer> integers = Integers.arrayList(7);
    print("1: " + integers);
    Integer h = new Integer(22);
    integers.add(h); // Automatically resizes
    print("2: " + integers);
    print("3: " + integers.contains(h));
    integers.remove(h); // Remove by object
    Integer p = integers.get(2);
    print("4: " +  p + " " + integers.indexOf(p));
    Integer cymric = new Integer(44);
    print("5: " + integers.indexOf(cymric));
    print("6: " + integers.remove(cymric));
    // Must be the exact object:
    print("7: " + integers.remove(p));
    print("8: " + integers);
    integers.add(3, new Integer(55)); // Insert at an index
    print("9: " + integers);
    List<Integer> sub = integers.subList(1, 4);
    print("subList: " + sub);
    print("10: " + integers.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + integers.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + integers.containsAll(sub));
    List<Integer> copy = new ArrayList<Integer>(integers);    
    // from 1 inclusive to 4 exclusive ie 1..3
    sub = Arrays.asList(integers.get(1), integers.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<Integer>(integers); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new Integer(66)); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + integers.isEmpty());
    integers.clear(); // Remove all elements
    print("19: " + integers);
    print("20: " + integers.isEmpty());
    integers.addAll(Integers.arrayList(4));
    print("21: " + integers);
    Object[] o = integers.toArray();
    print("22: " + o[3]);
    Integer[] pa = integers.toArray(new Integer[0]);
    print(Arrays.toString(pa));
    //print("23: " + pa[3].id());
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
