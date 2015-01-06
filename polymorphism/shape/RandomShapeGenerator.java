//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape> {
  private Random rand = new Random(47);
  final int maxToMake;
  public RandomShapeGenerator (int howMany) {
	  maxToMake = howMany;
  }
  public Iterator<Shape> iterator() {
	 return new Iterator<Shape>() {
		  int numMade = 0;
		 public boolean hasNext() {
			 return numMade < maxToMake;
		 }
		 public void remove() {
			 // N/A
		 }
		 public Shape next() {
			 if (hasNext()) {				 
				 numMade++;
				 return RandomShapeGenerator.this.next();
			 } else {
				 throw new NoSuchElementException();
			 }
		 }
	 };
  }
  
  public Shape next() {
    switch(rand.nextInt(4)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
      case 3: return new Pentagon();
    }
  }
} ///:~
