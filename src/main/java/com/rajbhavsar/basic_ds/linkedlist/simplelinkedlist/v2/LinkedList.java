package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v2;

public class LinkedList
{
	private Node head;
	private Node lastNode;

	public Node getFirst()
	{
		return head;
	}

	public Node getLast()
	{
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

	public void addElement(int data)
	{
		Node newNode = new Node(data, null);
		if (head == null)
		{
			head = newNode;
			lastNode = newNode;
		} else
		{
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

	public Node deleteLastElement()
	{
		Node currentNode = head;
		Node temp;
		if (!currentNode.hasNext())
		{
			temp = head;
			head = null;
			lastNode = null;
			return temp;
		} else
		{
			while (currentNode.getNextNode() != lastNode)
			{
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(null);
			temp = lastNode;
			lastNode = currentNode;
			return temp;
		}
	}

	public Node deleteElementAtIndex(int index)
	{
		Node currentNode = head;
		Node temp;
		if (index == 0)
		{
			temp = head;
			head = head.getNextNode();
			temp.setNextNode(null);
			return temp;
		} else if (index == this.size() - 1 || index >= this.size())
		{
			return this.deleteLastElement();
		} else
		{
			int count = 0;
			while (currentNode.hasNext())
			{
				count++;
				if (count == index)
				{
					temp = currentNode.getNextNode();
					currentNode.setNextNode(temp.getNextNode());
					temp.setNextNode(null);
					return temp;
				}
				currentNode = currentNode.getNextNode();
			}
		}
		return null;
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

	public void reverseLinkedList(){
		Node t1= head;
		Node t2= head.getNextNode();
		Node x;
		t1.setNextNode(null);
		while (t2.hasNext()){
			x= t2.getNextNode();
			t2.setNextNode(t1);
			t1=t2;
			t2=x;
		}
		t2.setNextNode(t1);
		lastNode=head;
		head=t2;
	}
}
