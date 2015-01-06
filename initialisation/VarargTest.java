// TIJ initialisation, ex19 ex 20
// 
package initialisation;
public class VarargTest {
	static void printArray(String... messages) {
		for (String s: messages) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void main (String... args) {
		printArray("asdf","qwer","jkl;");
		printArray(new String[]{"tom","dick","jane"});
		printArray(args);
	}
}