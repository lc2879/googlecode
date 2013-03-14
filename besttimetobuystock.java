public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0;
        int max = 0;
        int min = prices[0];
        for(int i =1;i<prices.length; i++){
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return  max;
    }
}



public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length==0) return 0;
        int max = 0;
        for(int i =1;i<prices.length; i++){
            if(prices[i]>prices[i-1])
                max += prices[i] -prices[i-1];
        }
        return  max;
    }
}

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n = prices.length;
        if(n == 0) return 0;
        int prof1[] = new int[n];
        int prof2[] = new int[n];
        int min = prices[0];
        int max = prices[n-1];
        int res=0;
        for(int i =1; i<n;i++){
            min = Math.min(prices[i], min);
            prof1[i] = Math.max(prof1[i-1], prices[i] -min);
        }
        for(int i=n-2; i>=0; i--){
            max = Math.max(prices[i], max);
            prof2[i] = Math.max(prof2[i+1],max -prices[i]);
        }
        for(int i =0; i<n; i++){
            res = Math.max(res, prof1[i]+prof2[i]);
        }
        return res;
    }
}





