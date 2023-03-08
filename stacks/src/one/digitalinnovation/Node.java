package one.digitalinnovation;

public class Node {
	private Integer data;
	private Node nodeRef;
	
	public Node() {
	}

	public Node(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getNodeRef() {
		return nodeRef;
	}

	public void setNodeRef(Node nodeRef) {
		this.nodeRef = nodeRef;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
}
