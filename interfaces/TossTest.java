// TIJ interfaces, ex.19 p241
package interfaces;
import java.util.Random;

interface Toss {
	void doToss();	
}

class DiceToss implements Toss {
	static Random rand = new Random(47);
	public void doToss() {
		System.out.println("d6 = "+(rand.nextInt(6)+1)); 
	}
}

class CoinToss implements Toss {
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
class TossTest {
	static void saveThrow(TossFactory fact) {
		fact.getToss().doToss();
	}
	public static void main (String[] args) {
		for (int i=0; i<20; i++){
			saveThrow(new CoinTossFactory());
			saveThrow(new DiceTossFactory());
		}
	}	
}