// TIJ holding ex20 p298 modifies
// TIJ holding ex16 
package holding;
import java.util.*;
import net.mindview.util.*;

public class NumVowels2 {
	public static void main(String[] args) {
    Set<String> words = new TreeSet<String>(
    	new TextFile("SetOperations.java", "\\W+"));
    Map<Character,Integer> vowelsMap = new HashMap<Character,Integer>();
    Character[] vowelsArray = new Character[]{'a','e','i','o','u','A','E','I','O','U'};
    for (Character c : vowelsArray) {
    	vowelsMap.put(c,0);
    }
    Iterator<String> wordsIterator = words.iterator();
    String word;
    int totalVowels = 0;
    int numVowels = 0;
    while (wordsIterator.hasNext()) {
    	word = wordsIterator.next();    	
    	numVowels = 0;
    	Character ch;
    	Integer val;
    	for (int i=0; i<word.length(); i++) {
    		ch = word.charAt(i);
    		val = vowelsMap.get(ch);    		
    		if (val!=null) {
    			numVowels++;
    			vowelsMap.put(ch,++val);    			
    		}
    	}
    	System.out.println(word+", num vowels= "+numVowels);
    	totalVowels += numVowels;    		
    }
    //System.out.println(words);
    System.out.println("Total vowels= "+ totalVowels);
    System.out.println("vowel counts= "+vowelsMap);
  }
} /* Output:
[A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
*///:~
