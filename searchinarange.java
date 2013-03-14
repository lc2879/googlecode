public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
         
        int [] res = {-1,-1};
        int left = 0, right = A.length-1;
        if(A.length == 0) return res;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(A[mid] == target){
                res[0] = mid;
                res[1] = mid;
                int i =mid, j = mid;
                while(i-1>=0 && A[i-1]==target) res[0]=--i;
                while(j+1<A.length && A[j+1]==target) res[1]=++j;
                return res;
            }
            else if(A[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return res;
    }
}

