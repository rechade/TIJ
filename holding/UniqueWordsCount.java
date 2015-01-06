// TIJ holding ex21 p298 
package holding;
import java.util.*;
import net.mindview.util.*;

public class UniqueWordsCount {
	static Map<String,Integer> wordsMap = new LinkedHashMap<String,Integer>();
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>(new TextFile("SetOperations.java", "\\W+"));
		//System.out.println(words);
		Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
		Iterator<String> it = words.iterator();
		String thisWord;
		Integer num;
		while (it.hasNext()) {
			thisWord = it.next();
			//System.out.println(thisWord);
			num = wordsMap.get(thisWord);
			//System.out.println(num);
			if (num==null) {
				wordsMap.put(thisWord,1);
			} else {
				wordsMap.put(thisWord,++num);
			}
		}
		//Collections.sort((Collection)wordsMap.entrySet(), String.CASE_INSENSITIVE_ORDER);
		System.out.println("Word counts = " + wordsMap);
	}
}