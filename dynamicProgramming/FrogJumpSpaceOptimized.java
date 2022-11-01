package dynamicProgramming;
public class FrogJumpSpaceOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heights[]= {30,10,60,10,60,50};
		System.out.println(jump(heights));
	}
	static int jump(int heights[])
	{
		int prev1=0,prev2=0;
		for(int ind=1;ind<heights.length;ind++)
		{
			int jumptwo=Integer.MAX_VALUE;
			int jumpone=prev1+Math.abs(heights[ind]-heights[ind-1]);
			if(ind>1)
				jumptwo=prev2+Math.abs(heights[ind]-heights[ind-2]);
			int curr=Math.min(jumpone,jumptwo);
			prev2=prev1;
			prev1=curr;
		}
		return prev1;
	}

}
