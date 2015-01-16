//: polymorphism/music/Wind.java
package net.gusto.tij.polymorphism.music;

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
  // Redefine interface method:
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }
  public void clearSpitValve() {
  	  System.out.println("Wind.clearSpitValve()");
  }
  public void prepare() {
  	super.prepare();
    System.out.println("Wind.prepare()");
    clearSpitValve();
  }
} ///:~
