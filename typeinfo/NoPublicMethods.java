// TIJ typeinfo p435
package net.gusto.tij.typeinfo;
public class NoPublicMethods {
	static protected void ProtectedMethod(){System.out.println("protected");}
	static private void PrivateMethod(){System.out.println("private");}
	static void FriendlyMethod(){System.out.println("friendly");}
}