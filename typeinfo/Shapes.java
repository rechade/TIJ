//: typeinfo/Shapes.java
package net.gusto.tij.typeinfo;
import java.util.*;
import java.io.*;

abstract class Shape {	
	static boolean highlight = false;
	abstract void toggleHighlight ();	
	void draw() { System.out.println(this + ".draw()"); }	
	abstract public String toString();	
	static void rotate(Shape shape) {
		if (!(shape instanceof Circle)) {  		
			System.out.println("rotating " + shape);
		}
	}
}

class Circle extends Shape {	
	static boolean highlight = false;
	void toggleHighlight () {	
		highlight = !highlight;
	}
	public String toString() { return ((highlight? "*" : "" ) + "Circle"); }
}

class Square extends Shape {	
	static boolean highlight = false;
	void toggleHighlight () {
		highlight = !highlight;	
	}	
	public String toString() { return ((highlight? "*" : "" ) + "Square"); }
}

class Rhomboid extends Shape {	
	static boolean highlight = false;
	void toggleHighlight () {
		highlight = !highlight;	
	}	
	public String toString() { return ((highlight? "*" : "" ) + "Rhomboid"); }
}

class Triangle extends Shape {	
	static boolean highlight = false;
	void toggleHighlight () {
		highlight = !highlight;	
	}	
	public String toString() { return ((highlight? "*" : "" ) + "Triangle"); }
}	

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(
			new Circle(), new Square(), new Triangle(), new Rhomboid()
		);
		for(Shape shape : shapeList) {
			shape.draw();
			Shape.rotate(shape);
		}
		Rhomboid rhomboid1 = new Rhomboid();
		Shape shape1 = rhomboid1;
		if (shape1 instanceof Circle) {
		  //!Circle circle1 = rhomboid1;
		} else {
		  System.out.println("can't cast rhomboid1 to Circle");
		}		
		Scanner scanner = new Scanner(System.in);
		System.out.format("Toggle highlights. Enter 1-%d or 0 to stop:",shapeList.size()+1);
		int j = scanner.nextInt();
		while (j!=0) {		
			shapeList.get(j-1).toggleHighlight();
			for(Shape shape : shapeList) {			
				shape.draw();
			}
			System.out.format("Toggle highlights. Enter 1-%d or 0 to stop:",shapeList.size()+1);
			j = scanner.nextInt();
		}
	}
} 