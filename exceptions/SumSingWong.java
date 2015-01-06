// TIJ exceptions ex1, 2, 3, 7, 27 p319
package exceptions;
import java.io.*;
import java.util.logging.Logger;

class NotRacistBut {
	public static void main (String[] args) {
		try {
			//throw new Exception("Sum Sing Wong");
		} catch (Exception e1) {
			System.out.println(e1);
			//e1.printStackTrace(System.out);
		} finally {
			System.out.println("Can do something after exception");			
		}
		Integer n;
		try{
			// n.toString();
		} catch (Exception e2) {
			e2.printStackTrace(System.out);
		}
		try {
			Integer[] a = new Integer[]{1,2};
			a[3]=0;
		} catch (Exception e3) {
			Logger logger = Logger.getLogger("xxxNotRacistBut array out of bounds");
			StringWriter trace = new StringWriter();
			e3.printStackTrace (new PrintWriter(trace));
			//logger.severe(trace.toString());
			logger.severe(trace.toString());	
			RuntimeException rte = new RuntimeException(e3);
			throw rte;
		}
	}
}
