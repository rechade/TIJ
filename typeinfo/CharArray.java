// TIJ typeinfo ex10 p399
package net.gusto.tij.typeinfo;
import java.util.*;
class CharArray {
	static char[] chArray = new char[]{'a','b'};
	public static void main (String[] args) {
		Integer i = 22;
		System.out.println(RecursiveHierarchy.getHierarchy(i));
	}
}