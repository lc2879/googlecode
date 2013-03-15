//can pass large
public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board.length==0) return false;
        if(word.length()==0) return true;
        boolean path[][]=new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
            for(int j =0;j<board[0].length;j++)
                if(helper(board,path, word, i,j,0))
                    return true;
        return false;
    }
    public boolean helper(char[][]board, boolean[][]path, String word, int i, int j, int k){
        if(board[i][j]!=word.charAt(k)) return false;
        if(k==word.length()-1) return true;
        path[i][j]=true;
         
        if(i+1<board.length && !path[i+1][j] && helper(board,path,word,i+1,j,k+1))
            return true;
        if(i-1>=0 && !path[i-1][j] && helper(board,path,word, i-1,j,k+1))
            return true;
        if(j+1<board[0].length && !path[i][j+1] && helper(board,path,word,i,j+1,k+1))
            return true;
        if(j-1>=0 && !path[i][j-1] && helper(board,path,word, i,j-1,k+1))
            return true;       
        path[i][j] = false;
        return false;
    }
}
 
 
//clean but too many recursive call, cant pass large
public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(board==null || board.length==0) return false;
        if(word.length()==0 || word.equals("")) return true;
        boolean [][] path = new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
            for(int j = 0;j<board[0].length;j++)
                if(dfs(i,j,board,path,word,0)) return true;
        return false;
    }
    public boolean dfs(int x, int y, char[][]board,boolean[][]path, String word,int k){
        if( x<0 || x>=board.length || y<0 || y>=board[0].length ||
        path[x][y] || board[x][y]!=word.charAt(k)) return false;
        if(k==word.length()-1) return true;
        path[x][y]=true;
        if(dfs(x+1,y,board,path,word,k+1)) return true;
        if(dfs(x,y+1,board,path,word,k+1)) return true;
        if(dfs(x-1,y,board,path,word,k+1)) return true;
        if(dfs(x,y-1,board,path,word,k+1)) return true;
        path[x][y]=false;
        return false;
    }
}
