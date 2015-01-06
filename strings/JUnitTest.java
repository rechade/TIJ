// TIJ asdf
package strings;

import junit.framework.*;
import static org.junit.Assert.assertEquals;

class JUnitTest {
	public JUnitTest() {
	}
	static int add (int i, int j) {
		return i + j;	
	}
	
	@Test
	public static void main (String[] args) {
		
		try {
			org.junit.Assert.assertEquals("failure - strings are not equal", "tesxt", "text");
		} catch (Exception e) {
			
		}
	}
}