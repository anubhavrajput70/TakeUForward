package graph;

import java.util.*;
class Node implements Comparator<Node>
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

public class DijkstraAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<ArrayList<Node>> adj=new ArrayList<ArrayList<Node>>();
		for(int i=0;i<=n;i++)
		adj.add(new ArrayList<Node>());
		addEdge(adj,1,2,2);
		addEdge(adj,1,4,2);
		addEdge(adj,4,3,3);
		addEdge(adj,3,5,1);
		addEdge(adj,2,5,5);
		addEdge(adj,2,3,4);
		int src=1;
		dijkstra(src,adj,n);
		//for printing adjacency list
//		for(int i=0;i<=n;i++)
//		{	
//			System.out.print(i+"--");
//			for(int j=0;j<adj.get(i).size();j++)
//			{
//				System.out.print("("+adj.get(i).get(j).getV()+" "+adj.get(i).get(j).getWeight()+"),");
//			}
//			System.out.println();
//		}
	}
	static void dijkstra(int src,ArrayList<ArrayList<Node>> adj,int n)
	{
		int dist[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
			dist[i]=Integer.MAX_VALUE;
		}
		dist[src]=0;
		PriorityQueue<Node> pq=new PriorityQueue<Node>(n,new Node());
		pq.add(new Node(src,0));
		while(pq.size()>0)
		{
			Node node=pq.poll();
			for(Node it:adj.get(node.getV()))
			{
				if(dist[node.getV()]+it.getWeight()<dist[it.getV()])
				{
					dist[it.getV()]=dist[node.getV()]+it.getWeight();
					pq.add(new Node(it.getV(),dist[it.getV()]));
				}
			}
					
		}
		for(int i=1;i<=n;i++)
			System.out.print(dist[i]+" ");
	}
	static void addEdge(ArrayList<ArrayList<Node>> am, int s, int d,int w) {
	    am.get(s).add(new Node(d,w));
	    am.get(d).add(new Node(s,w));
	    
	   
	  }

}
