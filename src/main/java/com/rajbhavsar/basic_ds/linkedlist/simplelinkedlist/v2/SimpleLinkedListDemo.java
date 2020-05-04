package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v2;

public class SimpleLinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList linkedList =  new LinkedList();
		linkedList.addElement(1);
		linkedList.addElement(2);
		linkedList.addElement(3);
		linkedList.addElement(4);
		System.out.println(linkedList.size());
		linkedList.printAllElements();

		linkedList.addElementAtIndex(5,2);
		linkedList.printAllElements();

		System.out.println("First element: "+ linkedList.getFirst());
		System.out.println("Last element: "+ linkedList.getLast());
	}
}
