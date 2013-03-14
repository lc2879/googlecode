public class Solution {
    public void solve(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board==null || board.length==0) return;
        int row = board.length-1;
        int col = board[0].length-1;
        for(int i =0;i<=row;i++){
            if(board[i][0]=='O')
                dfs(board,i,0);//left
            if(board[i][col]=='O')
                dfs(board,i,col);//right
        }
        for(int i =1;i<col;i++){
            if(board[0][i]=='O')
                dfs(board,0,i);//top
            if(board[row][i]=='O')
                dfs(board,row,i);//bottom
        }
        for(int i =0;i<=row;i++){
            for(int j =0;j<=col;j++){
                if(board[i][j]=='O') board[i][j]='X';
                else if(board[i][j]=='+') board[i][j] ='O';
            }
        }
    }
    public void dfs(char[][] board, int x, int y){
        board[x][y] = '+';
        if(x-1>=0 && board[x-1][y] =='O')
            dfs(board,x-1,y);
        if(y-1 >=0 && board[x][y-1] =='O')
            dfs(board,x,y-1);
        if(x+1<board.length && board[x+1][y] =='O')
            dfs(board,x+1,y);
        if(y+1 <board[0].length && board[x][y+1] =='O')
            dfs(board,x,y+1);
    }
}

