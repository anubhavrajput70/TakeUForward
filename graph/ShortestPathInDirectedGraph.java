package graph;

import java.util.*;

class Pair
{
	private int v;
	private int weight;
	
	public Pair(int v, int weight) {
		this.v = v;
		this.weight = weight;
	}
	public int getV() {
		return v;
	}
	public int getWeight() {
		return weight;
	}
}
public class ShortestPathInDirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();
		for(int i=0;i<n;i++)
		adj.add(new ArrayList<Pair>());
		addEdge(adj,0,1,2);
		addEdge(adj,1,2,3);
		addEdge(adj,2,3,6);
		addEdge(adj,0,4,1);
		addEdge(adj,4,2,2);
		addEdge(adj,4,5,4);
		addEdge(adj,5,3,1);
		//for printing adjacency list
//		for(int i=0;i<n;i++)
//		{	
//			System.out.print(i+"--");
//			for(int j=0;j<adj.get(i).size();j++)
//			{
//				System.out.print("("+adj.get(i).get(j).getV()+" "+adj.get(i).get(j).getWeight()+"),");
//			}
//			System.out.println();
//		}
		ShortestPathInDirectedGraph obj=new ShortestPathInDirectedGraph();
		obj.shortestPath(0,adj,n);
	}
	void shortestPath(int src,ArrayList<ArrayList<Pair>> adj,int n)
	{
		Stack stack=new Stack();
		int dist[]=new int[n];
		Boolean vis[]=new Boolean[n];
		for(int i=0;i<n;i++)
		{
			vis[i]=false;
		}
		for(int i=0;i<n;i++)
		{
			if(!vis[i])
			{
				topoSort(i,vis,stack, adj);
			}
		}
		for(int i=0;i<n;i++)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		while(stack.empty()==false)
		{
			int node=(int)stack.pop();
			if(dist[node]!=Integer.MAX_VALUE)
			{
				for(Pair it:adj.get(node))
				{
					if(dist[node]+it.getWeight()<dist[it.getV()])
					{
						dist[it.getV()]=dist[node]+it.getWeight();
					}
				}
			}
		}
		for(int i=0;i<n;i++)
			{
			if(dist[i]==Integer.MAX_VALUE)
				System.out.print("inf ");
			else
				System.out.print(dist[i]+" ");
			
			}
	}
	void topoSort(int node,Boolean vis[],Stack stack,ArrayList<ArrayList<Pair>> adj)
	{
		vis[node]=true;
		for(Pair it:adj.get(node))
		{
			if(!vis[it.getV()])
			{
				topoSort(it.getV(),vis,stack,adj);
			}
		}
		stack.add(node);
	}
	static void addEdge(ArrayList<ArrayList<Pair>> am, int s, int d,int w) {
	    am.get(s).add(new Pair(d,w));
	   
	  }
}
