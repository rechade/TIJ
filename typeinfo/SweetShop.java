//: typeinfo/SweetShop.java
// Examination of the way the class loader works.
package net.gusto.tij.typeinfo;
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Candy {
	static { print("Loading Candy"); }
}

class Gum {
	static { print("Loading Gum"); }
}

class Cookie {
	static { print("Loading Cookie"); }
}

public class SweetShop {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Candy, Gum or Cookie (99 to finish):");
		String item = scanner.next();
		while (!item.contentEquals("99")) {
			try {				
				Class c = Class.forName("net.gusto.tij.typeinfo." +item);	
				try {
					Object o = c.newInstance();
				} catch (InstantiationException e) {
					System.out.println("Could not instantiate " + item);
					System.exit(1);
				} catch(IllegalAccessException e) {
					print("Cannot access" + item);
					System.exit(1);
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Could not find class" + item);
				System.exit(1);		
			}
			System.out.println("Enter Candy, Gum or Cookie (99 to finish):");
			item = scanner.next();
		}
		/*
		print("inside main");
		new Candy();
		print("After creating Candy");
		try {
			Class.forName("Gum");
		} catch(ClassNotFoundException e) {
			print("Couldn't find Gum");
		}
		print("After Class.forName(\"Gum\")");
		new Cookie();
		print("After creating Cookie");
		*/
	}
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
