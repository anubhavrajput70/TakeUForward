package recursion;

public class AllPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		
		permute(0,a);
	}
	static void permute(int ind,int[] a)
	{
		if(ind==a.length)
		{
			System.out.println();
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]+" ");
			}
			return;
		}
		for(int i=ind ;i<a.length;i++) {
			
			swap(i,ind,a);
			permute(ind+1,a);
			swap(i,ind,a);
		}
	}
	static void swap(int i,int j,int a[])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
