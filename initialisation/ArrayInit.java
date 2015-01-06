// TIJ initialization, array init methods test
package initialisation;
import java.util.*;
import static util.Print.*;

public class ArrayInit {
	static void printArray (Object[] a) {
		print(Arrays.toString(a));
	}
	static void printArray (int[] a) {
		print(Arrays.toString(a));
	}
	public static void main (String[] args) {
		int[] a1 = {1,2,3,}; // top p134
		Integer[] a2 = {4,5,6,}; // bot p135
		Integer[] a3 = new Integer[] {7,8,9,}; // mid p136
		
		printArray(a1);     
		printArray(a2);
		printArray(a3);
		//! printArray(Integer[] a4 = {10,20,30,}); // won't work it's not the "new" syntax but it's at the point of declaration
		//! printArray({10,20,30,});  // no way this should work too ambiguous
		printArray(new Integer[] {40,50,60}); // this is the versatile form
	}
}

// note unboxing/boxing doesn't apply to an array of wrapped/unwrapped data which is 
// completely different from its contents.
// 