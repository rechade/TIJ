//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
import polymorphism.music.Note;
import static net.mindview.util.Print.*;
import java.util.Random;

class InstrumentGenerator {
	static final int NUM_INSTRUMENTS = 7;
	static Random rand = new Random(47);
	static Instrument next() {
		switch (rand.nextInt(NUM_INSTRUMENTS)) {
			case 0: return new Instrument();
			case 1: return new Wind();
			case 2: return new Percussion();
			case 3: return new Stringed();
			case 4: return new Brass();
			case 5: return new Woodwind();
			case 6: default: return new Clarinet();
		}
	}
}

class Instrument {
  void play(Note n) { print("Instrument.play() " + n); }
  public String toString() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  public String toString() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  public String toString() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  public String toString() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  public String toString() { return "Woodwind"; }
}

class Clarinet extends Woodwind {
  void play(Note n) { print("Clarinet.play() " + n); }
  public String toString() { return "Clarinet"; }
}	

public class Music3 { 
  // Doesn't care about type, so new types
  // added to the system still work right:
  final static int MAX_INSTRUMENTS = 18;
  
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }	
  
  public static void main(String[] args) {
  	  Instrument[] orchestra = new Instrument[MAX_INSTRUMENTS];
  	  for (int i=0; i<MAX_INSTRUMENTS; i++) {
  	  	  orchestra[i] = InstrumentGenerator.next();
  	  }    
    for (Instrument i: orchestra) {
    	System.out.println(i);
    }
    tuneAll(orchestra);
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
