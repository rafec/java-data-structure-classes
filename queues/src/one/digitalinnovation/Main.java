package one.digitalinnovation;

public class Main {
 public static void main(String[] args) {
	Queue<String> myQueue = new Queue<>();
	
	myQueue.enqueue("First");
	myQueue.enqueue("Second");
	myQueue.enqueue("Third");
	myQueue.enqueue("Fourth");
	
	System.out.println(myQueue);
	
	System.out.println(myQueue.dequeue());
	
	System.out.println(myQueue);
	
	myQueue.enqueue("Last");
	
	System.out.println(myQueue);
	
	System.out.println(myQueue.first());
	
	System.out.println(myQueue);
}
}
