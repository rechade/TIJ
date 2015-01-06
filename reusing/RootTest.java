// TIJ reusing, ex.9, 12
package reusing;
class Component1 {
	Component1(int i) {
		System.out.println("Component1");	
	}	
	void dispose() {
		System.out.println("Disposal - Component1");	
	}
}

class Component2 {
	Component2(int i) {
		System.out.println("Component2");	
	}
	void dispose() {
		System.out.println("Disposal - Component2");	
	}
}

class Component3 {
	Component3(int i) {
		System.out.println("Component3");	
	}
	void dispose() {
		System.out.println("Disposal - Component3");	
	}
}

class Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;	
	Root(int i) {
		c1 = new Component1(0);  
		c2 = new Component2(0);  
		c3 = new Component3(0);  
		System.out.println("Root");	
	}
	void dispose() {
		System.out.println("Disposal - Root");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}

class Stem extends Root {	
	Stem(int i) {
		super(i);
		System.out.println("Stem");		
	}	
	void dispose() {
		System.out.println("Disposal - Stem");	
		super.dispose();
	}
}

public class RootTest {
	public static void main (String[] args) {
		Stem s = new Stem(0);
		try {		
		} finally {
			s.dispose();	
		}
	}
}