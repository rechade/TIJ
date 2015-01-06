// TIJ innerclasses, ex.1 p244
package innerclasses;
class Outer {
	private String description;
	Outer() {
		description = "crinkly";
	}
	
	class Inner {
		private int numWidgets;	
		Inner() {
			numWidgets = 0;
		}    	
		Inner(int i) {
			numWidgets = i;
		}	
		void setNumWidgets(int i) {
			numWidgets = i;
		}
		int getNumWidgets() {
			return numWidgets;
		}
		public String toString() {
			System.out.println(description);
			return description;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main (String[] args) {
		Outer o = new Outer();
		Inner i = o.getInner(); // using o to create Inner i,
								// now i is linked to that outer object
		i.setNumWidgets(9);
		System.out.println(i.getNumWidgets());
		i.toString();
	}
}

class Boundary {
	Outer o = new Outer();
	Outer.Inner i1 = o.new Inner(25);
 	public static void main (String[] args) { 		
 		Boundary b = new Boundary(); 		
 		// remember static main() does not exist in an object so it must not
 		// refer to instance variables directly, only from an object reference
 		//! System.out.println(i1.getNumWidgets());
 		System.out.println(b.i1.getNumWidgets());
	}
}