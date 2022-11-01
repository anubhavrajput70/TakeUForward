package dynamicProgramming;

import java.util.Arrays;

public class FrogJumpTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[]= {30,10,60,10,60,50};
		int n=6;
		int dp[]=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(jump(heights,dp));
	}
	static int jump(int[] heights,int[] dp)
	{
		 dp[0]=0;
		 for(int ind=1;ind<heights.length;ind++)
		 {
			int jumptwo=Integer.MAX_VALUE;
			int jumpone=dp[ind-1]+Math.abs(heights[ind]-heights[ind-1]);
			if(ind>1)
				jumptwo=dp[ind-2]+Math.abs(heights[ind]-heights[ind-2]);
			dp[ind]=Math.min(jumpone,jumptwo);
		 }
		 return dp[heights.length-1];
		
	}
}
