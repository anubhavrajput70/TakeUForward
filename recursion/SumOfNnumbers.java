package recursion;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(sum(n));
		sum1(n,0);
	}
	//funtional way
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return n+sum(n-1);
	}
	//paramertized way
	static void sum1(int i,int sum)
	{
		if(i<1)
		{
			System.out.println(sum);
			return;
		}
		sum1(i-1,sum+i);		
	}
}
