package one.digitalinnovation;

public class Node {
	private Object object;
	private Node nodeRef;
	
	Node() {
	}
	
	Node(Object object) {
		this.nodeRef = null;
		this.object = object;
	}
}
