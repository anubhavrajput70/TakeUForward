package dynamicProgramming;
/*find all the distinct ways in which you can reach the nth stairs 
if you start from 0th stair you can jump either 1 or 2 statir*/
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(stair(n));
	}
	static int stair(int n)
	{
		if(n==0||n==1)
			return 1;
		int left=stair(n-1);
		int right=stair(n-2);
		return left+right;
	}

}
