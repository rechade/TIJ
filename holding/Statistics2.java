// TIJ holding ex23 p298 from
//: holding/Statistics.java
// Simple demonstration of HashMap.
package holding;
import java.util.*;
import gusto.Tools.*;

public class Statistics2 {
	static final boolean DEBUG = true;   
	static final int NUM_RUNS = 100;
	
	static Map<Integer,Integer> runTest(Random rand) {
		Map<Integer,Integer> m;
		m = new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}		
		return m;
	}
	
	static int getMostCommon(Map<Integer, Integer> m) {
		Iterator<Map.Entry<Integer,Integer>> it = m.entrySet().iterator();
		int key;
		int val;
		int result=0;
		Map.Entry<Integer,Integer> entry;
		int max = Integer.MIN_VALUE;
		while (it.hasNext()) {
			entry = it.next();
			val = entry.getValue();
			if (val > max){
				max = val;
				result=entry.getKey(); 
			} 
		}
		return result;
	}
	
	public static void main(String[] args) {
		Map<Integer,Integer> m;
		Random rand = new Random(47);		
		Map<Integer,Integer> x = new HashMap<Integer,Integer>();
		for (int i = 0; i< NUM_RUNS; i++) {
			m = runTest(rand);
			Integer mostCommon = getMostCommon(m);
			Integer freq = x.get(mostCommon);
			x.put(mostCommon, freq == null ? 1 : freq + 1);
		}		
		System.out.println(x);
		System.out.println(getMostCommon(x) + " appears more than other random numbers");
	}
} 

