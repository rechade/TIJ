// TIJ, control ex.8 
package control;
public class SwitchLoop {
	public static void main (String[] args) {
		for (int i=1; i<=5; i++) {
			switch (i) {
				case 1: System.out.println("i=1"); 
						//break;
				case 2: System.out.println("i=2"); 
						//break;
				case 3: System.out.println("i=3"); 
						//break;
				case 4: System.out.println("i=4"); 
						//break;
				case 5: System.out.println("i=5"); 
						//break;
				default: System.out.println("--default--");
			}
		}
	}
}