//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
package polymorphism;
import static net.mindview.util.Print.*;

class Shared2 {
  private int refcount = 0;
  private static long counter = 0;
  private final long id = counter++;
  public Shared2() {
    print("Creating " + this);
  }
  public void addRef() { refcount++; }
  protected void dispose() {
    if(--refcount == 0)
      print("Disposing " + this);
  }
  public String toString() { return "Shared " + id; }
  protected void finalize() {
  	if (refcount > 0) {
  		System.out.println("Shared.finalize() error: refcount > 0");
  	}
  	// super.finalize();
  }
}

class Composing {
  private Shared2 shared;
  private static long counter = 0;
  private final long id = counter++;
  public Composing(Shared2 shared) {
    print("Creating " + this);
    this.shared = shared;
    this.shared.addRef();
  }
  protected void dispose() {
    print("disposing " + this);
    shared.dispose();
  }
  public String toString() { return "Composing " + id; }
}

public class ReferenceCounting {
  public static void main(String[] args) {
    Shared2 shared = new Shared2();
    Composing[] composing = { new Composing(shared),
      new Composing(shared), new Composing(shared),
      new Composing(shared), new Composing(shared) };
    for(Composing c : composing)
      c.dispose();
  }
} /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*///:~
