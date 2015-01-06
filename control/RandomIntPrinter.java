// TIJ, control ex.2 / 3 
package control;
import java.util.*; // for Random

public class RandomIntPrinter {
	public static void main (String[] args) {
		Random rand = new Random(22);
		// for (int i = 0; i <25; i++) {
		while (true) {
			System.out.println(rand.nextInt());
		}
	}
}