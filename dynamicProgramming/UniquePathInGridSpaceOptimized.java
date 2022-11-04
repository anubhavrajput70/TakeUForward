package dynamicProgramming;

public class UniquePathInGridSpaceOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3,n=2;
		System.out.println(path(m,n));
	}
	static int path(int m,int n)
	{
	int prev[]=new int[n];
	for(int i=0;i<m;i++)
	{
		int temp[]=new int[n];
		for(int j=0;j<n;j++)
		{
			if(i==0&&j==0)
			{
				temp[j]=1;
				continue;
			}
			int up=0,left=0;
			if(i>0)up=prev[j];
			if(j>0)left=temp[j-1];
			temp[j]=up+left;	
		}
		prev=temp;
	}
	return prev[n-1];
	}

}
