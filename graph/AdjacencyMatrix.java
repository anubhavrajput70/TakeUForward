package graph;

import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of vertex");
		int n=sc.nextInt();
		System.out.println("enter the number of edges");
		int m=sc.nextInt();
		//decalre the adjacent matrix;
		int[][] adj=new int[n+1][n+1 ];
		//take edges as input
		for(int i=0;i<m;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj[u][v]=1;
			adj[v][u]=1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}

}
