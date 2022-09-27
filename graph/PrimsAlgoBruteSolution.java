package graph;

import java.util.ArrayList;

public class PrimsAlgoBruteSolution {
 static class Node
	{
		private int v;
		private int weight;
		public Node(int v, int weight)
		{
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<ArrayList<Node>> adj=new ArrayList<ArrayList<Node>>();
		for(int i=0;i<n;i++)
		adj.add(new ArrayList<Node>());
		addEdge(adj,0,1,2);
		addEdge(adj,1,2,3);
		addEdge(adj,2,4,7);
		addEdge(adj,0,3,6);
		addEdge(adj,1,4,5);
		addEdge(adj,1,3,8);
		primsAlgo(adj,n);	
	}
	static void primsAlgo(ArrayList<ArrayList<Node>> adj,int n)
	{
	int key[]	=new int[n];
	boolean mstSet[]	=new boolean[n];
	int parent[]	=new int[n];
	for(int i=0;i<n;i++)
	{
		key[i]=100000000;
		mstSet[i]=false;
		parent[i]=-1;
	}
	key[0]=0;
	//iterating to i-1 because a graph with n vertex has n-1 edges
	for(int i=0;i<n-1;i++)
	{
		int min=100000000,u=0;
		for(int j=0;j<n;j++)
		{
			if(mstSet[j]==false&&key[j]<min)
			{
				min=key[j];
				u=j;
			}
		}
		mstSet[u]=true;
		for(Node it: adj.get(u))
		{
			if(mstSet[it.getV()]==false&&it.getWeight()<key[it.getV()])
			{
				parent[it.getV()]=u;
				key[it.getV()]=it.getWeight();
				
			}
		}
	}
	for(int i=1;i<n;i++)
		System.out.println(parent[i]+" - "+i);
	}
	static void addEdge(ArrayList<ArrayList<Node>> am, int s, int d,int w) {
	    am.get(s).add(new Node(d,w));
	    am.get(d).add(new Node(s,w));
	  }
}
