// TIJ control, ex.10 
package control;
import java.util.*;

public class VampireNumbers {
	
	public static int sortDigits(int i) {
		int[] digits = new int[4];
		for(int j=0; j<4; j++) {			
			digits[j] = i % 10;
			i /= 10;
		}
		Arrays.sort(digits);
		i=0;
		int factor=1;
		for(int j=0; j<4; j++) {
			i+= digits[j] * factor;
			factor *=10;
		}				
		return i;
	}
	
	public static void main (String[] args) {		
		int product;
		
		for (int n1=10; n1<100; n1++) {
			for (int n2=10; n2<100; n2++) {
				if (n1>n2) {
					continue;
				}
				if ( ((n1%10)==0) && ((n2%10)==0) ) {
					//System.out.println("trailing 0s: " + n1 + "," + n2);
					continue;
				}
				product = n1 * n2;
				if ((product < 1000) || (product > 9999)) {
					//System.out.println("not 4 digits: " +  product);
					continue;
				}
				if ( (sortDigits(product) == (sortDigits(n1 + (n2*100)))  )) {
					System.out.println("Vampire number: " + product + "=" + n1 + "*" + n2);
				}				 
			}			
		}
	}
}