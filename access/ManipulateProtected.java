// TIJ access, ex.6
package access;
class ProtectedData1 {
	protected int i;
}

public class ManipulateProtected {
	
	static ProtectedData1 p = new ProtectedData1();
	
	static void changeI(int j) {	
		p.i = j;
	}
	
	public static void main (String[] args) {
		System.out.println("protected i=" +p.i);
		changeI(6);
		System.out.println("protected i=" +p.i);		
	}
}