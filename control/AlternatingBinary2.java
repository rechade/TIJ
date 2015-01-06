// TIJ, control - ex.5
// Repeat Exercise 10 from the previous chapter, using the ternary operator
// and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( )
package control;

public class AlternatingBinary2 {
	static final int N1 = 0xAAAAAAAA;
	static final int N2 = 0x55555555;

	public static void myPrintlnIntToBinaryString (int n) {
		int binaryMaskBit = 0x1;
		for (int i=0; i < 32; i++) {			
			System.out.print( ((binaryMaskBit & n) != 0x0) ? '1' : '0');
			binaryMaskBit <<= 1;
		}
		System.out.println();
	}

	public static void main (String[] args) {		
		myPrintlnIntToBinaryString(N1 & N2);
		myPrintlnIntToBinaryString(N1 | N2);
		myPrintlnIntToBinaryString(N1 ^ N2);
		myPrintlnIntToBinaryString(~N1);
		myPrintlnIntToBinaryString(~N2);
	}
}