// TIJ access, ex.1
// also ex.4 pt3
package access;
import initialisation.Platoon;
// static here with individual members means you can use it 
// without the qualifying ClassName
//import static util.debugoff.DebugTools.debug;
import static util.debug.DebugTools.debug;

public class Maneuver {
	static Platoon p;
	public static void main (String[] args) {		
		p = new Platoon();
		debug("DEBUG: displaying platoon..");
		p.display();
		// won't compile, as it's protected and from another package
		//! p.run(); 
	}
}