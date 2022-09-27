package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Node
{
	private int u;
	private int v;
	private int weight;
	public Node(int _u, int _v, int _w) {
	
		u = _u;
		v = _v;
		weight = _w;
	}
	public Node() {
	
	}
	public int getU() {
		return u;
	}
	public int getV() {
		return v;
	}
	public int getWeight() {
		return weight;
	}
}
class SortComparator implements Comparator<Node>
{
	@Override
	public int compare(Node node1,Node node2)
	{
		if(node1.getWeight()<node2.getWeight())
			return -1;
		if(node1.getWeight()>node2.getWeight())
			return 1;
		return 0;
	}
}
public class KruskalsAlgo {
	
	private int findPar(int u,int parent[])
	{
		if(u==parent[u]) return u;
		return findPar(parent[u],parent);
	}
	private void union(int u,int v,int parent[],int rank[])
	{
		u=findPar(u,parent);
		v=findPar(v,parent);
		if(rank[u]<rank[v])
		{
			parent[u]=v;
		}
		else if(rank[u]<rank[v])
		{
			parent[v]=u;
		}
		else
		{
			parent[v]=u;
			rank[u]++; 
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<Node> adj=new ArrayList<Node>();
		adj.add(new Node(0,1,2));
		adj.add(new Node(0,3,6));
		adj.add(new Node(1,3,8));
		adj.add(new Node(1,2,3));
		adj.add(new Node(1,4,5));
		adj.add(new Node(2,4,7));
		KruskalsAlgo obj=new KruskalsAlgo();
		obj.kruskalAlgo(adj,n);
	}
	void kruskalAlgo(ArrayList<Node> adj,int n)
	{
		Collections.sort(adj,new SortComparator());
		int parent[]=new int[n];
		int rank[]=new int[n];
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
			rank[i]=0;
		}
		int costMst=0;
		ArrayList<Node> mst=new ArrayList<Node>();
		for(Node it:adj)
		{
			if(findPar(it.getU(),parent)!=findPar(it.getV(),parent))
			{
				costMst+=it.getWeight();
				mst.add(it);
				union(it.getU(),it.getV(),parent,rank);
			}
		}
		System.out.println(costMst);
		for(Node it:mst)
			System.out.println(it.getU()+" "+it.getV());
	}
}
