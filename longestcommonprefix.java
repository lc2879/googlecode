public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length==0) return"";
        String shortest = strs[0];
        for(String str: strs){
            if(str.isEmpty()) return "";
            if(str.length()<shortest.length())
                shortest = str;
        }
        int length = shortest.length();
        while(true){
            boolean good = true;
            for(String str:strs){
                if(!str.substring(0,length).equals(shortest.substring(0,length))){
                    length--;
                    good =false;
                    break;
                }
            }
            if(good) return shortest.substring(0,length);
            if(length==0) return "";
        }
    }
}
