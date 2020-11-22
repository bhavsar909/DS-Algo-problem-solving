package com.rajbhavsar.basic_ds.graph.dfs.v2;

import java.util.LinkedList;

public class DFSGraph
{
	private int V;
	private LinkedList<Integer>[] adj;

	private DFSGraph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList<>();
	}

	public static void main(String[] args)
	{
		DFSGraph g = new DFSGraph(10);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 4);
		g.addEdge(2, 3);
		g.addEdge(4, 5);
		g.addEdge(3, 7);
		g.addEdge(5, 6);
		g.addEdge(7, 8);
		g.addEdge(8, 9);
		g.addEdge(6, 9);
		g.addEdge(7, 9);

		System.out.println("Depth First Traversal:");
		g.dfs();
	}

	private void addEdge(int v, int w)
	{
		adj[v].add(w);    // Add w to v's list.
	}

	private void dfsRecursive(int v, boolean[] visited)
	{
		visited[v] = true;
		System.out.print(v + " ");
		for (final int n : adj[v])
		{
			if (!visited[n])
				dfsRecursive(n, visited);
		}
	}

	private void dfs()
	{
		boolean[] visited = new boolean[V];
		for (int i = 0; i < V; ++i)
			if (!visited[i])
				dfsRecursive(i, visited);
	}
}
