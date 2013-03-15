public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s1.length()!=s2.length()) return false;
        if(s1.equals(s2)) return true;
        for(int i =1;i<s1.length();i++){
            String s1l = s1.substring(0,i);
            String s1r = s1.substring(i);
            String s2l = s2.substring(0,i);
            String s2r = s2.substring(i);
            if(isScramble(s1l,s2l) && isScramble(s1r,s2r)) return true;
            s1l = s1.substring(s1.length()-i);
            s1r = s1.substring(0,s1.length()-i);
            if(isScramble(s1l,s2l) && isScramble(s1r,s2r)) return true;
        }
        return false;
    }
}
