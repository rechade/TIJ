// TIJ access ex 4 pt2 (see also ..\initialisation\ProtectedTest1.java
// and ..\access\Manuever.java)
package access;
import initialisation.Platoon;
public class ProtectedTest2 {
	public static void main (String[] args) {
		Platoon p = new Platoon();
		// run is protected method in another package
		//! p.run();
	}
		
}