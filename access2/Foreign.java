// access/foreign/Foreign.java
// TIJ access, ex9 extended
package access2;
import access.local.*;

public class Foreign {
	public static void main(String[] args) {
		// PackagedClass pc = new PackagedClass();
		// changed to test if I could get access to foo()
		// in access.local.PackagedAccess somehow
		access.local.AliasAccess.access().psi=10;	
		// access.local.PackagedClass.psi=10;		
	}
}