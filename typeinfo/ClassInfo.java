package net.gusto.tij.typeinfo;
import java.lang.reflect.*;
import java.lang.Iterable;
import java.lang.annotation.*;
interface TestInterface {
	public String toot();
}
class ClassInfo implements TestInterface {	

	Integer i = 99;
	
	@SuppressWarnings ("unchecked")
	public String toot() {
		return "toot";
	}
	static void printMemberInfo(Object[] objects) {
		
		for (Object object: objects) {
			try {
				System.out.println(object.getClass().newInstance().getClass().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main (String[] args) {
		
		String className=null;		
		if (args.length == 1) {
			className = args[0];
		} else {
			System.out.println("please give a classname ");
			System.exit(1);			
		}
		Class c = null;
		try {
			c = Class.forName( className);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Method[] methods = c.getDeclaredMethods()
		if (null!=c.getDeclaredAnnotations()) {
			for (Annotation a : c.getDeclaredAnnotations() ) {
				System.out.println("Annotation = " + a);
			}
		}
		if (null!=c.getDeclaredFields()) {
			for (Field f : c.getDeclaredFields() ) {
				System.out.println("Field = " + f);
			}
		}    
		if (null!=c.getDeclaredMethods()) {
			for (Method m : c.getDeclaredMethods() ) {
				System.out.println("Method = " + m);
			}
		}
		if (null!=c.getDeclaredConstructors()) {
			for (Constructor con : c.getDeclaredConstructors() ) {
				System.out.println("Constructor = " + con);
			}
		}
		if (null!=c.getDeclaredClasses()) {
			for (Class cl : c.getDeclaredClasses() ) {
				System.out.println("Class = " + cl);
			}
		}
	}	
}