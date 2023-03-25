package one.digitalinnovation;

public class Main {
	public static void main(String[] args) {
		ChainedList<String> myChainedList = new ChainedList<>();
		 
		myChainedList.add("test1");
		myChainedList.add("test2");
		myChainedList.add("test3");
		myChainedList.add("test4");
		
		System.out.println(myChainedList.get(0));
		System.out.println(myChainedList.get(1));
		System.out.println(myChainedList.get(2));
		System.out.println(myChainedList.get(3));

		System.out.println(myChainedList);

		System.out.println(myChainedList.remove(3));

		System.out.println(myChainedList);
	}
}
