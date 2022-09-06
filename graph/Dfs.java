package graph;

import java.util.ArrayList;

public class Dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,1,2);
		addEdge(adj,2,4);
		addEdge(adj,2,7);
		addEdge(adj,4,6);
		addEdge(adj,3,5);
		addEdge(adj,7,6);
		dfsOfGraph( n,adj);
		
	
	}
	static void dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList<Integer> dfs=new ArrayList<>();
		boolean[] vis=new boolean[v+1];
		for(int i=1;i<=v;i++)
		{
			if(!vis[i])
			{
				dfs(i,adj,vis,dfs);
			}
		}
		System.out.println(dfs);
	}
	static void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> dfs)
	{
		dfs.add(v);
		vis[v]=true;
		for(Integer neighbor: adj.get(v))
		{
			if(!vis[neighbor])
			{
				dfs(neighbor,adj,vis,dfs);
			}
		}
		
	}
	 static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
		    am.get(s).add(d);
		    am.get(d).add(s);
		  }
}
