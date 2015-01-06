//: interfaces/music5/Music5.java
// Interfaces.
package interfaces.music5;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;

interface Playable {
	void play (Note n);	
}

abstract class Instrument {
  // Compile-time constant:
  static final int VALUE = 5;
  public void adjust() { print(this + ".adjust()"); }
  abstract public String toString();
}

class Wind extends Instrument implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Wind"; }
}

class Percussion extends Instrument implements Playable {
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Percussion"; }
}

class Stringed extends Instrument implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Stringed"; }
}

class Brass extends Wind implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Brass"; }
}	

class Woodwind extends Wind implements Playable{
  public void play(Note n) {
    print(this + ".play() " + n);
  }
  public String toString() { return "Woodwind"; }
}

public class Music5 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  static void tune(Playable p) {
    // ...
    p.play(Note.MIDDLE_C);
  }
  static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune((Playable)i);
  }	
  public static void main(String[] args) {
    // Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };
    tuneAll(orchestra);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
