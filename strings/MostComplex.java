// TIJ strings ex5 p368
import java.io.*;
import java.util.*;
class MostComplex {
	int i = 30022;
	char c = 'r';
	boolean b = false;
	float f = 554.888f;
	double d = 1235.664;
	String s= "Float";
	
	public static void main (String[] args) {
		MostComplex mc = new MostComplex();
		PrintStream ps = System.out;
		Formatter f = new Formatter(ps);
		f.format("int   %1$,+0(10d\n",mc.i); // can either be left justified OR zero padded
		f.format("char  %1$-10c\n",mc.c); 
		f.format("bool  %1$-10b\n",mc.b); 
		f.format("%2$-6.4s%1$-+(,10f\n",mc.f,mc.s); 
		f.format("%2$-6.4s%1$-+(10e\n",mc.d,mc.s); 
		f.format("hex   %1$010x\n",mc.i); // can either be left justified OR zero padded
		f.format("hash  %1$10h\n",mc.i); // can either be left justified OR zero padded		
	}
}
	
	
	