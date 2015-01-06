//TIJ innerclasses ex17 p256 modified from
// TIJ interfaces, ex.19 p241
package innerclasses;
import java.util.Random;

interface Toss {
	void doToss();	
}

class DiceToss implements Toss {
	private DiceToss() {}
	static TossFactory factory = new TossFactory() {
		public Toss getToss() {
			return new DiceToss();
		}
	};	
	static Random rand = new Random(47);
	public void doToss() {
		System.out.println("d6 = "+(rand.nextInt(6)+1)); 
	}
}

class CoinToss implements Toss {
	private CoinToss() {}
	static TossFactory factory = new TossFactory() {
		public Toss getToss() {
			return new CoinToss();
		}
	};
	static Random rand = new Random(47);
	public void doToss() {		
		if ((rand.nextInt(2)) == 0) {			
			System.out.println("Coin toss = heads"); 
		} else {
			System.out.println("Coin toss = tails"); 
		}
	}
}

interface TossFactory {
	Toss getToss();
}
class TossTest2 {
	static void saveThrow(TossFactory fact) {
		fact.getToss().doToss();
	}
	public static void main (String[] args) {
		for (int i=0; i<20; i++){
			saveThrow(CoinToss.factory);
			saveThrow(DiceToss.factory);
		}
	}	
}

/*

class DiceTossFactory implements TossFactory {	
	public Toss getToss() {
		return new DiceToss();	
	}
}
class CoinTossFactory implements TossFactory {	
	public Toss getToss() {
		return new CoinToss();	
	}
}
*/