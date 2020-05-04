package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v1;

public class SimpleLinkedListDemo
{
	public static void main(String[] args)
	{
		Node node5 = new Node(5, null);
		Node node4 = new Node(4, node5);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);

		System.out.println("First Node:" + node1.getFirst());

		System.out.println("Last Node:" + node1.getLast());

		node1.printAllElements();

		System.out.println("Size: " + node1.size());

		System.out.println("Adding an element at First");
		node1 = node1.addElementAtIndex(6, 0);

		node1.printAllElements();

		System.out.println("Adding an element at "+ 7);
		node1.addElementAtIndex(7,2);

		node1.printAllElements();

	}
}
