// TIJ holding ex19 p297
package holding;
import java.util.*;
class MyPlayer implements Comparable<Map.Entry<Integer,String>>,Map.Entry<Integer,String> {	
	String name;
	Integer number;
	MyPlayer(Integer i, String s) {
		number = i;
		name = s;
	}
    public int compareTo(Map.Entry<Integer,String> comparer){
    	return this.getKey() - comparer.getKey();        	
    }
    public String setValue(String s) {
    	String temp = name;
    	name = s;
    	return temp;
    }
    public String getValue() {
    	return name;
    }
    public Integer getKey() {
    	return number;
    }
    public String toString() {
    	return number+"="+name;	
    }
}
class LinkedHashSetOrder {
	
	static Set<MyPlayer> playersHashSet = new HashSet<MyPlayer>();
	
	public static void main (String[] args) {	
				
		playersHashSet.add(new MyPlayer(34,"Charlton"));
		playersHashSet.add(new MyPlayer(18,"Keegan"));
		playersHashSet.add(new MyPlayer(28,"Moore"));
		playersHashSet.add(new MyPlayer(15,"Pele"));
		playersHashSet.add(new MyPlayer(12,"Platini"));
		playersHashSet.add(new MyPlayer(12,"Platini"));
		playersHashSet.add(new MyPlayer(100,"Grobelarr"));			
		
		System.out.println("Ordering by hashcode...");
		System.out.println("playersHashSet"+playersHashSet);	
		
		// extract the pairs and sort them (add to a tree - natural sort order)		
		Iterator<MyPlayer> it = playersHashSet.iterator();		
		TreeSet<MyPlayer> playersTreeSet = new TreeSet<MyPlayer>();
				
		while(it.hasNext()) {		
			playersTreeSet.add(it.next());
		}
		System.out.println("Ordering by TreeSet natural sort using Comparable interface...");
		System.out.println("playersTreeSet"+playersTreeSet);		
		
		Set<MyPlayer> playerLHS = new LinkedHashSet<MyPlayer>();
		it = playersTreeSet.iterator();
		while(it.hasNext()){
			playerLHS.add(it.next());
		}
		System.out.println("playerLHS"+playerLHS);
	}
}
/*
class LinkedHashSetOrder {
	static Set<Map.Entry<Integer,String>> playersHashSet;   
	static Map<Integer,String> playersHashMap;
	public static void main (String[] args) {
		
		playersHashMap = new HashMap<Integer,String>();		
		playersHashMap.put(34,"Charlton");
		playersHashMap.put(18,"Keegan");
		playersHashMap.put(28,"Moore");
		playersHashMap.put(15,"Pele");
		playersHashMap.put(12,"Platini");
		playersHashMap.put(12,"Platini");
		
		playersHashSet = new HashSet<Map.Entry<Integer,String>>(playersHashMap.entrySet());		
		
		System.out.println("Ordering by hashcode...");
		System.out.println("playersHashMap"+playersHashMap);   
		System.out.println("playersHashSet"+playersHashSet);	
		
		// extract the pairs and sort them (add to a tree - natural sort order)		
		Iterator<Map.Entry<Integer,String>> it = playersHashSet.iterator();
		TreeSet<Map.Entry<Integer,String>> playersTreeSet = new TreeSet<Map.Entry<Integer,String>>();		
		while(it.hasNext()) {
			System.out.println(it.next());
			playersTreeSet.add(it.next());
		}
		
		//System.out.println("playersTreeSet"+playersTreeSet); 
		// sort the pairs		
		//TreeSet<Map<Integer,String>> playersTreeSet = new TreeSet<Map<Integer,String>>(playersHashSet);		
		// playersTreeSet.addAll(Arrays.asList(playersHashSet.toArray()));
		/*
		System.out.println("Ordering by TreeMap natural sort ...");
		System.out.println(playersTreeMap);
		// add to LinkedHashMap
		Set<Integer,String> lhm = new LinkedHashSet<Integer,String>();
		Map.Entry<Integer,String> mapEntry;
		while (playersTreeMap.size() > 0) {
			mapEntry = playersTreeMap.firstEntry();
			lhm.put(mapEntry.getKey(),mapEntry.getValue());
			playersTreeMap.remove(mapEntry.getKey());
		}
		System.out.println("Unaltered entry from a LinkedHashMap ...");
		System.out.println(lhm);
		*//*
	}
}
*/