// TIJ initialisation, ex.3,4
package initialisation;
class DefaultConstructor {
	DefaultConstructor() {
		System.out.println("New object.");
	}		
	DefaultConstructor(String msg) {
		System.out.println(msg + " New object.");
	}	
}

public class MakeObject {
	public static void main (String[] args) {
		DefaultConstructor obj1 = new DefaultConstructor();
		DefaultConstructor obj2 = new DefaultConstructor("Overloaded constructor");
	}
}