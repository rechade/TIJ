// TIJ holding ex4 p283
package holding;
import java.util.*;

class Generator {
	static final int NUM_ELEMENTS = 10;
	static ArrayList<String> characters = new ArrayList<String>(Arrays.asList("Han","Luke","Leia","Chewie","Artoo","C3PO"));
	static Iterator<String> i = characters.iterator();
	static String next() {
		if (!i.hasNext()) {
			i = characters.iterator();
		}	
		return i.next();
	}
	public static void main (String[] args) {
		String [] printArray = new String[NUM_ELEMENTS];
		ArrayList<String> printArrayList = new ArrayList<String>();  
		LinkedList<String> printLinkedList = new LinkedList<String>();
		HashSet<String> printHashSet = new HashSet<String>();
		LinkedHashSet<String> printLinkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> printTreeSet = new TreeSet<String>();		
		String nextCharacter;
		
		for (int i=0; i<NUM_ELEMENTS; i++) {
			
			nextCharacter = next();
			
			printArray[i] = nextCharacter;
			printArrayList.add(nextCharacter);
			printLinkedList.add(nextCharacter);
			printHashSet.add(nextCharacter);
			printLinkedHashSet.add(nextCharacter);
			printTreeSet.add(nextCharacter);
		}
		System.out.println(Arrays.toString(printArray));
		System.out.println(printArrayList);
		System.out.println(printLinkedList);
		System.out.println(printHashSet);
		System.out.println(printLinkedHashSet);
		System.out.println(printTreeSet);
		
	}
}