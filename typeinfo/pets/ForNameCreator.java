//: typeinfo/pets/ForNameCreator.java
package net.gusto.tij.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "net.gusto.tij.typeinfo.pets.Mutt",
    "net.gusto.tij.typeinfo.pets.Pug",
    "net.gusto.tij.typeinfo.pets.EgyptianMau",
    "net.gusto.tij.typeinfo.pets.Manx",
    "net.gusto.tij.typeinfo.pets.Cymric",
    "net.gusto.tij.typeinfo.pets.Rat",
    "net.gusto.tij.typeinfo.pets.Mouse",
    "net.gusto.tij.typeinfo.pets.Hamster",
    "net.gusto.tij.typeinfo.pets.Gerbil"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
