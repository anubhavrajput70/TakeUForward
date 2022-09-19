package graph;

import java.util.*;
public class CycleDetectionUsingBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,1,2);
		addEdge(adj,2,4);
		addEdge(adj,3,5);
		addEdge(adj,5,6);
		addEdge(adj,6,7);
		addEdge(adj,7,8);
		addEdge(adj,8,9);
		addEdge(adj,9,10);
		addEdge(adj,5,10);
		addEdge(adj,8,11);
		System.out.println(isCycle(n,adj));
	}
	public static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
	{
		boolean vis[] =new boolean[v+1];
		Arrays.fill(vis,false);
		for(int i=1;i<=v;i++)
		{
			if(!vis[i])
			{
				if(isCyclePresent(i,adj,vis))
					return true;
			}
		} 
	return false;
	}
	static boolean isCyclePresent(int v,ArrayList<ArrayList<Integer>> adj,boolean vis[])
	{
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(v,-1));
		vis[v]=true;
		while(!q.isEmpty())
		{
			int node=q.peek().first;
			int par=q.peek().second;
			q.remove();
			for(Integer it: adj.get(node))
			{
				if(!vis[it])
				{
					q.add(new Node(it,node));
					vis[it]=true;
				}
				else if(par!=it)
					return true;
			}
		}
		
		
		return false;
	}
	 static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
		    am.get(s).add(d);
		    am.get(d).add(s);
		  }
	static class Node
	 {
	 	int first;
	 	int second;
	 	public Node(int first, int second) {
	 		this.first = first;
	 		this.second = second;
	 	}
	 	
	 }
}
