//: strings/SplitDemo.java
import java.util.regex.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class SplitDemo {
	public static void main(String[] args) {
		String input =
			"This!!unusual use!!of exclamation!!points";
		//print(Arrays.toString(Pattern.compile("!!").split(input)));
		print(Arrays.toString(input.split("!!")));
		// Only do the first three:
		//print(Arrays.toString(Pattern.compile("!!").split(input, 3)));		
		print(Arrays.toString(input.split("!!",3 )));
	}
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
