package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpKDistanceRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[]= {30,10,60,10,60,50};
		int k=2;
		int n=heights.length;
		int dp[]=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(jump(n-1,heights,dp,k));
	}
	static int jump(int ind,int[] heights,int[] dp,int k)
	{
		if(ind==0)
			return 0;
		if(dp[ind]!=-1)
			return dp[ind];
		int minsteps=Integer.MAX_VALUE;
		for(int j=1;j<=k;j++)
		{
			if(ind-j>=0)
			{
			int jumps=jump(ind-j,heights,dp,k)+Math.abs(heights[ind]-heights[ind-j]);
			minsteps=Math.min(jumps,minsteps);
			}
		}
		return dp[ind]=minsteps;
	}

}
