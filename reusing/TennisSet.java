// TIJ reusing, ex.1
package reusing;
class Ball {
	void bounce () {
		System.out.println("ta-pok");
	}
}

public class TennisSet {
	static private Ball b;
	
	public static void main (String[] args) {
		// lazy initialisation (just before it's needed)
		b = new Ball();	
		b.bounce();
	}
}