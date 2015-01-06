// TIJ strings ex7 p372
import java.util.regex.*;

class CapitalPeriod {
	public static void main (String[] args) {
		String[] s = new String[]{"all blues.", "All Blues.","All Blues", "all blues","A.","A","As"};
		Pattern p = Pattern.compile("^[A-Z].*\\u002E$");
		for (String string : s) {
			Matcher m = p.matcher(string);
			if (m.matches()) {
				System.out.println(string + " = match");
			} else {
				System.out.println(string + " = not a match");
			}
		}
	}
}