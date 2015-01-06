// TIJ exceptions ex 18, 19 p338
//: exceptions/LostMessage.java
// How an exception can be lost.
package exceptions;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}
class CleanupException extends Exception {
	  public String toString() {
	    return "A cleanup exception";
	  }
	}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	void cleanup() throws CleanupException {
	    throw new CleanupException();
	  }
	public static void main(String[] args) {
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
			  try {
				  lm.dispose();
			  } catch (Exception e) {
				  e.printStackTrace();
			  } finally {
				  try {
					  lm.cleanup();
					  // deal with clean up from lm.dispose Exception
					  // and this appears in the final stacktrace output, losing the others!
				  } catch (Exception e) {
					  System.out.println(e);
				  } finally {
					  // infinite levels
				  }
			  }
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
