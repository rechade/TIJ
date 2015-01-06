// TIJ holding ex11 p288
package holding;
import java.util.*;

class PrintCollections {
	static public void printCollection(Collection c) {
		Iterator it = c.iterator();
		while (it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	
	public static void main (String[] args) {
		List<Object> l = new ArrayList<Object>();
		Map<Object,Object> m = new HashMap<Object, Object>();
		Set<Object> s = new TreeSet<Object>();
		for (int i=0; i<10; i++) {
			l.add(Integer.toString(i));
			m.put(Integer.toString(i),Integer.toString(i));
			s.add(Integer.toString(i));			
		}
		printCollection(l);
		// a Map will not be accepted as a Collection but from the documentation
		// this returns a Set view of the Map, which is a type of Collection.
		printCollection(m.entrySet());
		printCollection(s);
	}
}