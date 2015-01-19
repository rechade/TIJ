// TIJ generics ex13 p453
//: generics/Generators.java
// A utility to use with Generators.
package net.gusto.tij.generics;
import net.gusto.tij.generics.coffee.*;
import java.util.*;
import net.mindview.util.*;

public class Generators {
	public static <T> ArrayList<T>	fill(ArrayList<T> coll, Generator<T> gen, int n) {
		System.out.println("\nArrayList<T>");
		for(int i = 0; i < n; i++)
			coll.add(gen.next());			
		return coll;
	}	
	public static <T> List<T>	fill(List<T> coll, Generator<T> gen, int n) {
		System.out.println("\nList<T>");
		for(int i = 0; i < n; i++)
			coll.add(gen.next());			
		return coll;
	}	
	public static <T> LinkedList<T>	fill(LinkedList<T> coll, Generator<T> gen, int n) {
		System.out.println("\nLinkedList<T>");
		for(int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}	
	public static <T> Queue<T>	fill(Queue<T> coll, Generator<T> gen, int n) {
		System.out.println("\nQueue<T>");
		for(int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}	
	public static <T> Set<T>	fill(Set<T> coll, Generator<T> gen, int n) {
		System.out.println("\nSet<T>");
		for(int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}	
	public static void main(String[] args) {
		ArrayList<Integer> fnumbers = fill(
			new ArrayList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
		LinkedList<Integer> fnumbers2 = fill(
			new LinkedList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
		Queue<Integer> fnumbers3 = fill(
			(Queue<Integer>) new LinkedList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
	}
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
*///:~
