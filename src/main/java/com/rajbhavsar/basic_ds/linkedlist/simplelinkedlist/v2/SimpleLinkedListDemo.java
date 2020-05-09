package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v2;

public class SimpleLinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.addElement(1);
		linkedList.addElement(2);
		linkedList.addElement(3);
		linkedList.addElement(4);

		System.out.println("Size: "+linkedList.size());

		linkedList.printAllElements();

		System.out.println("First element: " + linkedList.getFirst());
		System.out.println("Last element: " + linkedList.getLast());

		System.out.println("Inserted element at index 2: ");
		linkedList.addElementAtIndex(5, 2);
		linkedList.printAllElements();

		System.out.println("Inserted element at index 0: ");
		linkedList.addElementAtIndex(6,0);
		linkedList.printAllElements();

		System.out.println("Inserted element at last: ");
		linkedList.addElement(7);
		linkedList.printAllElements();

		System.out.println("Deleted element from last :" +linkedList.deleteLastElement());
		linkedList.printAllElements();

		System.out.println("Deleted element at index 0: "+linkedList.deleteElementAtIndex(0));
		linkedList.printAllElements();

		System.out.println("Deleted element at index 2: "+linkedList.deleteElementAtIndex(2));
		linkedList.printAllElements();

		System.out.println("Reverse of Linked list:");
		linkedList.reverseLinkedList();
		linkedList.printAllElements();

	}
}
