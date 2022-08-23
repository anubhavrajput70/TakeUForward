package recursion;

import java.util.ArrayList;

public class CountAllSubsequenceWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		int sum=3;
		int n=3;
	
		System.out.println(sumSubSequence(0,sum,n,arr,0));
	}
	public static int sumSubSequence(int i,int sum,int n,int[] arr,int s)
	{
		if(i==n)
		{
			//condition statisfied
			if(s==sum)
			{
				
				return 1;
			}
			//condition not satisfied
			else
			return 0;
	    }
	
		s=s+arr[i];
		int l=(sumSubSequence(i+1,sum,n,arr,s));
		
		s=s-arr[i];
		int r=(sumSubSequence(i+1,sum,n,arr,s));
		return l+r;
	}

}
