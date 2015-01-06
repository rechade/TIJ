//: polymorphism/Shapes.java
package polymorphism;
import java.util.Iterator;

// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
	private static final int NUM_SHAPES = 12;
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator(NUM_SHAPES);
  public static void main(String[] args) {
    Shape[] s = new Shape[NUM_SHAPES];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s) {
      //shp.draw();
      //shp.message(); 
    }
    Iterator<Shape> it = gen.iterator();
    Shape s1;
    while (it.hasNext()) {
    	s1 = it.next();
    	s1.draw();
    	s1.message();
    }
   }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
