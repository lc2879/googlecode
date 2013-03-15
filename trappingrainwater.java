public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[]left=new int[A.length];
        int[]right=new int[A.length];
        if(A.length==0) return 0;
        int max=0;
        for(int i =0;i<A.length;i++){
            max=Math.max(max,A[i]);
            left[i]=max;
        }
        max=0;
        for(int i =A.length-1;i>=0;i--){
            max=Math.max(max,A[i]);
            right[i]=max;
        }
        max=0;
        for(int i =0;i<A.length;i++)
            max+=Math.min(left[i],right[i])-A[i];
        return max;
    }
}
