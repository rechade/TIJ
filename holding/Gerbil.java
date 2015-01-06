// TIJ holding, ex1 p278, ex8 p288, ex18 p297
package holding;
import java.util.*;

class Gerbil {
	static int counter = 0;
	int gerbilNumber;
	Gerbil() {
		gerbilNumber = counter++;
	}
	void hop() {
		System.out.println(" is hopping! ID" + gerbilNumber);
	}
	public static void main (String[] args) {
		String gerbilName;
		Map<String,Gerbil> gerbils = new HashMap<String,Gerbil>();
		gerbils.put("Alf",new Gerbil());                        
		gerbils.put("Ben",new Gerbil());
		gerbils.put("Charlie",new Gerbil());
		
		Iterator<String> it = gerbils.keySet().iterator();
		
		while (it.hasNext()) {
			gerbilName = it.next();
			System.out.print(gerbilName);
			gerbils.get(gerbilName).hop();
		}
	}
}

/* 
// ex8 p288
class Gerbil {
	static final int NUM_GERBILS = 10;
	static int counter = 0;
	int gerbilNumber;
	Gerbil() {
		gerbilNumber = counter++;
	}
	void hop() {
		System.out.println("hopping gerbil number " + gerbilNumber);
	}
	public static void main (String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		for (int i=0; i<NUM_GERBILS; i++) {
			gerbils.add(new Gerbil());
		}
		Iterator<Gerbil> it = gerbils.iterator();
		while (it.hasNext()) {
			it.next().hop();
		}
		for (int i=0; i<NUM_GERBILS; i++) {			
			(gerbils.get(i)).hop();
		}
	}
}
*/
