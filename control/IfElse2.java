// TIJ, control p.99, ex.6 
package control;

import static util.Print.*;

public class IfElse2 {
	static int test(int testval, int target, int begin, int end) {			
		if((testval <= end) && (testval >= begin)) {
			printnb("true ");
		} else {
			printnb("false ");
		}
		if(testval > target)
			return +1;
		else if(testval < target)
			return -1;
		else
			return 0; // Match
	}
	public static void main(String[] args) {
		print(""+test(10, 5, 9, 10));
		print(""+test(5, 10, 5, 10));
		print(""+test(5, 5, 1, 4));
		print(""+test(5, 5, 5, 5));
		print(""+test(5, 5, 1, 10));
	}
}