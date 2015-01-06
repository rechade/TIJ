// TIJ interfaces, ex.4 p222
package interfaces;
abstract class Game {
	abstract void start();
}

class Pong extends Game {
	void start() {
		System.out.println("Starting Pong");
	}
	static void playPong(Game g) {
		g.start();	
	}
}

class PongTest {
	public static void main (String[] args) {
		Pong p = new Pong();
		Pong.playPong(p);
	}
}