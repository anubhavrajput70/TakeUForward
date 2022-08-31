package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aab";
		int n=s.length();
		List<List<String>> ans=new ArrayList<>();
		partition(0,n,s,ans,new ArrayList<>());
		System.out.println(ans);
	}
	static void partition(int ind,int n, String s,List<List<String>> ans,ArrayList<String> temp)
	{
		if(ind==n)
		{
			ans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=ind;i<n;i++)
		{
			if(isPalindrome(ind,i,s))
			{
				temp.add(s.substring(ind,i+1));
				partition(i+1,n,s,ans,temp);
				temp.remove(temp.size()-1);
			}
		}
	}
	static boolean isPalindrome(int start,int end,String s)
	{
		while(start<=end)
		{
			if(s.charAt(start++)!=s.charAt(end--))
				return false;
		}
		return true;
	}
	

}
