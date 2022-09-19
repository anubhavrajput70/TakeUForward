package graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrimsAlgoOptimizedSolution {

	static class Node implements Comparator<Node>
	{
		private int v;
		private int weight;
		Node(int _v,int _w)
		{
			v=_v;
			weight=_w;
		}
		Node()
		{}
		int getV()
		{
			return v;
		}
		int getWeight()
		{
			return weight;
		}
		@Override
		public int compare(Node node1,Node node2)
		{
			if(node1.weight<node2.weight)
				return -1;
			if(node1.weight>node2.weight)
				return 1;
			return 0;
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
	int key[]=new int[n];
	boolean mstSet[]=new boolean[n];
	int parent[]=new int[n];
	for(int i=0;i<n;i++)
	{
		key[i]=100000000;
		mstSet[i]=false;
		parent[i]=-1;
	}
	PriorityQueue<Node> pq=new PriorityQueue<Node>(n,new Node());
	key[0]=0;
	pq.add(new Node(0,key[0]));
	for(int i=0;i<n-1;i++)
	  {
		int u=pq.poll().getV();
		mstSet[u]=true;
		for(Node it: adj.get(u))
		{
			if(mstSet[it.getV()]==false&&it.getWeight()<key[it.getV()])
			{
				parent[it.getV()]=u;
				key[it.getV()]=it.getWeight();
				pq.add(new Node(it.getV(),key[it.getV()]));
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
