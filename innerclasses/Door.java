// TIJ innerclasses ex20 p258
package innerclasses;
interface Fixable {
	void screw();
	static class HandyMan {
		static void fix(Fixable f) {
			System.out.println("HandyMan.fix()");
			f.screw();
			f.glue();
		}
	}
	void glue();
}

class Door implements Fixable {
	public void screw() {
		System.out.println("Door.screw()");
	}	
	public static void main (String[] args) {
		Door d = new Door();
		System.out.println("Door.main()");	
		HandyMan john = new HandyMan();
		john.fix(d);
	}
	public void glue() {
		System.out.println("Door.glue()");
	}	
}

class DoorTest {
	public static void main (String[] args) {
		System.out.println("DoorTest.main()");	
		Door d = new Door();
		Door.HandyMan.fix(d);
	}
}