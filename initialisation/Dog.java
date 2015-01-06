// TIJ initialisation, ex.5,6
package initialisation;
public class Dog {
	static void bark() {
		System.out.println("bark");
	}	
	static void bark(int i, double d) {
		System.out.println("howl");
	}
	static void bark(char c) {
		System.out.println(c);
	}
	static void bark(double d, int i) {
		System.out.println("arf");
	}
	public static void main (String[] args) {
		bark();
		bark('w');
		bark(5.0f,3);
		bark(2,4.0f);
		bark(2,4.0f);
		bark(5.0f,3);
	}
}