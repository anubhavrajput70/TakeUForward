package recursion;
//n queens without using space

public class Nqueen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=4;
		char arr[][]=new char[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			arr[i][j]='.';
		}
		
		nQueen(0,arr,n);	
	}
	static void nQueen(int col,char[][] arr,int n)
	{
		if(col==n)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}			
            return;
		}		
	      for(int row=0;row<n;row++)
			{
				if(isSafe(row,col,arr,n))
				{
				arr[row][col]='Q';
				nQueen(col+1,arr,n);
				arr[row][col]='.';
				}
			}
	}
	static boolean isSafe(int row,int col,char[][] arr,int n)
	{
		int newrow=row;
		int newcol=col;
		
		while(row>=0&&col>=0)
		{
			if(arr[row][col]=='Q')
				return false;
			row--;
			col--;
		}
		row=newrow;
		col=newcol;
		while(col>=0)
		{
			if(arr[row][col]=='Q')
				return false;
			col--;
		}
		row=newrow;
		col=newcol;
		while(row<n&&col>=0)
		{
			if(arr[row][col]=='Q')
				return false;
			row++;
			col--;
		}
		return true;
	}
}
