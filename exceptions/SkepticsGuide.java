// TIJ exceptions ex 10, 11 p330
package exceptions;

class ReductioException extends Exception {
	ReductioException(){}
	ReductioException(Exception e) {
		super(e);
	}
}
class AdHominemException extends Exception {	
	AdHominemException(){}
	AdHominemException(Exception e) {
		super(e);
	}	
}

public class SkepticsGuide {
	static void g() throws ReductioException {
		throw new ReductioException();
	}
	static void f() throws AdHominemException {
		try {
			g();
		} catch (ReductioException re) {			
			throw new RuntimeException(new AdHominemException(re));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace();
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste);
			}
		}
	}

}
