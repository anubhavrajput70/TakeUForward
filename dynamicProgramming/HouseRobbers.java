package dynamicProgramming;

import java.util.*;

public class HouseRobbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(6);
		int n=al.size();
		System.out.println(robbers(n,al));
		
	}
	static long robbers(int n,ArrayList<Integer> al)
	{
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		if(n==1)
			return al.get(0);
		for(int i=0;i<n;i++)
		{
			if(i!=0)
				arr1.add(al.get(i));
			if(i!=1)
				arr2.add(al.get(i));
		}
		long ans1=solve(arr1);
		long ans2=solve(arr2);
		return Math.max(ans1,ans2);
	}
	static long solve(ArrayList<Integer> arr)
	{
		int n=arr.size();
		long prev=arr.get(0);
		long prev2=0;
		for(int i=1;i<n;i++)
		{
			long pick=arr.get(i);
			if(i>1)
				pick+=prev2;
			long nonpick=prev;
			long curr=Math.max(pick,nonpick);
			prev2=prev;
			prev=curr;
			
		}
		return prev;
	}
}
