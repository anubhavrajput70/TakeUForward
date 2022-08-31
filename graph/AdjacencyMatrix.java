package graph;

import java.util.Scanner;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number of vertex");
//		int n=sc.nextInt();
//		System.out.println("enter the number of edges");
//		int m=sc.nextInt();
		int n=5;
		
		//decalre the adjacent matrix;
		int[][] adj=new int[n+1][n+1 ];
	//for 1-2 edge
		adj[1][2]=1;
		adj[2][1]=1;
		
		//for 1-2 edge
		adj[1][2]=1;
		adj[2][1]=1;
		
		//for 2-4 edge
		adj[2][4]=1;
		adj[4][2]=1;
		
		//for 2-3 edge
		adj[2][3]=1;
		adj[3][2]=1;
		
		//for 1-3 edge
		adj[1][3]=1;
		adj[3][1]=1;
		
		//for 3-4 edge
		adj[3][4]=1;
		adj[4][3]=1;
		
		//for 1-5 edge
		adj[1][5]=1;
		adj[5][1]=1;
		
		//for 5-3 edge
		adj[5][3]=1;
		adj[3][5]=1;
		
		//take edges as input
//		for(int i=0;i<m;i++)
//		{
//			int u=sc.nextInt();
//			int v=sc.nextInt();
//			adj[u][v]=1;
//			adj[v][u]=1;
//		}
		sc.close();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(adj[i][j]+" ");
			}
			System.out.println();
		}
	}

}
