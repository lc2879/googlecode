public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 ) return true;
        int i=0, j=s.length()-1;
        while(i<=j){
            if(!Character.isLetter(s.charAt(i))&&!Character.isDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetter(s.charAt(j))&& !Character.isDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toUpperCase(s.charAt(i++))!=Character.toUpperCase(s.charAt(j--)))
                return false;
        }
        return true;
    }
}
