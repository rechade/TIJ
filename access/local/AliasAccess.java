//TIJ access ex9 
// trying to extend ex9. this was to test whether it was possible to use
// a public method foo() from a friendly class in another package.
// I made this class public for the access2.AliasAccess class to be able to use it.
// Now the public foo() method from PackagedClass can be called inline from any other
// package, even though it's in a friendly access class of another package  
package access.local;

public class AliasAccess extends PackagedClass {			
	// public static Object p=PackagedClass.access(); 
}