// TIJ holding ex18 p297
package holding;
import java.util.*;
class LinkedHashMapOrder {
	static Map<Integer, String> players;
	public static void main (String[] args) {
		players = new HashMap<Integer, String>();
		players.put(34,"Charlton");
		players.put(18,"Keegan");
		players.put(28,"Moore");
		players.put(15,"Pele");   
		players.put(12,"Platini");
		System.out.println("Ordering by hashcode...");
		System.out.println(players);
		// extract the pairs				
		Set<Map.Entry<Integer,String>> playersSet = players.entrySet();
		System.out.println("As output by entrySet()...");
		System.out.println(playersSet);
		// sort the pairs
		TreeMap<Integer,String> playersTreeMap = new TreeMap<Integer,String>();
		playersTreeMap.putAll(players);
		System.out.println("Ordering by TreeMap natural sort ...");
		System.out.println(playersTreeMap);		
		// add to LinkedHashMap		
		Map<Integer,String> lhm = new LinkedHashMap<Integer,String>();
		Map.Entry<Integer,String> mapEntry;
		while (playersTreeMap.size() > 0) {
			mapEntry = playersTreeMap.firstEntry();
			lhm.put(mapEntry.getKey(),mapEntry.getValue());
			playersTreeMap.remove(mapEntry.getKey());
		}
		System.out.println("Unaltered entry from a LinkedHashMap ...");
		System.out.println(lhm);		
	}
}
