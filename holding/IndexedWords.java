// TIJ holding ex25 + 26 p298
package holding;
import java.util.*;
import net.mindview.util.*;

public class IndexedWords {
	static final int MAX_WORDS = 1000;
	static Map<String,ArrayList<Integer>> wordsMap = new TreeMap<String,ArrayList<Integer>>();
	
	public static void main(String[] args) {	
		String s;
		ArrayList<Integer> al;
		ArrayList<String> words = new ArrayList<String>(new TextFile("\\Users\\rechade\\workspace\\TIJ\\holding\\SetOperations.java", "\\W+"));
		for (int i=0; i< words.size(); i++) {
			s = words.get(i);
			// put the word from the file array into the Map with its position array 			
			// retrieve V for the word if one exists
			al = wordsMap.get(s); 		
			if (al==null) {
				al = new ArrayList<Integer>();
				al.add(i);
				wordsMap.put(s,al);
				//System.out.println(wordsMap);
			} else {
				al.add(i);
			}
		}
		// make a holder for the reconstructed file
		String[] bigArray = new String[MAX_WORDS];
		// 
		while (wordsMap.size() > 0) {
			s = ((TreeMap<String,ArrayList<Integer>>)wordsMap).firstKey();
			al = ((TreeMap<String,ArrayList<Integer>>)wordsMap).get(s);		
			// put the word into the positions from al
			for (int j : al) {
				bigArray[j] = s;
			}
			wordsMap.remove(s);
		}	
		for (String w:bigArray){
			System.out.print(w +" ");
		}
	}
}