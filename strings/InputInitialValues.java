// TIJ strings ex20 p388
package strings;
import java.util.*; // for Scanner
class InputInitialValues {
	private int i;
	private long l;
	private double d;
	private String s;
	
	InputInitialValues(String input) throws Exception {
		boolean result=false;
		Scanner scanner = new Scanner(input);
		if (scanner.hasNextInt()) { 
			i = scanner.nextInt();		
			if (scanner.hasNextLong()) {				
				l = scanner.nextLong(); 
				if (scanner.hasNextDouble()) {
					d = scanner.nextDouble();
					if (scanner.hasNext()) {
						s = scanner.next();
						result = true;
					}
				}
			}
		}
		if (result==false) {
			throw new Exception();
		}
	}
	public String toString() {
		return ("i="+i + " l="+l +" d="+d +" s="+s);
	}	
	public static void main (String[] args) {
		StringBuilder input = new StringBuilder();
		for (String arg : args) {
			input.append(arg + " ");
		}			
		try {
			InputInitialValues iiv = new InputInitialValues(input.toString());
			System.out.println("iiv: " + iiv);
		} catch (Exception e) {			
			System.out.println("Error, please input 4 args: int long double string");			
		}
	}
}