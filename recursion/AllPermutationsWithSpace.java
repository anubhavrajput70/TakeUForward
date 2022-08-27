package recursion;

import java.util.ArrayList;

public class AllPermutationsWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		boolean flag[]=new boolean[a.length];
		ArrayList<Integer> al=new ArrayList<>();
		permute(0,a,flag,al);
	}
	static void permute(int ind,int[] a,boolean[] flag,ArrayList<Integer> al) {
		if(al.size()==a.length)
		{
			System.out.println(al);
			return ;
			
		}
		for(int i=ind;i<a.length;i++)
		{
			if(!flag[i])
			{
				flag[i]=true;
				al.add(a[i]);
				permute(ind,a,flag,al);
				al.remove(al.size()-1);
				flag[i]=false;
			}
		}
	}
	

}
