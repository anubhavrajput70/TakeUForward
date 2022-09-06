package recursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=17;
		System.out.println(getPermutation(n,k));
	}
	static String getPermutation(int n,int k)
	{
		int fact=1;
		//created a array containing numbers from 1 to n
		List<Integer> numbers=new ArrayList<>();
		//filling the array element and calculating the factorial to n-1;
		for(int i=1;i<n;i++)
		{
			fact=fact*i;
			numbers.add(i);
		}
		//adding last element in the array
		numbers.add(n);
		//created a empty string
		String ans="";
		//reduce k by 1 because we have used 0 based indexing
		k=k-1;
		while(true)
		{
			ans=ans+numbers.get(k/fact);
			numbers.remove(k/fact);
			if(numbers.size()==0)
				break;
			k=k%fact;
			fact=fact/numbers.size();
		}
		return ans;
	}
}
