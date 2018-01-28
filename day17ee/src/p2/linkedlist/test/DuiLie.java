package p2.linkedlist.test;

import java.util.LinkedList;


public class DuiLie {
	
	private LinkedList link;
	
	public DuiLie() {
		link = new LinkedList();
	}
	
	public void myAdd(Object obj) {
		link.addLast(obj);
	}

	public Object myGet() {
		return link.removeFirst();
	}

	public boolean isNull() {
		return link.isEmpty();
	}
	
}
