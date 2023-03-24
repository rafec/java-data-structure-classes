package one.digitalinnovation;

public class Node<T> {
	private T content;
	private Node nextNode;
	
	public Node() {
		this.nextNode = null;
	}
	
	public Node(T content) {
		this.nextNode = null;
		this.content = content;
	}

	public Node(T content, Node nextNode) {
		super();
		this.content = content;
		this.nextNode = nextNode;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]";
	}
	
	public String toStringChained() {
		String str = "Node [content=" + content + "]";
		
		if (nextNode != null) {
			str += "->" + nextNode.toString();
		} else {
			str += "->null";
		}
		
		return str;
	}
}
