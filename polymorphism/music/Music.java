//: polymorphism/music/Music.java
// Inheritance & upcasting.
package net.gusto.tij.polymorphism.music;

public class Music {
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void prepare(Instrument i) {
    // ...
    i.prepare();
  }
  public static void main(String[] args) {
    Wind flute = new Wind();
    prepare(flute);
    tune(flute); // Upcasting
    tune(flute); // Upcasting
    
  }
} /* Output:
Wind.play() MIDDLE_C
*///:~
