// TIJ generics ex21 p472
u
//: generics/ClassTypeCapture.java
import java.util.*;
import java.lang.reflect.*;
class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String,Class<?>> typeMap = new HashMap<String,Class<?>>();
	
	public void addType(String typeName, Class<?> kind) {
		typeMap.put(typeName,kind);
	}
	public Object createNew (String typeName) {
		Object result = null;
		Class<?> classType = typeMap.get(typeName);
		try {
			result = classType.newInstance();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error - unable to make "+typeName);
			System.exit(1);
		}
		return result;
	}
	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}	
	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 =
			new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2 =
			new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
		ctt2.addType("House", House.class);		
		ctt2.addType("Building", Building.class);		
		System.out.println(ctt2.createNew("House"));	
		System.out.println(ctt2.createNew("Building"));
		System.out.println(ctt2.createNew("Block"));
	}
} /* Output:
true
true
false
true
*///:~
