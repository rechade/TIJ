// TIJ holding ex15 p292
package holding;
import net.mindview.util.Stack;

class StackExpression {
	static String expression = "+U+n+c-+e+r+t-+a-+i-+n+t+y-+-+r+u-+l+e+s-";
	static Stack<Character> s1 = new Stack<Character>();
	public static void main (String[] args) {	
		Character opChar, nextChar;
		for(int i=0; i<expression.length(); i++) {
			opChar = expression.charAt(i);
			switch (opChar) {
				case'+': nextChar= expression.charAt(++i);
					s1.push(nextChar);
					break;
				case'-': System.out.print(s1.pop());
					break;
				default: break;
			}			
		}
	}
}