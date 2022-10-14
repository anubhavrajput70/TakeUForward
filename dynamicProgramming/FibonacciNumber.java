package dynamicProgramming;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[] dp=new int[n+1];
		for(int i=0;i<dp.length;i++)
			dp[i]=-1;
		System.out.println(fibdp(n,dp));
	}
	static int fibdp(int n,int dp[])
	{
		if(n<=1)
			return n;
		if(dp[n]!=-1) return dp[n];
		return dp[n]=fibdp(n-1,dp)+fibdp(n-2,dp);
	}

}
