//O(logM + logN)
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, right = row*col -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(matrix[mid/col][mid%col]==target)
                return true;
            else if(matrix[mid/col][mid%col]<target)
                left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
//o(m+n)
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int col=matrix[0].length -1;
        int row =0;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }
}

