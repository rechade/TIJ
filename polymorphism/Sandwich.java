//: polymorphism/Sandwich.java
// Order of constructor calls.
package polymorphism;
import static net.mindview.util.Print.*;
interface FastFood {
	void takeAway();
	void eat();
}

class Meal{
  Meal() { print("Meal()"); }
}

class Bread {
  Bread() { print("Bread()"); }
}

class Cheese {
  Cheese() { print("Cheese()"); }
}

class Lettuce {
  Lettuce() { print("Lettuce()"); }
}

class Pickle {
  Pickle() { print("Pickle()"); }
}

class Lunch extends Meal {
  Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
  PortableLunch() { print("PortableLunch()");}
}

public class Sandwich extends PortableLunch implements FastFood {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();
  private Pickle p = new Pickle();  
  public Sandwich() { print("Sandwich()"); }
  public void takeAway() { print("Sandwich.takeAway()");}      
  public void eat() { print("Sandwich.eat()");}
  public static void main(String[] args) {
    Sandwich s = new Sandwich();
    s.takeAway();
    s.eat();
  }
} /* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Sandwich()
*///:~
