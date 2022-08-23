package recursion;

import java.util.ArrayList;

//print all the subsequences of the given array with given sum
public class PrintAllSubSeqenceWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1};
		int sum=3;
		int n=3;
		ArrayList<Integer> al=new ArrayList<>();
		sumSubSequence(0,sum,n,al,arr,0);
	}
	public static void sumSubSequence(int i,int sum,int n,ArrayList<Integer> al,int[] arr,int s)
	{
		if(i==n)
		{
			if(s==sum)
				System.out.println(al);
			return ;
	    }
		al.add(arr[i]);
		s=s+arr[i];
		sumSubSequence(i+1,sum,n,al,arr,s);
		al.remove(al.size()-1);
		s=s-arr[i];
		sumSubSequence(i+1,sum,n,al,arr,s);
	}

}
