package control;
import static util.Print.*;

public class IfElse {
	static int result = 0;
	static boolean inRange = false;
	static void test(int testval, int target, int begin, int end) {
		inRange = false;
		if ( (testval <= end) && (testval >= begin) ) {
			inRange = true;
		}
		if(testval > target)
			result = +1;
		else if(testval < target)
			result = -1;
		else
			result = 0; // Match
	}
	public static void main(String[] args) {
		test(10, 5, 9, 10);
		print("" + inRange + " " +result);
		test(5, 10, 5, 10);
		print("" + inRange + " " +result);
		test(5, 5, 1, 4);
		print("" + inRange + " " +result);
		test(5, 5, 5, 5);
		print("" + inRange + " " +result);
		test(5, 5, 1, 10);
		print("" + inRange + " " +result);
	}
}