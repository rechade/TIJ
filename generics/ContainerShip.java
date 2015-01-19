// TIJ generics ex19 p462
package net.gusto.tij.generics;
import net.mindview.util.*;
import java.util.*;

class Product {	
	private static long counter=0;
	public final long id;
	private Product() {
		id=counter++;
	}
	static Generator<Product> generator = new Generator<Product>() {
			public Product next() { return new Product();}
		};	
	public String toString() {
		return("Product " + id);
	}
}
class Container extends ArrayList<Product>{
	final int MAX_PRODUCTS_PER_CONTAINER=3;
	private static long counter=0;
	public final long id;
	Container() {
		Generators.fill(this, Product.generator, MAX_PRODUCTS_PER_CONTAINER);
		id=counter++;
	}	
	static Generator<Container> generator = new Generator<Container>() {
			public Container next() { return new Container();}
		};	
	public String toString() {
		String result = ("Container " + id);
		for (Product p : this) {
			result += "\n" + p;
		}
		return result;
	}
}

class Deck extends ArrayList<Container>{
	final int MAX_CONTAINERS_PER_DECK=4;
	private static long counter=0;
	public final long id;
	Deck() {
		Generators.fill(this, Container.generator, MAX_CONTAINERS_PER_DECK);
		id=counter++;
	}	
	static Generator<Deck> generator = new Generator<Deck>() {
			public Deck next() { return new Deck();}
		};	
	public String toString() {
		String result = "Deck " + id;
		for (Container c : this) {
			result += "\n" + c;
		}
		return result;
	}
}
class ContainerShip extends ArrayList<Deck>{
	final int numDecks;
	final String name;
	ContainerShip(String name, int numDecks){ 
		this.name=name;
		this.numDecks=numDecks;
		Generators.fill(this, Deck.generator, numDecks); 
	}
	public String toString() {
		String result = "Ship " + name;
		for (Deck d : this) {
			result += "\n" + d;
		}
		return result;
	}
}
class Trade {
	public static void main (String[] args) {
		ContainerShip cs = new ContainerShip("NellyII",2);
		System.out.println(cs);
	}
}

