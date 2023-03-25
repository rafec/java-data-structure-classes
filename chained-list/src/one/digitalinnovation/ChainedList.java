package one.digitalinnovation;

import java.util.Iterator;

public class ChainedList<T> {
	Node<T> entryReference;
	
	public ChainedList() {
		this.entryReference = null;
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<>(content);
		
		if (this.isEmpty()) {
			entryReference = newNode;
			return;
		}
		
		Node<T> auxNode = entryReference;
		for(int i = 0; i < this.size()-1; i++) {
			auxNode = auxNode.getNextNode();
		}
		
		auxNode.setNextNode(newNode);
	}
	
	public int size() {
		int listLength = 0;
		
		Node<T> auxReference = entryReference;
		while (true) {
			if (auxReference != null) {
				listLength++;
				if (auxReference.getNextNode() != null) {
					auxReference = auxReference.getNextNode();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		return listLength;
	}
	
	public boolean isEmpty() {
		return entryReference == null ? true : false;
	}
}
