package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpKDistanceTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[]= {30,10,60,10,60,50};
		int k=2;
		int n=heights.length;
		int dp[]=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(jump(n,heights,dp,k));
	}
	static int jump(int n,int[] heights, int[] dp,int k)
	{
		dp[0]=0;
		for(int i=1;i<n;i++)
		{
		int minstep=Integer.MAX_VALUE;
		for(int j=1;j<=k;j++)
		{
			if(i-j>=0)
			{
			int jumps=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
			minstep=Math.min(minstep,jumps);
		}
		}
		dp[i]=minstep;
		}
		return dp[n-1];
	}

}
