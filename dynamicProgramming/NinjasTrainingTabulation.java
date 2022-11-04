package dynamicProgramming;

import java.util.Arrays;

public class NinjasTrainingTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{10,40,70},
                {20,50,80},
                {30,60,90}};
        int n=points.length;
        int dp[][]=new int[n][4];
        for(int[] row:dp)
        	Arrays.fill(row,-1);
        System.out.println(training(n,points,dp));
	}
	static int training(int n,int[][] points,int[][] dp)
	{
		dp[0][0]=Math.max(points[0][1],points[0][2]);
		dp[0][1]=Math.max(points[0][0],points[0][2]);
		dp[0][2]=Math.max(points[0][0],points[0][1]);
		dp[0][3]=Math.max(Math.max(points[0][0],points[0][1]),points[0][2]);
		for(int day=1;day<n;day++)
		{
			for(int last=0;last<4;last++)
			{
				dp[day][last]=0;
				for(int task=0;task<3;task++)
				{
					if(task!=last)
					{
						int activity=points[day][task]+dp[day-1][task];
						dp[day][last]=Math.max(dp[day][last],activity);
					}
				}
			}
		}
		return dp[n-1][3];
	}

}
