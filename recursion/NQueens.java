package recursion;
//n queen with using space 
public class NQueens {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				board[i][j]='.';
		}
		int[] middle=new int[n];
		int[] upperdiagonal=new int[2*n-1];
		int[] lowerdiagonal=new int[2*n-1];
		nQueen(0,board,middle,lowerdiagonal,upperdiagonal);
		
		
		
	}
	static void nQueen(int col,char[][] board,int[] middle,int[] lowerdiagonal,int[] upperdiagonal)
	{
		if(col==board.length)
		{
			for(int i=0;i<board.length;i++)
			{	
				for(int j=0;j<board.length;j++)
				{
					if(board[i][j]=='Q')
						System.out.print(j+1);
				}
				System.out.println();
			}
		}
		
		for(int row=0;row<board.length;row++)
		{
			if(middle[row]==0&&lowerdiagonal[row+col]==0&&upperdiagonal[board.length - 1 + col - row]==0)
			{
				board[row][col]='Q';
				middle[row]=1;
				lowerdiagonal[row+col]=1;
				upperdiagonal[board.length - 1 + col - row]=1;
				nQueen(col+1,board,middle,lowerdiagonal,upperdiagonal);
				board[row][col]='.';
				middle[row]=0;
				lowerdiagonal[row+col]=0;
				upperdiagonal[board.length - 1 + col - row]=0;
			}
		}
	}

}
