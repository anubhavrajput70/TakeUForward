package recursion;

import java.util.ArrayList;

public class NQueengfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueen(4);
	}

	static void nQueen(int n) {
        // code here
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int middle[]=new int[n];
        int upperdiagonal[]=new int[2*n-1];
        int lowerdiagonal[]=new int[2*n-1];
        solve(0,board,ans,middle,upperdiagonal,lowerdiagonal);
       System.out.println(ans);
    }
    static void solve(int row,char[][] board, ArrayList<ArrayList<Integer>> ans,int[] middle,int[] upperdiagonal,int[] lowerdiagonal)
    {
        if(row==board.length)
        {
            ArrayList<Integer> temp=new ArrayList<>();
              for(int i=0;i<board.length;i++)
              {
                 for(int j=0;j<board.length;j++)
                 {
                     if(board[i][j]=='Q')
                     temp.add(j+1);
                 }
              }
              ans.add(new ArrayList<>(temp));
              return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(middle[col]==0&&lowerdiagonal[row+col]==0&&upperdiagonal[board.length-1+col-row]==0)
            {
                board[row][col]='Q';
                middle[col]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[board.length-1+col-row]=1;
                solve(row+1,board,ans,middle,upperdiagonal,lowerdiagonal);
                board[row][col]='.';
                middle[col]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[board.length-1+col-row]=0;
                
            }
        }
    }
}
