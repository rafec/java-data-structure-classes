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

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNodeRef() {
		return nodeRef;
	}

	public void setNodeRef(Node nodeRef) {
		this.nodeRef = nodeRef;
	}

	@Override
	public String toString() {
		return "Node [object=" + object + "]";
	}
	
	
	
}
