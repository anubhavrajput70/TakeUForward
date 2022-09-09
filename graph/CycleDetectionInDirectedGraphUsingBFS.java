package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//it is not a solution its a hack but it works
public class CycleDetectionInDirectedGraphUsingBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,4,2);
		
		topoSort( n,adj);
	}
	static void topoSort(int v,ArrayList<ArrayList<Integer>> adj)
	{

		int[] indegree=new int[v];
		//for calculating indegree of every node

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
		
		int count=0;
		while(!q.isEmpty())
		{
			Integer node=q.poll();
			count++;
			for(Integer it: adj.get(node))
			{
				indegree[it]--;
				if(indegree[it]==0)
				{
					q.add(it);
				}
			}
		}
		if(v==count)
			System.out.println("not contain a cycle");
		else
			System.out.println("cyclic");
			
	}
		
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
	    am.get(s).add(d);
	    
	  }

}
