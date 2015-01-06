// TIJ initialization, ex.16 p136
package initialisation;
import java.util.*;
import static util.Print.*;

public class ArrayLoop {
	static void PrintArray(Object[] s) {
		for (Object o: s) {
			print(o.toString());	
		}
	}
	public static void main (String[] args) {
		PrintArray(new String[]{"cvbmn","fghj","asdf"});	
	}
}