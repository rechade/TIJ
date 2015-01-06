// TIJ reusing, ex.19,20,21 p185
package reusing;
class Foo {
	// final does nothing if the method is private, because it does not exist 
	// to derived classes
	private final void display() {
		System.out.println("Foo");
	}
}

class Foobar extends Foo {
	// @Override warns if you are illusion-overriding anything eg a private method 
	// when you aren't p186
	//! @Override final void display() {
	final void display() {
		System.out.println("Foobar");
	}
}
class BlankFinal {
	final Foo FOO;
	BlankFinal() {
		FOO = new Foo();
	}
}

class BlankFinalTest {
	public static void main (String[] args) {
		BlankFinal b = new BlankFinal();
		System.out.println(b.FOO);
		//b.FOO = new Foo();
		Foobar fb = new Foobar();
		fb.display();
	}
}