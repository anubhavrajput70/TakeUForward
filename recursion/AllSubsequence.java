package recursion;

import java.util.ArrayList;

public class AllSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,2};
		int n=3;
		ArrayList<Integer> al=new ArrayList<>();
		subSequence(0,al,arr,n);	
	}
	static void subSequence(int i,ArrayList<Integer> al,int arr[],int n) {
		if(i==n)
		{
			System.out.println(al);
			return;
		}
		al.add(arr[i]);
		subSequence(i+1,al,arr,n);
		al.remove(al.size()-1);
		subSequence(i+1,al,arr,n);
		
	}
	

}
