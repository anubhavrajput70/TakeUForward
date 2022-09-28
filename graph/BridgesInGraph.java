package graph;
import java.util.*;
public class BridgesInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,3,4);
		BridgesInGraph obj=new BridgesInGraph();
		obj.printBridges(adj,n);
		
	}
	void printBridges(ArrayList<ArrayList<Integer>> adj,int n)
	{
		int vis[]=new int[n];
		int tin[]=new int[n];
		int low[]=new int[n];
		int timer=0;
		for(int i=0;i<n;i++)
		{
			if(vis[i]==0)
			{
				dfs(i,-1,vis,tin,low,adj,timer);
			}
		}
	}
	private void dfs(int node,int parent,int[] vis,int[] tin,int low[],ArrayList<ArrayList<Integer>> adj,int timer)
	{
		vis[node]=1;
		tin[node]=low[node]=timer++;
		for(Integer it:adj.get(node))
		{
			if(it==parent)
				continue;
			if(vis[it]==0)
			{
				dfs(it,node,vis,tin,low,adj,timer);
				low[node]=Math.min(low[node],low[it]);
				
				if(low[it]<tin[node])
					System.out.println(it+" "+node);
			}
			else
			{
				low[node]=Math.min(low[node],tin[it]);
			}
		}
				
	}
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    am.get(d).add(s);
	  }

}
