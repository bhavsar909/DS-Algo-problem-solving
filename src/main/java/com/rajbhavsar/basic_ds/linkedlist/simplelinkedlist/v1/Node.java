package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v1;

public class Node
{
	private int data;
	private Node nextNode;

	public Node()
	{
	}

	public Node(final int data, final Node nextNode)
	{
		this.data = data;
		this.nextNode = nextNode;
	}

	public void printAllElements()
	{
		Node currentNode = this;
		while (currentNode.hasNext())
		{
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.print(currentNode.data + "\n");
	}

	public boolean hasNext()
	{
		return this.nextNode != null;
	}

	public Node getFirst()
	{
		return this;
	}

	public Node getLast()
	{
		Node currentNode = this;
		while (currentNode.hasNext())
		{
			currentNode = currentNode.nextNode;
		}
		return currentNode;
	}

	public int size()
	{
		Node currentNode = this;
		int count = 0;
		while (currentNode.hasNext())
		{
			count++;
			currentNode = currentNode.nextNode;
		}
		//+1 for 0th node because we have started with this means current object with 0.
		return count + 1;
	}

	public Node addElementAtIndex(int data, int index)
	{
		Node currentNode = this;
		Node newNode = new Node(data, null);
		if (index == 0)
		{
			newNode.setNextNode(currentNode);
			return newNode;
		} else if (index == this.size() - 1 || index >= this.size())
		{
			this.getLast().setNextNode(newNode);
			return this;
		} else
		{
			int count = 0;
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
				currentNode = currentNode.nextNode;
			}
			return this;
		}
	}

	public int getData()
	{
		return data;
	}

	public void setData(final int data)
	{
		this.data = data;
	}

	public Node getNextNode()
	{
		return nextNode;
	}

	public void setNextNode(final Node nextNode)
	{
		this.nextNode = nextNode;
	}

	@Override
	public String toString()
	{
		return "Node{" +
				"data=" + data +
				", nextNode=" + nextNode +
				'}';
	}
}
