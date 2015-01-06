// TIJ interfaces, ex.11 p229
package interfaces;
import java.lang.StringBuffer;

public class ReversePairs implements interfaces.interfaceprocessor.Processor {
	public String process(Object s) {
		StringBuffer input = new StringBuffer((String)s);
		StringBuffer output = new StringBuffer();
		while (input.length() >= 2) {
			output.append(input.charAt(1));	
			output.append(input.charAt(0));	
			input.deleteCharAt(0);	
			input.deleteCharAt(0);
		}
		if (input.length() >0) {
			output.append(input.charAt(0));	
		}		
		return (output.toString());		
	}
	public String name() {
		return ("Reverse pairs");
	}
}