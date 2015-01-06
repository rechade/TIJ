// TIJ holding ex16 
package holding;
import java.util.*;
import net.mindview.util.*;

public class NumVowels {
	public static void main(String[] args) {
    Set<String> words = new TreeSet<String>(
    	new TextFile("SetOperations.java", "\\W+"));
    Set<Character> vowels = new HashSet<Character>(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
    Iterator<String> wordsIterator = words.iterator();
    String word;
    int totalVowels = 0;
    int numVowels = 0;
    while (wordsIterator.hasNext()) {
    	word = wordsIterator.next();    	
    	numVowels = 0;
    	for (int i=0; i<word.length(); i++) {
    		if (vowels.contains(word.charAt(i))) {
    			numVowels++;
    		}
    	}
    	System.out.println(word+", num vowels= "+numVowels);
    	totalVowels += numVowels;    		
    }
    //System.out.println(words);
    System.out.println("Total vowels= "+ totalVowels);
  }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
