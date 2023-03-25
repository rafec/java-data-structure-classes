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
	
	private Node<T> getNode(int index) {
		indexValidate(index);
		
		Node<T> auxNode = entryReference;
		Node<T> returnNode = null;
		
		for(int i = 0; i < this.size()-1; i++) {
			returnNode = auxNode;
			auxNode = auxNode.getNextNode();
		}
		return returnNode;
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
	
	private void indexValidate(int index) {
		if (index >= size()) {
			int lastIndex = size()-1;
			throw new IndexOutOfBoundsException("There is no content in index " + " of this list! This list only goes up to index " + lastIndex + ".");
		}
	}
	
	public boolean isEmpty() {
		return entryReference == null ? true : false;
	}
}
