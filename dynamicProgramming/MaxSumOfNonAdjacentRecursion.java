package dynamicProgramming;

import java.util.Arrays;

public class MaxSumOfNonAdjacentRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,4,9};
		int n=arr.length;
		int[] dp=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(maxSum(n-1,arr,dp));
	}
	static int maxSum(int ind,int[] arr,int[] dp)
	{
		if(ind==0)
			return arr[ind];
		if(ind<0)
			return 0;
		if(dp[ind]!=-1)
			return dp[ind];
		int pick=arr[ind]+maxSum(ind-2,arr,dp);
		int notPick=maxSum(ind-1,arr,dp);
		return dp[ind]=Math.max(pick,notPick);
	}

}
