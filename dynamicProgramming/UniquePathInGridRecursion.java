package dynamicProgramming;

import java.util.Arrays;

public class UniquePathInGridRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=2;
		int dp[][]=new int[m][n];
		for(int[] row:dp)
			Arrays.fill(row,-1);
		System.out.println(path(m-1,n-1,dp));
		
	}
	static int path(int i,int j,int dp[][])
	{
		if(i==0&&j==0)
			return 1;
		if(i<0||j<0)
			return 0;
		if(dp[i][j]!=-1)
			return dp[i][j];
		int up=path(i-1,j,dp);
		int left=path(i,j-1,dp);
		return dp[i][j]=up+left;
	}

}
