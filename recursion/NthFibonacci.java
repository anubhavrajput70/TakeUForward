package recursion;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(fib(n));
	}
	static int fib(int n)
	{
		if(n<=1)
			return n;
		int first=fib(n-1);
		int second=fib(n-2);
	
		return first+second;
		
	}

}
