// TIJ innerclasses ex7 + 8 p249
package innerclasses;
class Record {
	private String filename;
	private Catalog c;
	
	private int length() {
		return 0;
	}
	
	class Catalog {
		private float price = 2.49F;
		void name(String s) {
			filename = s;
			System.out.println("Inner - " + filename + " = " + length());
		}		
	}	
	
	void inspect() {
		c = new Catalog();
		c.name("Dancing Queen");		
		System.out.println("Outer - " + filename + " = " + length());
	}
	
	public static void main (String[] args) {
		Record r = new Record();
		r.inspect();
		System.out.println("price = " + r.c.price);
	}
}