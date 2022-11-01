package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[]= {30,10,60,10,60,50};
		int n=6;
		int dp[]=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(jump(n-1,heights,dp));
	}
	static int jump(int ind,int[] heights,int[] dp)
	{
		if(ind==0)
			return 0;
		if(dp[ind]!=-1)
			return dp[ind];
		int left=jump(ind-1,heights,dp)+Math.abs(heights[ind]-heights[ind-1]);
		int right=Integer.MAX_VALUE;
		if(ind>1)
		right=jump(ind-2,heights,dp)+Math.abs(heights[ind]-heights[ind-2]);
		return dp[ind]=Math.min(left,right);
	}
}
