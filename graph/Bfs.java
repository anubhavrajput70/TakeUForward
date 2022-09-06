package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,2,7);
		addEdge(adj,3,5);
		addEdge(adj,7,5);
		addEdge(adj,4,6);
		System.out.println(bfsOfGraph( n,adj));
		
	}
	static ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList<Integer> bfs=new ArrayList<>();
		boolean[] vis=new boolean[v+1];
		for(int i=1;i<=v;i++)
		{
			if(vis[i]==false)
			{
				Queue<Integer> q=new LinkedList<>();
				q.add(i);
				vis[i]=true;
				while(!q.isEmpty())
				{
					Integer node=q.poll();
					bfs.add(node);
					for(Integer it: adj.get(node))
					{
						if(vis[it]==false)
						{
							q.add(it);
							vis[it]=true;
						}
					}
					
				}
			}
		}
		return bfs;
	}
	 static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
		    am.get(s).add(d);
		    am.get(d).add(s);
		  }

}
