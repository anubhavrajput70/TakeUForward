package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSortUsingBFS {

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
		topoSort( n,adj);
	}
	static void topoSort(int v,ArrayList<ArrayList<Integer>> adj)
	{
		int[] topo=new int[v];
		int[] indegree=new int[v];
		for(int i=0;i<v;i++)
		{
			for(Integer it :adj.get(i))
			{
				indegree[it]++;
			}
		}
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<v;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		int ind=0;
		while(!q.isEmpty())
		{
			Integer node=q.poll();
			topo[ind++]=node;
			for(Integer it: adj.get(node))
			{
				indegree[it]--;
				if(indegree[it]==0)
				{
					q.add(it);
				}
			}
		}
		for(int i=0;i<v;i++)
			System.out.print(topo[i]+" ");
	}
		
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    
	  }
}
