package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUndirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,0,1);
		addEdge(adj,1,3);
		addEdge(adj,0,3);
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,5,6);
		addEdge(adj,6,7);
		addEdge(adj,7,8);
		addEdge(adj,6,8);
		addEdge(adj,1,2);
		addEdge(adj,2,6);
		int src=0;
		shortestPath(n,adj,src);
	}
	static void shortestPath(int v,ArrayList<ArrayList<Integer>> adj,int src)
	{
		int dis[]=new int[v+1];
		for(int i=0;i<v;i++)
		{
			dis[i]=1000;
		}
		Queue<Integer> q=new LinkedList<>();
		dis[src]=0;
		q.add(src);
		
		while(q.isEmpty()==false)
		{
			int node=q.poll();
			for(Integer it:adj.get(node))
			{
				if(dis[node]+1<dis[it])
				{
					dis[it]=dis[node]+1;
				q.add(it);
				}
			}		
		}
		for(int i=0;i<v;i++)
			System.out.print(dis[i]+" ");
		
	}
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    am.get(d).add(s);
	  }
}
