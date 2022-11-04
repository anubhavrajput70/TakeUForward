package dynamicProgramming;

import java.util.Arrays;

public class UniquePathInGridTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=2;
		int dp[][]=new int[m][n];
		for(int[] row:dp)
			Arrays.fill(row,-1);
		System.out.println(path(m,n,dp));
	}
	static int path(int m,int n,int[][] dp)
	{
	
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0&&j==0)
					dp[0][0]=1;
				else
				{
				int up=0;
				int left=0;
				if(i>0) up=dp[i-1][j];
				if(j>0) left=dp[i][j-1];
				dp[i][j]=up+left;
				}
				
			}
		}
		return dp[m-1][n-1];
	}

}
