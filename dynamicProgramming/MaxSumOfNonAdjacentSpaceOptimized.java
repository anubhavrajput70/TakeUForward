package dynamicProgramming;

public class MaxSumOfNonAdjacentSpaceOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,4,9};
		int n=arr.length;
		System.out.println(maxSum(n,arr));
		}
		static int maxSum(int n,int[] arr)
		{
			int prev=arr[0];
			int prev2=0;
			for(int i=1;i<n;i++)
			{
				int pick=arr[i];
				if(i>1)
					pick+=prev2;
				int notPick=prev;
				int curr=Math.max(pick,notPick);
				prev2=prev;
				prev=curr;
			}
			return prev;
		}
		
}
