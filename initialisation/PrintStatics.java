// TIJ initialization, ex.14
package initialisation;
import static util.Print.*;

class StaticInitialization {
	static String s1 = "asdf";
	static String s2;
	static {
		s2 = "qwerty";
	}
	static void printFields() {
		print (s1);
		print (s2);
	}	
}

public class PrintStatics {	
	public static void main (String[] args) {
		//print(StaticInitialization.s1);
		//print(StaticInitialization.s2);
		StaticInitialization.printFields();
	}
}
