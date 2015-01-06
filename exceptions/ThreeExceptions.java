// TIJ exceptions ex 9 13 p324
package exceptions;
import java.util.Random;
class ExceptionAlpha extends Exception {	
}
class ExceptionBravo extends Exception {	
}
class ExceptionCharlie extends Exception {	
}

public class ThreeExceptions {
	static void boom() throws ExceptionAlpha, ExceptionBravo, ExceptionCharlie {
		Random rand = new Random();
		switch (rand.nextInt(3)) {
			case 0 :throw new ExceptionAlpha(); 
			case 1: throw new ExceptionBravo();
			case 2: throw new ExceptionCharlie();
		}
	}
	public static void main (String[] args){
		Integer i = null;
		i.toString();
		try {
			boom();
		} catch (Exception e) {
			e.printStackTrace();
			for(StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste);
			}
		} finally {
			System.out.println("asdf");
		}
	}
}
