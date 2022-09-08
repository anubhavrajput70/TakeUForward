package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortUsingDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		
		addEdge(adj,5,0);
		addEdge(adj,5,2);
		addEdge(adj,2,3);
		addEdge(adj,3,1);
		addEdge(adj,4,1);
		addEdge(adj,4,0);
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<adj.get(i).size();j++)
			{
				System.out.print(adj.get(i).get(j)+" ");
			}
			System.out.println();
		}
		topoSort( n,adj);
	}
	static void topoSort(int v,ArrayList<ArrayList<Integer>> adj)
	{
		Stack<Integer> s=new Stack<Integer>();
		int[] vis=new int[v];
		for(int i=0;i<v;i++)
		{
			if(vis[i]==0)
			{
				dfs(i,adj,vis,s);
			}
		}
		
		int[] topo=new int[v];
		int i=0;
		while(!s.isEmpty())
		{
			topo[i++]=s.pop();
		}
		for(int j=0;j<v;j++)
			System.out.println(topo[j]+" ");
	}
	static void dfs(int v,ArrayList<ArrayList<Integer>> adj,int[] vis,Stack<Integer> s)
	{
		vis[v]=1;
		for(Integer it:adj.get(v))
		{
			if(vis[it]==0)
				dfs(it,adj,vis,s);
		}
		s.push(v);
	}
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    
	  }

}
