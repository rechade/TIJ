// TIJ interfaces, ex.12 p231
//: interfaces/Adventure.java
// Multiple interfaces.
package interfaces;
interface CanClimb {
  void climb();
}

interface CanFight {
  void fight();
}

interface CanSwim {
  void swim();
}

interface CanFly {
  void fly();
}

class ActionCharacter {
  public void fight() {}
}	

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly, CanClimb {
  public void climb() {}
  public void swim() {}
  public void fly() {}
}

public class Adventure {
  
  public static void c(CanClimb x) { x.climb(); }
  
  // java won't compile line below. The method signature is unique
  // but the object implements multiple interfaces so java doesn't 
  // know which one to use
  
  //! public static void c(CanFight x) { x.fight(); }
  
  public static void t(CanFight x) { x.fight(); }      
  public static void u(CanSwim x) { x.swim(); }
  public static void v(CanFly x) { x.fly(); }
  public static void w(ActionCharacter x) { x.fight(); }
  public static void main(String[] args) {
    Hero h = new Hero();
    c(h); // Treat it as a CanClimb
    t(h); // Treat it as a CanFight
    u(h); // Treat it as a CanSwim
    v(h); // Treat it as a CanFly
    w(h); // Treat it as an ActionCharacter
  }
} ///:~
