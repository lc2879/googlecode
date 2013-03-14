public class Solution {
    public String multiply(String num1, String num2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] cache = new int[len1 + len2 -1];
        for(int i = len1-1; i >= 0; i--){
            int d1 = num1.charAt(i) - '0';
            int startIndex = len1 - i - 1;
            for(int j = len2-1; j >= 0; j--){
                int d2 = num2.charAt(j) - '0';
                cache[startIndex++] += d1*d2;
            }
        }
        for(int i = 0; i < cache.length-1; i++){
            cache[i+1] += cache[i]/10;
            cache[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        int d = cache[cache.length-1];
        if(d >= 10){
            sb.append(d/10);
            cache[cache.length-1] = d%10;
        }
        for(int i = cache.length-1; i >= 0; i--){
            sb.append((char)(cache[i] + '0'));
        }
        return sb.toString();
    }
}
