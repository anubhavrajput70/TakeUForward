package dynamicProgramming;

import java.util.Arrays;

public class MaxSumOfNonAdjacentTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,4,9};
		int n=arr.length;
		int[] dp=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(maxSum(n,arr,dp));
	}
	static int maxSum(int n,int[] arr,int[] dp)
	{
		dp[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			int pick=arr[i];
			if(i>1)
				pick+=dp[i-2];
			int notPick=dp[i-1];
			dp[i]=Math.max(pick,notPick);
		}
		return dp[n-1];
	}

}
