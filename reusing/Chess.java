//: TIJ reusing/Chess.java
// ex.6 p171
// Inheritance, constructors and arguments.
package reusing;
import static net.mindview.util.Print.*;

class Game {
	// this class has no default constructor
	// because we only provided constructors with arguments.
	// The compiler does not automatically add the () constructor in this case
	// so the client would HAVE to use one of the ones provided. Otherwise 
	// there will be an error. (see boardgame below)
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		// if there is not a call to the int signature Game(...) constructor
		// the compiler will not be able to make a Game class, see error above.
		super(i); // also super constructor call must be first thing done 		
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}