package graph;

import java.util.ArrayList;

public class CycleDetectionInDirectedGraphUsingDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,3,6);
		addEdge(adj,6,5);
		addEdge(adj,7,2);
		addEdge(adj,7,8);
		addEdge(adj,8,9);
		addEdge(adj,9,7);
		if(checkCycle(adj,n))
			System.out.println("cycle present");
		else
			System.out.println("cycle not present");

	}
	static boolean checkCycle(ArrayList<ArrayList<Integer>> adj,int v)
	{
		int[] vis=new int[v+1];
		int[] dfsvis=new int[v+1];
		for(int i=0;i<=v;i++)
		{
			if(vis[i]==0)
			{
				if(dfs(i,adj,vis,dfsvis))
					return true;
			}
		}
		return false;
	}
	static boolean dfs(int v,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] dfsvis)
	{
		vis[v]=1;
		dfsvis[v]=1;
		for(Integer it:adj.get(v)) {
			if(vis[it]==0)
			{
				if(dfs(it,adj,vis,dfsvis))
					return true;
			}
			else if(dfsvis[it]==1)
				return true;
		}
		dfsvis[v]=0;
		return false;
	}
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    
	  }
}
