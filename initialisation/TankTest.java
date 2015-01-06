// TIJ initialisation, ex 12
package initialisation;

class Tank {
	boolean full;
	
	Tank() {
		full = false;
		System.out.println("default constructor");
	}		
	
	Tank(boolean b) {
		full = b;
		System.out.println("boolean constructor");
	}
	
	void setFull (boolean b) {
		full = b;
	}
	
	protected void finalize() {
		System.out.println("Finalizing a tank " + full);
		if (full==true) {
			System.out.println("Error - tank was full");
		} else {
			System.out.println("Ok - tank was empty");
		}
		// super.finalize();
	}
}

public class TankTest {

	static final int NUM_TANKS=50;
	
	public static void main (String[] args) {
	
		Tank[] tankArray = new Tank[NUM_TANKS];
		
		tankArray [0] =	new Tank(true);	
		tankArray [1] =	new Tank();
		tankArray [1].setFull(true);
		tankArray [2] =	new Tank();
		tankArray [2].setFull(false);
		tankArray [3] =	new Tank(true);		
		tankArray [4] =	new Tank(false);
		
		for (int i=0; i<NUM_TANKS; i++) {
			tankArray[i] = new Tank();
		}
		for (int i=0; i<NUM_TANKS; i++) {
			tankArray[i] = new Tank();
		}
		
		System.gc();		
		
		for (int i=0; i<NUM_TANKS; i++) {
			tankArray[i] = new Tank();
		}
		for (int i=0; i<NUM_TANKS; i++) {
			tankArray[i] = new Tank();
		}	
	}
}