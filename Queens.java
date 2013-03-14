tries to solve the queens problem
how many distinct solutions are there?

public class Solution {
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0) return 0;
        int[] cache = new int[n];
        Arrays.fill(cache, -1);
        return totalNQueensHelper(cache, 0);
    }

    public int totalNQueensHelper(int[] cache, int numFound){

        if(numFound == cache.length){
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < cache.length; i++){
            if(cache[i] == -1 && isValid(cache, i, numFound)){
                cache[i] = numFound;
                sum += totalNQueensHelper(cache, numFound+1);
                cache[i] = -1;
            }
        }
        return sum;
    }

    public boolean isValid(int[] cache, int index, int d){

        for(int i = 0; i < cache.length; i++){
            if(cache[i] != -1 && (cache[i] == d || Math.abs(cache[i]-d) == Math.abs(i-index) )) return false;
        }
        return true;
    }
}

public class Solution {
    public int totalNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0) return 0;
        int[] cache = new int[n];
        Arrays.fill(cache, -1);
        return totalNQueensHelper(cache, 0);
    }

    public int totalNQueensHelper(int[] cache, int numFound){

        if(numFound == cache.length){
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < cache.length; i++){
            if(isValid(cache, i, numFound)){
                cache[numFound] = i;
                sum += totalNQueensHelper(cache, numFound+1);
                cache[numFound] = -1;
            }
        }
        return sum;
    }

    public boolean isValid(int[] cache, int index, int d){
     
       for(int i = 0; i <d+1; i++){
            if(cache[i]!=-1&&(cache[i] == index || Math.abs(cache[i]-index) == Math.abs(i-d) )) return false;
        }
        return true;
    }
}

