// access/local/PackagedClass.java
package access.local;

class PackagedClass {
	public PackagedClass() {
		System.out.println("Creating a packaged class");
	}
	
	static PackagedClass p=new PackagedClass();	
	
	public static PackagedClass access() {
		return p;
	} 
	
	public static int psi =9;
	
	public static void foo() {
		System.out.println("foo");
	}	
}