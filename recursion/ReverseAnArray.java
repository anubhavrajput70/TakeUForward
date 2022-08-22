package recursion;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		reverse(0,arr,n);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");	
	}

	static void reverse(int i,int arr[],int n)
	{
		if(i>=n/2)
			return ;
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
		reverse(i+1,arr,n);
	}
	static void swap(int a,int b)
	{
		
	}
}
