package recursion;

import java.util.ArrayList;

public class RatInAMaze2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
	    int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
	    ArrayList<String> al=new ArrayList<>();
	    int[][] vis=new int[n][n];
	    for(int i=0;i<n;i++) 
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		vis[i][j]=0;
	    }
	    }
	    int di[]= {1,0,0,-1};
	    int dj[]= {0,-1,1,0};
	   
	    if(a[0][0]==1)
	    	pathFinder(0,0,n,a,vis,di,dj,"",al);
	    System.out.println(al);
	}
	static void pathFinder(int i,int j,int n,int[][] maze,int[][] vis,int[] di,int[] dj,String path,ArrayList<String> al)
	{
		if(i==n-1&&j==n-1)
		{
			al.add(path);
			return;
		}
		String s="DLRU";
		for(int ind=0;ind<n;ind++)
		{
			int nexti=i+di[ind];
			int nextj=j+dj[ind];
			   if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n &&
				        vis[nexti][nextj] == 0 && maze[nexti][nextj] == 1)
			   {
				   vis[i][j]=1;
				   pathFinder(nexti,nextj,n,maze,vis,di,dj,path+s.charAt(ind),al);
				   vis[i][j]=0;
			   }
		}
	}
	

}
