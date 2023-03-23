package one.digitalinnovation;

public class Queue {
	private Node entryNodeRef;
	
	public Queue() {
		this.entryNodeRef = null;
	}
	
	public void enqueue(Node newNode) {
		newNode.setNodeRef(entryNodeRef);
		entryNodeRef = newNode;
	}
	
	public Node first() {
		if (!this.isEmpty()) {
			Node firstNode = entryNodeRef;
			
			while (true) {
				if (firstNode.getNodeRef() != null) {
					firstNode = firstNode.getNodeRef();
				} else {
					break;
				}
			}
		}
		return null;
	}
	
	public Node dequeue() {
		if (!this.isEmpty()) {
			Node firstNode = entryNodeRef;
			Node auxNode = entryNodeRef;
			
			while (true) {
				if (firstNode.getNodeRef() != null) {
					auxNode = firstNode;
					firstNode = firstNode.getNodeRef();
				} else {
					auxNode.setNodeRef(null);
					break;
				}
			}
			return firstNode;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return entryNodeRef == null ? true : false;
	}

	@Override
	public String toString() {
		String returnString = "";
		Node auxNode = entryNodeRef;
		
		if (entryNodeRef != null) {
			while (true) {
				returnString += "[Node{object=" + auxNode.getObject() + "}] --->";
				
				if (auxNode.getNodeRef() != null) {
					auxNode = auxNode.getNodeRef();
				} else {
					returnString += null;
					break;
				}
			}
		} else {
			returnString = null;
		}
		
		return returnString;
	}
} 