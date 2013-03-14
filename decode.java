public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int res = 1, prev=1;
        if(s.equals("") || s.length()==0||s.charAt(0)=='0') return 0;
        if(s.equals("1")) return 1;
        for(int i =1;i<s.length();i++){
            int temp = res;
            int num = (s.charAt(i-1)-'0') *10 + (s.charAt(i)-'0');
            if(s.charAt(i)=='0') res=0;
            if(num>=10 && num<=26)
                res +=prev;//climbing stair and fib problem
            prev = temp;
            //two zeros
            if(res ==0 && prev == 0)
                return 0; 
        }
        return res;
    }
}

