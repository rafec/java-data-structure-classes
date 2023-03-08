package com.nodeproject;

public class Main {
	public static void main(String[] args) {
		Node<String> node1 = new Node<>("node1 content");
		Node<String> node2 = new Node<>("node2 content");
		node1.setNextNode(node2);
		
		Node<String> node3 = new Node<>("node3 content");
		node2.setNextNode(node3);
		
		Node<String> node4 = new Node<>("node4 content");
		node3.setNextNode(node4);
		
		//node1->node2->node3->node4->null
		
		System.out.println(node1);
		System.out.println(node1.getNextNode());
		System.out.println(node1.getNextNode().getNextNode());
		System.out.println(node1.getNextNode().getNextNode().getNextNode());
		System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());
	}
}
