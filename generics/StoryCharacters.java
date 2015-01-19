// TIJ generics ex8 p449
package net.gusto.tij.generics;
import net.mindview.util.*;
import java.lang.reflect.*;
import java.util.*;

class GoodGuys extends StoryCharacters{}
class BadGuys extends StoryCharacters{}
class Hero extends GoodGuys{}
class Villain extends BadGuys{}
class ChickyBabe extends GoodGuys{}
class HenchMan extends BadGuys{}

class StoryCharacters implements Generator<StoryCharacters> {
	private Class[] types = {Hero.class,Villain.class,ChickyBabe.class,HenchMan.class};	
	private Random rand = new Random(47);
	public StoryCharacters next() {
		StoryCharacters sc = null;
		try {
			sc = (StoryCharacters)(types[rand.nextInt(types.length)]).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sc;
	}
	public String toString() {
		return(this.getClass().getSimpleName());
	}
	public static void main (String[] args) {
		StoryCharacters sc = new StoryCharacters();
		for (int i=0; i<10; i++) {
			System.out.println(sc.next());
		}
	}
}