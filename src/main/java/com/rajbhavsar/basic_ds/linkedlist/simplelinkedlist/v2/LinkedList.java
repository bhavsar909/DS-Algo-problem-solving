package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v2;

public class LinkedList
{
	private Node head;
	private Node lastNode;

	public Node getFirst(){
		return head;
	}
	public Node getLast(){
		return lastNode;
	}

	public void printAllElements()
	{
		Node currentNode = head;
		while (currentNode.hasNext())
		{
			System.out.print(currentNode.getData() + "->");
			currentNode = currentNode.getNextNode();
		}
		System.out.println(currentNode.getData());
	}

	public void addElement(int data){
		Node newNode = new Node(data,null);
		if (head == null){
			head = newNode;
			lastNode = newNode;
		}
		else {
			lastNode.setNextNode(newNode);
			lastNode = lastNode.getNextNode();
		}
	}

	public void addElementAtIndex(int data, int index)
	{
		Node newNode = new Node(data, null);
		if (index == 0)
		{
			newNode.setNextNode(head);
			head = newNode;
		} else if (index == this.size() - 1 || index >= this.size())
		{
			lastNode.setNextNode(newNode);
			lastNode = lastNode.getNextNode();
		} else
		{
			int count = 0;
			Node currentNode = head;
			Node temp;
			while (currentNode.hasNext())
			{
				count++;
				if (count == index)
				{
					temp = currentNode.getNextNode();
					currentNode.setNextNode(newNode);
					newNode.setNextNode(temp);
				}
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public int size()
	{
		int count = 0;
		Node currentNode = head;
		while (currentNode.hasNext())
		{
			count++;
			currentNode = currentNode.getNextNode();
		}
		//+1 for 0th node because we have started with this means current object with 0.
		return count + 1;
	}
}
