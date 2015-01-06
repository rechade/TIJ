//: reusing/Cartoon.java
// Constructor calls during inheritance.
package reusing;
import static net.mindview.util.Print.*;
class Art {
	Object artObject;
	Art() {
		//artObject = new Object();		
		print("Art constructor"); 		
		print(artObject); 
	}
}
class Drawing extends Art {
	int DrawingInt;
	Drawing() { print("Drawing constructor"); }
}
public class Cartoon extends Drawing {
	Object cartoonObject;	
	public Cartoon() {
		artObject = new Object();
		// print(artObject);
		print("Cartoon constructor"); 
	}
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
}