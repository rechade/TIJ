// TIJ initialisation, ex.17
// also access ex.4
package initialisation;
import java.util.*;
import static util.Print.*;

class Human {
	Human(String s) {
		print("Constructing " + s);
	}	
}

public class Platoon {	
	static Human[] platoonMembers = new Human[20];
	public static void display() {
		System.out.println("Hooo ahhh");
	}
	protected static void run() {
		System.out.println("Platoon is running (PROTECTED)");
	}
	public static void main (String[] args) {
		print("running main()");
		int i=0;
		for (Human h: platoonMembers) {
			h = new Human("Private " + i++);
		}
	}	
}