//TIJ reusing, ex.23 + 24
//: reusing/Beetle.java
// The full process of initialization.
package reusing;
import static net.mindview.util.Print.*;
class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    print(s);
    return 47;
  }
}
public class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
  public static void main(String[] args) {
    print("Beetle constructor");
    Beetle b = new Beetle();
  }
} 
class DungBeetle extends Beetle {
	private static int x3 = printInit("static DungBeetle.x3 initialized");
	private int l=20;
	private int m=printInit("DungBeetle instance m initialized");
	public DungBeetle() {
		print("l = " + l + " m = " + m);		
	}	
	public static void main(String[] args) {
		print("DungBeetle constructor");
		DungBeetle db = new DungBeetle();
	}
}
/*
static Insect.x1 initialized
static Beetle.x2 initialized
static DungBeetle.x3 initialized
DungBeetle constructor
i =9 j =0
Beetle.k initialized
k=47 
j=39
DungBeetle instance m initialized
l=20 m = 47
*/