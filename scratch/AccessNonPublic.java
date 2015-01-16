// TIJ typeinfo ex25 p434
package net.gusto.tij.scratch;
import net.gusto.tij.typeinfo.NoPublicMethods;
import java.lang.reflect.*;

class AccessNonPublic {
	public static void main (String[] args) {
		Method[] methods;
		methods = NoPublicMethods.class.getDeclaredMethods();
		System.out.println(methods);
		for (Method m : methods) {
			System.out.println(m);
			m.setAccessible(true);
			try {
				m.invoke(new NoPublicMethods(),new Object[0]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
}
