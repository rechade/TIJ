//: polymorphism/music/Instrument.java
package net.gusto.tij.polymorphism.music;
import static net.mindview.util.Print.*;

class Instrument {
  public void play(Note n) {
    print("Instrument.play()");
  }
  public void prepare() {
    print("Instrument.prepare()");
  }
}
 ///:~
