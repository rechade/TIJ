//: polymorphism/shape/Circle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Pentagon extends Shape {
  @Override public void draw() { print("Pentagon.draw()"); }
  @Override public void erase() { print("Pentagon.erase()"); }
  @Override public void message() {
  	  System.out.println("I am a Pentagon");
  }
} ///:~
