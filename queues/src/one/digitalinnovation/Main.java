package one.digitalinnovation;

public class Main {
 public static void main(String[] args) {
	Queue myQueue = new Queue();
	
	myQueue.enqueue(new Node("First"));
	myQueue.enqueue(new Node("Second"));
	myQueue.enqueue(new Node("Third"));
	myQueue.enqueue(new Node("Fourth"));
	
	System.out.println(myQueue);
	
	System.out.println(myQueue.dequeue());
	
	System.out.println(myQueue);
	
	myQueue.enqueue(new Node("Last"));
	
	System.out.println(myQueue);
	
	System.out.println(myQueue.first());
	
	System.out.println(myQueue);
}
}
