// TIJ innerclasses ex23 p261
package innerclasses;
interface U {
	void foo();
	void bar();
	void fnord();
}

class A {
	static int counter = 0;
	U getU() { 
		return new U() {
			int id = counter++;
			public void foo() {System.out.println("foo"+id);}
			public void bar() {System.out.println("bar"+id);}
			public void fnord() {System.out.println("fnord"+id);}
		};
	}	
}

class B {
	int ARRAY_SIZE = 10;
	U[] uArray = new U[ARRAY_SIZE];
	void storeU (U u, int i) {
		uArray[i] = u;		
	}
	void nullU (int i) {
		uArray[i]= null;
	}
	void callUMethods () {
		for (U u : uArray) {
			if (u!=null) {
				u.foo();
				u.bar();
				u.fnord();
			}
		}
	}
	public static void main (String[] args) {
		A a1 = new A();
		A a2 = new A();
		B b = new B();
		for (int i = 0; i < b.ARRAY_SIZE; i++) {
			b.storeU(a1.getU(),i);
		}
		b.callUMethods();
		b.nullU(0);
		b.storeU(a1.getU(),0);
		b.callUMethods();
	}
}
