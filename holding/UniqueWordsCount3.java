// TIJ holding ex22 p298 
package holding;
import java.util.*;
import net.mindview.util.*;

class WordCount implements Comparable<WordCount> {
	String word;
	Integer count;	
	WordCount(String s, Integer i) {
		word = s;
		count = i;
	}
	public int compareTo(WordCount comparer) {		
		return this.count - comparer.count;
	}
	public String toString() {
		return word + "=" + count;
	}
}

public class UniqueWordsCount3 {
	
	static Set<WordCount> wordsSet = new LinkedHashSet<WordCount>();
	
	static WordCount getWordCount(Set<WordCount> set,String s) {
		Iterator<WordCount> itSet = set.iterator();		
		WordCount wc=null;
		WordCount result = null;
		
		while (itSet.hasNext()) {
			wc = itSet.next();
			// System.out.println("Comparing " + wc.word +" "+ s);
			if (wc.word.equals(s)) {
				// System.out.println("found match ");
				result = wc;				
			}
		}			
		return result;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		// System.out.println(words);
		Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
		Iterator<String> it = words.iterator();
		String thisWord;
		Integer num;
		WordCount wc;
		while (it.hasNext()) {
			thisWord = it.next();
			//System.out.println(thisWord);			
			wc = getWordCount(wordsSet,thisWord);
			// System.out.println(wc);
			// System.out.println(num);
			if (wc==null) {
				//System.out.println("adding "+thisWord);
				wordsSet.add(new WordCount(thisWord,1));
			} else {
				wc.count++;
				//wordsSet.add(new WordCount(thisWord,++num));
			}
		}
		// Collections.sort((Collection)wordsSet.entrySet(), String.CASE_INSENSITIVE_ORDER);
		System.out.println("Word counts = " + wordsSet);
	}
}