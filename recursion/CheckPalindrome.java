package recursion;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		int n=s.length();
		System.out.println(checkPalindrome(0,s,n));
	}
	static boolean checkPalindrome(int i,String s, int n)
	{
		if(i>=n/2) return true;
		if(s.charAt(i)!=s.charAt(n-i-1)) return false;
		return checkPalindrome(i+1,s,n);
				
	}
}
