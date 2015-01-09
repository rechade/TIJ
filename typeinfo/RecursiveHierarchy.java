// TIJ typeinfo ex8 p399
package net.gusto.tij.typeinfo;
import java.util.*;

public class RecursiveHierarchy {
	public static String getHierarchy(Object object) {		
		Class c=null;
		if (object.getClass().getSimpleName().contentEquals("Class")) {
			// recursive calls are all on Class objects
			c = (Class)object;
		} else {
			// initial input is not a Class
			c = object.getClass();
		}
		String fields = "";
		//String fields = Arrays.toString(c.getDeclaredFields());
		String result = c.getSimpleName();
		
		Class superclass=null;		
		try {
			if (!result.contentEquals("Object")) {
				superclass = c.getSuperclass();
				result = getHierarchy(superclass) + "." + result;
				result += (fields==null) ? "[]" : fields;          
				result += "\n";
			} else {				
				result = "." + result;
				result += (fields==null) ? "[]" : fields;          
				result += "\n";
			}
		} catch (NullPointerException e) {
			System.out.println(e);
			System.exit(1);
		} finally {
			return result;
		}
	}
	public static void main (String[] args) {
		ArrayList s = new ArrayList(3);
		System.out.println(getHierarchy(s));
	}
}