// TIJ holding ex6 p286
//: holding/ListFeatures3.java
// import typeinfo.pets.*;
package holding;
import java.util.*;
import static net.mindview.util.Print.*;

class Strings {
	static ArrayList<String> arrayList(int size) {		
		ArrayList<String> al = new ArrayList<String> (size);
		for (int i=0; i<size; i++) {
			al.add("asdf"+i);
		}
		return al;
	}
}

public class ListFeatures3 {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<String> strings = Strings.arrayList(7);
    print("1: " + strings);
    String h = new String("asdf"+22);
    strings.add(h); // Automatically resizes
    print("2: " + strings);
    print("3: " + strings.contains(h));
    strings.remove(h); // Remove by object
    String p = strings.get(2);
    print("4: " +  p + " " + strings.indexOf(p));
    String cymric = new String("asdf"+44);
    print("5: " + strings.indexOf(cymric));
    print("6: " + strings.remove(cymric));
    // Must be the exact object:
    print("7: " + strings.remove(p));
    print("remove same string contents : " + strings.remove("asdf1"));
    print("8: " + strings);
    strings.add(3, new String("asdf"+55)); // Insert at an index
    print("9: " + strings);
    List<String> sub = strings.subList(1, 4);
    print("subList: " + sub);
    print("10: " + strings.containsAll(sub));
    Collections.sort(sub); // In-place sort
    print("sorted subList: " + sub);
    // Order is not important in containsAll():
    print("11: " + strings.containsAll(sub));
    Collections.shuffle(sub, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("12: " + strings.containsAll(sub));
    List<String> copy = new ArrayList<String>(strings);    
    // from 1 inclusive to 4 exclusive ie 1..3
    sub = Arrays.asList(strings.get(1), strings.get(4));
    print("sub: " + sub);
    copy.retainAll(sub);
    print("13: " + copy);
    copy = new ArrayList<String>(strings); // Get a fresh copy
    copy.remove(2); // Remove by index
    print("14: " + copy);
    copy.removeAll(sub); // Only removes exact objects
    print("15: " + copy);
    copy.set(1, new String("asdf"+66)); // Replace an element
    print("16: " + copy);
    copy.addAll(2, sub); // Insert a list in the middle
    print("17: " + copy);
    print("18: " + strings.isEmpty());
    strings.clear(); // Remove all elements
    print("19: " + strings);
    print("20: " + strings.isEmpty());
    strings.addAll(Strings.arrayList(4));
    print("21: " + strings);
    Object[] o = strings.toArray();
    print("22: " + o[3]);
    String[] pa = strings.toArray(new String[0]);
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
