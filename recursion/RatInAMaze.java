package recursion;

import java.util.ArrayList;

public class RatInAMaze {

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
	    if(a[0][0]==1)
	    findPath(0,0,a,al,vis,"", n);
	    System.out.println(al);
	}
	static void findPath(int i,int j,int[][] maze,ArrayList<String> al,int[][] vis,String path,int n)
	{
		if(i==n-1&&j==n-1)
		{
			al.add(path);
			return;
		}
		//downward
		if(i+1<n&&vis[i+1][j]==0&&maze[i+1][j]==1)
		{
			vis[i][j]=1;
			findPath(i+1,j,maze,al,vis,path+'D',n);
			vis[i][j]=0;
		}
		//leftward
		if(j-1>=0&&vis[i][j-1]==0&&maze[i][j-1]==1)
		{
			vis[i][j]=1;
			findPath(i,j-1,maze,al,vis,path+'L',n);
			vis[i][j]=0;
		}
		//rightward
		if(j+1<n&&vis[i][j+1]==0&&maze[i][j+1]==1)
		{
			vis[i][j]=1;
			findPath(i,j+1,maze,al,vis,path+'R',n);
			vis[i][j]=0;
		}
		//upward
		if(i-1>=0&&vis[i-1][j]==0&&maze[i-1][j]==1)
		{
			vis[i][j]=1;
			findPath(i-1,j,maze,al,vis,path+'U',n);
			vis[i][j]=0;
		}	
	}

}
