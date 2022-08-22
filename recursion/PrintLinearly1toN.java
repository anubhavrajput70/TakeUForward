package recursion;
//print linearly form 1 to N  but by backtrack you can't use i+1;
public class PrintLinearly1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		rec(n,n);
		
	}
	public static void rec(int i,int n)
	{
		if(i<1)
			return;
		rec(i-1,n);
		System.out.println(i);
	}
	

}
