// TIJ access, ex.8
// this actually demonstrates a method of doing the problem from the paragraph above ex8
// that I tried with access2.PublicTest2.java

package access2;
import access.*;

public class ConnectionTester {
	public static void main (String[] args) {		
		ConnectionManager cm = new ConnectionManager();
		Connection c;
		for (int i=0; i<7; i++){			
			System.out.println("Creating Connection "+ i);
			c = cm.getNewConnection();
			if (null!=c) {
				c.display();
			}
		}
	}
}