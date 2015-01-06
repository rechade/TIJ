// TIJ access, ex8
// this actually demonstrates a method of doing the problem from the paragraph above ex8
// that I tried with access2.PublicTest2.java
package access;

public class ConnectionManager {
	private static int connectionCount = 0;
	private static final int MAX_CONNECTIONS=6;
	private static Connection[] connectionArray = new Connection[MAX_CONNECTIONS];
	public static Connection getNewConnection() {
		if (connectionCount<MAX_CONNECTIONS) {
			connectionArray[connectionCount] = new Connection();
			connectionCount++;
			return connectionArray[connectionCount-1];
		} else {
			System.out.println("Error: can't create more than maximum connections");
			return null;
		}
	}
}