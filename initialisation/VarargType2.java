// TIJ initialization/VarargType2.java 
// test whether unboxing works with varargs see p138
package initialisation;
public class VarargType2 {
	static void f (int... i) {
		for (int j: i) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
	public static void main (String[] args) {
		f(new Integer(3),4,5);		
	}	
}