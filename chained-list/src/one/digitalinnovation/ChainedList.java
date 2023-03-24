package one.digitalinnovation;

public class ChainedList<T> {
	Node<T> entryReference;
	
	public ChainedList() {
		this.entryReference = null;
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
