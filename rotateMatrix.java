 
public class Solution {
    public void rotate(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = matrix.length;
        for(int layer=0;layer<n/2;layer++){
            //not i<= last because the last is the one we replace initail
            for(int i = layer;i<n-1-layer;i++){
                int temp = matrix[layer][i];
                //left to top
                matrix[layer][i] = matrix[n-1-i][layer];
                //bottom to left;
                matrix[n-i-1][layer] = matrix[n-1-layer][n-i-1];
                //right to bottom
                matrix[n-1-layer][n-i-1]=matrix[i][n-1-layer];
                //top to right;
                matrix[i][n-1-layer]=temp;
            }
        }
    }
}
 
 
 
public class Solution {
    public void rotate(int[][] mat) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n- i -1 ; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n-j-1][n-i-1];
                mat[n-j-1][n-i-1] = temp;
            }
        }
    }
     
}
