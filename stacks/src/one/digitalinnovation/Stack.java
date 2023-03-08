package one.digitalinnovation;

public class Stack {
	private Node nodeRefStackEntry;

	public Stack() {
		this.nodeRefStackEntry = null;
	}
	
	public void push(Node newNode) {
		Node auxiliaryRef = nodeRefStackEntry;
		nodeRefStackEntry = newNode;
		nodeRefStackEntry.setNodeRef(auxiliaryRef);
	}
	
	public Node pop() {
		if(!this.isEmpty()) {
			Node poppedNode = nodeRefStackEntry;
			nodeRefStackEntry = nodeRefStackEntry.getNodeRef();
		}
		return null;
	}
	
	public Node top() {
		return nodeRefStackEntry;
	}
	
	public boolean isEmpty() {
		return nodeRefStackEntry == null ? true : false;
	}
	
	
}
