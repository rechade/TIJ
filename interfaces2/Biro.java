// TIJ interfaces, ex.5 p255
package interfaces2;
import interfaces.Pen;

class Biro implements Pen {
	public void fill() {
		System.out.println("Biro.fill()");	
	}
	public void shake() {
		System.out.println("Biro.shake()");	
	}
	public void write() {
		System.out.println("Biro.write()");	
	}
	public static void main (String[] args) {
		Biro b = new Biro();
		b.fill();
		b.shake();
		b.write();
	}
}
