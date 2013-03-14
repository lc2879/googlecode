public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        for(int i = 0; i<A.length; i++){
            while(A[i]!=i+1 && A[i]>0 && A[i]<=A.length && A[A[i] - 1] != A[i]){
                //sort the list if A[i] is not as same as i
                int temp = A[i];
                A[i] = A[temp-1];
                A[temp-1] = temp;
                 
            }
        }
        for(int i =0; i<A.length; i++)
            if(A[i] !=i+1) 
                return i+1;
        return A.length+1;
    }
}
