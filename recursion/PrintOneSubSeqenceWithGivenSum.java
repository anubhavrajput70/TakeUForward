package recursion;

import java.util.ArrayList;

public class PrintOneSubSeqenceWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		int sum=3;
		int n=3;
		ArrayList<Integer> al=new ArrayList<>();
		sumSubSequence(0,sum,n,al,arr,0);
	}
	public static boolean sumSubSequence(int i,int sum,int n,ArrayList<Integer> al,int[] arr,int s)
	{
		if(i==n)
		{
			//condition statisfied
			if(s==sum)
			{
				System.out.println(al);
				return true;
			}
			//condition not satisfied
			else
			return false;
	    }
		al.add(arr[i]);
		s=s+arr[i];
		if(sumSubSequence(i+1,sum,n,al,arr,s)) return true;
		al.remove(al.size()-1);
		s=s-arr[i];
		if(sumSubSequence(i+1,sum,n,al,arr,s)) return true;
		return false;
	}
}
