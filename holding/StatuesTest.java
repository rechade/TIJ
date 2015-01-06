// TIJ holding ex7 p286
package holding;
import java.util.*;

class Statues {
	static int counter = 0;
	int id = counter++;
	public String toString() {
		return Integer.toString(id);
		// return ""+id;
		//! return (String)id;
		//! return (Integer)id.toString();
	}
}

class StatuesTest {
	static Statues[] statuesArray = new Statues[] {new Statues(),new Statues(),new Statues(),
												new Statues(), new Statues()};
												
	public static void main (String[] args) {
		// returns an underlying array - can't remove items
		//List<Statues> statuesList = Arrays.<Statues>asList(statuesArray);
		
		// List is an interface, can't construct an interface! 
		//! List<Statues> statuesList = new List<Statues>();
		List<Statues> statuesList = new ArrayList<Statues>();
		
		// add array items to the ArrayList
		Collections.addAll(statuesList, statuesArray);		
		List<Statues> sub = statuesList.subList(1,4);
		
		// remove() is for single items
		// removeAll() is for all the items in the list
		statuesList.removeAll(sub);
		System.out.println(statuesList);
	}
}