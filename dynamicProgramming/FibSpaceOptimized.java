package dynamicProgramming;

public class FibSpaceOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fibdp(n);
	}
	static void fibdp(int n)
	{
		int prev=0;
		int prev1=1;
		for(int i=2;i<=n;i++)
		{
			int curr=prev+prev1;
			prev=prev1;
			prev1=curr;
		}
		System.out.println(prev1);
	}

}
