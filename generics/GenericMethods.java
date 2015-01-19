//: generics/GenericMethods.java

public class GenericMethods {
	public <T, U> void f(T x, U y, Integer z) {
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
		System.out.println(z.getClass().getName());
	}
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("",1,1);
		gm.f(1,"",1);
		gm.f(1.0,'v',3);
		gm.f(1.0F,1,1);
		gm.f('c',',',4);
		gm.f(gm,"",0xF1);
	}
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
