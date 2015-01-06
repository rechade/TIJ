package exceptions;

public class WatchComedy {

	static void think() throws Wronggg {
		throw new Wronggg();
	}
	public static void main(String[] args) {
		try {
			think();
		} catch (Wronggg w) {
			w.printStackTrace();
			System.out.println(w);
		}
	}

}
