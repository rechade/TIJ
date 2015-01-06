// TIJ, control ex.9
package control;

public class Fibonacci {

	public static void generateFibonacciSequence(int n) {		
		int previousTerm = 0;
		int thisTerm = 1;		
		int nextTerm;  
		
		// Can't print sequence less than one terms
		if  (n < 1) {
			System.out.println("Number of terms was less than 1 - exiting");
			return;
		}
		
		// Print first term and exit method if that's all they requested
		System.out.println(thisTerm);
		if (n==1) {		
			return;
		}		
		
		// now can automatically generate terms
		for (int i=2; i <= n; i++) {				
			nextTerm = previousTerm + thisTerm;
			System.out.println(nextTerm);
			previousTerm = thisTerm;
			thisTerm = nextTerm;			
		}		
	}
	
	public static void main (String[] args) {
		generateFibonacciSequence (7);
	}
}