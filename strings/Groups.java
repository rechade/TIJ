// TIJ strings ex12 p379
//: strings/Groups.java
import java.util.regex.*;
import static net.mindview.util.Print.*;
import java.util.HashMap;

public class Groups {
	static public final String POEM =
		"Twas brillig, and the slithy toves\n" +
		"Did gyre and gimble in the wabe.\n" +
		"All mimsy were the borogoves,\n" +
		"And the mome raths outgrabe.\n\n" +
		"Beware the Jabberwock, my son,\n" +
		"The jaws that bite, the claws that catch.\n" +
		"Beware the Jubjub bird, and shun\n" +
		"The frumious Bandersnatch.";
		
	static HashMap<String,Integer> uniqueWords = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		Matcher m =			
			Pattern.compile("\\b[a-z]+\\b").matcher(POEM);
		while(m.find()) {			
			String word = m.group();
			//printnb("[" + m.group() + "]");
			Integer count = uniqueWords.get(word);
			if (count==null) {
				uniqueWords.put(word,1);
			} else {
				uniqueWords.put(word,++count);
			}			
		}
		print(uniqueWords);		
	}
} /* Output:
[the slithy toves][the][slithy toves][slithy][toves]
[in the wabe.][in][the wabe.][the][wabe.]
[were the borogoves,][were][the borogoves,][the][borogoves,]
[mome raths outgrabe.][mome][raths outgrabe.][raths][outgrabe.]
[Jabberwock, my son,][Jabberwock,][my son,][my][son,]
[claws that catch.][claws][that catch.][that][catch.]
[bird, and shun][bird,][and shun][and][shun]
[The frumious Bandersnatch.][The][frumious Bandersnatch.][frumious][Bandersnatch.]
*///:~
