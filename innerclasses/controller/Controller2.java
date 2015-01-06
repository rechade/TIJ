// TIJ holding ex13 p290, modifying
//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
package innerclasses.controller;
import java.util.*;


public class Controller2 {
	// A class from java.util to hold Event objects:
	private LinkedList<Event> eventList = new LinkedList<Event>();
	public void addEvent(Event c) { eventList.add(c); }
	public void run() {
		Event e;
		LinkedList<Event> copiedList;
		while(eventList.size() > 0) {
			// Make a copy so you're not modifying the list
			// while you're selecting the elements in it:
			copiedList = new LinkedList(eventList);
			ListIterator<Event> it = copiedList.listIterator();
			while(it.hasNext()) {
				e=it.next();
				if (e.ready()) {
					System.out.println(e);
					e.action();		
					it.remove();	
				}
			}
		}
	}
} ///:~




/*
public class Controller2 {
	// A class from java.util to hold Event objects:
	private LinkedList<Event> eventList = new LinkedList<Event>();
	private ListIterator<Event> it = eventList.listIterator();
	public void addEvent(Event c) { it.add(c); }
	public void run() {
		// Use a ListIterator so you're able to modify the list
		// while you're iterating through it: ?? doesn't work
		// because e.action can also modify the eventList?
		// ListIterator<Event> it = eventList.listIterator();
		Event e;
		while(eventList.size() > 0) {
			it = eventList.listIterator();
			while(it.hasNext()) {
				e=it.next();
				if (e.ready()) {
					// this version works but it.remove() used to be after e.action()
					// so could have had some nasty effects. 
					it.remove();
					System.out.println(e);
					e.action();			
				}
			}
		}
	}
} ///:~
*/