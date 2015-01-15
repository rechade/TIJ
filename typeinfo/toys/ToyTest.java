//: typeinfo/toys/ToyTest.java
// Testing class Class.
package net.gusto.tij.typeinfo.toys;
import java.lang.reflect.*;
import static net.mindview.util.Print.*;
import java.lang.Exception;
interface HasBatteries {}
interface Waterproof {}
interface HasSounds {}
interface Shoots {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i, Integer j) {}
  Toy(int i) {}
  public int counter;
}

class ToyReflection {
	public static void main (String[] args) {		
		//System.out.println("asdf");
		Class anyClass = net.gusto.tij.typeinfo.toys.Toy.class;
		Constructor[] constructors = anyClass.getDeclaredConstructors();
		//System.out.println(constructors.length);
		int i=0;
		Class[] argClasses = null;
		for (Constructor c : constructors) {
			argClasses = c.getParameterTypes();
			if ( argClasses.length == 1){				
				for (Class argClass : argClasses) {
					/*
					try {						
						System.out.println(""+argClass.newInstance());
					} catch (InstantiationException ie) {
						System.out.println(argClass.getName());
					} catch (Exception e) {
						e.printStackTrace();
					}
					*/
					try {
						Object reflectedInstance = c.newInstance(new Object[]{22});
						System.out.println("Made reflected instance :" + reflectedInstance.getClass().getSimpleName());
					} catch (Exception e) {						
						System.out.println(argClass.getName());
						e.printStackTrace();
					}
				}
			}
		}		
	}	
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots, HasSounds {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
    print("Class name: " + cc.getName() +
      " is interface? [" + cc.isInterface() + "]");
    print("Simple name: " + cc.getSimpleName());
    print("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("net.gusto.tij.typeinfo.toys.FancyToy");
    } catch(ClassNotFoundException e) {
      print("Can't find FancyToy");
      System.exit(1);
    }
    printInfo(c);
    for(Class face : c.getInterfaces())
      printInfo(face);
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      // Requires default constructor:
      obj = up.newInstance();
    } catch(InstantiationException e) {
      print("Cannot instantiate");
      System.exit(1);
    } catch(IllegalAccessException e) {
      print("Cannot access");
      System.exit(1);
    }
    printInfo(obj.getClass());
    
  }
}