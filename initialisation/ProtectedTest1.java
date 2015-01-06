// TIJ access, exercise 4 pt1 (see also access folder)
package initialisation;

public class ProtectedTest1 {
	public static void main (String[] args) {
		Platoon p = new Platoon();
		p.run(); // access protected method run from same package
	}
}