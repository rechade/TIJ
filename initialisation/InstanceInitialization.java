// TIJ initialization, ex.15
package initialisation;
class OneString {
	String aString;
	//instance initialization
	{
		aString = "hjkl";
		System.out.println(aString);
	}
}

public class InstanceInitialization {
	static OneString myString1 = new OneString();
	public static void main (String[] args) {
		// OneString myString1 = new OneString();
	}
}
	