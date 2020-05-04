package com.rajbhavsar.basic_ds.linkedlist.simplelinkedlist.v2;

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

	public boolean hasNext(){
		return this.nextNode != null;
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
