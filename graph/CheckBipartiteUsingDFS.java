package graph;

import java.util.*;

public class CheckBipartiteUsingDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		//non bipartite graph node
//		addEdge(adj,1,2);
//		addEdge(adj,2,3);
//		addEdge(adj,3,4);
//		addEdge(adj,4,5);
//		addEdge(adj,5,6);
//		addEdge(adj,6,7);
//		addEdge(adj,2,8);
//		addEdge(adj,8,5);


		//  bipartite graph nodes
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,5,8);
		addEdge(adj,5,6);
		addEdge(adj,6,7);
		addEdge(adj,7,2);
		if(checkBipartite(n,adj))
			System.out.println("yes bipartite");
		else
			System.out.println("not a bipartite");
	}
	static boolean checkBipartite(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int color[]=new int[v+1];
		for(int i=0;i<=v;i++)
		{
			color[i]=-1;
		}
		for(int i=0;i<=v;i++)
		{
			if(color[i]==-1)
			{
				if(!dfs(adj,i,color))
					return false;
			}
		}
		return true;
		
	}
	static boolean dfs(ArrayList<ArrayList<Integer>> adj,int v,int[] color)
	{
		if(color[v]==-1)
			color[v]=1;
		for(Integer it:adj.get(v))
		{
			if(color[it]==-1)
			{
				color[it]=1-color[v];
				if(!dfs(adj,it,color))
					return false;
			}
			else if(color[it]==color[v])
				return false;
		}
			
		return true;
	}
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    am.get(d).add(s);
	  }

	}

