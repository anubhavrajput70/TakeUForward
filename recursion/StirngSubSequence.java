package recursion;

public class StirngSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int n=s.length();
		sub(0,"",s,n);
				
	}
	static void sub(int i,String a,String s,int n)
	{
		if(i>=n)
		{
			System.out.println(a);
			return;
		}
		sub(i+1,a,s,n);
		a=a+s.charAt(i);
		sub(i+1,a,s,n);
	}
}
