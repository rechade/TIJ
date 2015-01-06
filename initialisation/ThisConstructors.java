// TIJ initialisation, ex.9
package initialisation;
	
class Ball {
	int radius;
	String colour;
	Ball(int r) {
		radius=r;	
	}
	Ball (String s, int r) {
		this(r);
		colour=s;
	}
	void bounce() {
		System.out.println("boing");		
	}
}
public class ThisConstructors {
	static void pass(Ball b) {
		System.out.println("passing");
	}
	public static void main (String[] args) {
		Ball football = new Ball ("blue", 13);
		System.out.println(football.colour + " cm=" + football.radius);
		pass(football);
		football.bounce();
	}
}