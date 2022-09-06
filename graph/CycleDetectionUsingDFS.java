package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleDetectionUsingDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,1,3);
		addEdge(adj,3,4);
		
		addEdge(adj,2,5);
		addEdge(adj,5,6);
		addEdge(adj,6,7);
		addEdge(adj,7,8);
		addEdge(adj,8,5);
		System.out.println(isCycle(n,adj));
	}
	static boolean isCycle(int v,ArrayList<ArrayList<Integer>> adj)
	{
		boolean vis[]=new boolean[v+1];
		Arrays.fill(vis,false);
		for(int i=1;i<=v;i++)
		{
			if(!vis[i])
			{
				if(isCyclePresent(i,-1,adj,vis))
				{
					return true;
				}
			}
		}
		
		return false;
		
	}
	static boolean isCyclePresent(int v,int par,ArrayList<ArrayList<Integer>> adj,boolean[] vis)
	{
		vis[v]=true;
		for(Integer it:adj.get(v))
		{
			if(!vis[it])
			{
			if(isCyclePresent(it,v,adj,vis))
				return true;
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
}
