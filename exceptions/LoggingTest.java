// TIJ exceptions ex6 p322
package exceptions;
import java.util.logging.Logger;
import java.io.*;

class Exception1 extends Exception {
	private static Logger logger = Logger.getLogger("Exception1");
	Exception1() {
		StringWriter trace = new StringWriter();
		printStackTrace (new PrintWriter(trace));
		logger.severe(trace.toString());
	}	
}

class Exception2 extends Exception {
	private static Logger logger = Logger.getLogger("Exception2");
	Exception2() {
		StringWriter trace = new StringWriter();
		printStackTrace (new PrintWriter(trace));
		logger.severe(trace.toString());
	}	
}
public class LoggingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<3; i++) {
			try {
				throw new Exception1();
			} catch (Exception1 e) {
			
			}
		}
		for (int i=0; i<3; i++) {
			try {
				throw new Exception2();
			} catch (Exception2 e) {
			
			}
		}
	}

}
