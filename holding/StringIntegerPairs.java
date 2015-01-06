// TIJ holding ex 24 p298
package holding;
import java.util.*;

class StringIntegerPairs {
	static Map<String,Integer> distances = new LinkedHashMap<String,Integer>();
	public static void main (String[] args) {		
		distances.put("Dublin",25);
		distances.put("Edingburgh",125);
		distances.put("London",53);
		distances.put("Lands End",88);		
		System.out.println(distances);
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>(distances);	
		System.out.println(treeMap);
		distances.clear();
		while (treeMap.size()>0) {
			Map.Entry<String,Integer> me;
			me = treeMap.firstEntry();   
			distances.put(me.getKey(),me.getValue());
			treeMap.remove(treeMap.firstKey());
		}
		System.out.println(distances);
	}	
}