// TIJ, control - ex.4 
package control;
public class NestedForLoops {
	public static void main (String[] args) {
		boolean prime;
		for (int i = 2; i < 100; i++) {	
			prime = true;			
			for (int j=2; j<=10; j++) {
				if ((i%j) == 0) {
					if (j!=i) {
						prime = false;					
					}
				}
			}				
			if (prime) {
				System.out.println (i + " is prime.");
			}
		}
	}
}