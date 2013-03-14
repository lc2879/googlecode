public class Solution {
    public int numDistinct(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lS = S.length();
        int lT = T.length();
        if(lS == 0) return 0;
        if(lT == 0) return 1;
        int [][] mat = new int[lT+1][lS+1];
        for(int i =0; i<lT+1;i++) mat[i][0] =0;
        for(int i =0; i<lS+1;i++) mat[0][i] =1;
        for (int i = 1; i <= lT; i++) {
            for (int j = 1; j <= lS; j++) {
                if(S.charAt(j-1)==T.charAt(i-1))
                    mat[i][j] = mat[i][j-1] + mat[i-1][j-1];
                else
                    mat[i][j] = mat[i][j-1];
            }
        }
        return mat[lT][lS];
    }
}
