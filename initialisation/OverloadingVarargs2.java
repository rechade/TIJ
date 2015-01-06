//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won’t compile)
package initialisation;
public class OverloadingVarargs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	
	static void f(Character... args) {
		System.out.print("second");
	}
	public static void main(String[] args) {
		f(1, 'a'); // won't convert 1 to a Character - uses "first" 
		f('a', 'b', 'c'); // causes compile error, conversions mean both
			// of the overloaded methods match.
	}
}