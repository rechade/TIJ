// TIJ interfaces, ex.17 p236
package interfaces;
interface MilestoneYears {
	int ONE = 1;
	int EIGHTEEN = 18;
	int FORTY = 40;
}

class Birthdays implements MilestoneYears {
}


public class ImplicitTest {
	public static void main (String[] args) {
		// if static this should print
		System.out.println(MilestoneYears.EIGHTEEN);
		// if final this should be an error
		//! MilestoneYears.EIGHTEEN = 20;
	}
}