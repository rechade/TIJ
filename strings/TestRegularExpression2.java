import java.util.regex.*;
public class TestRegularExpression2 {
	public static void main (String[] args) {
		Pattern p = Pattern.compile(args[1]);
		Matcher m = p.matcher(args[0]);
		while (m.find()) {
			System.out.println("Match \"" + m.group() + "\" at postitions " + m.start() +"-"+ (m.end()-1));	
		}
	}	
}