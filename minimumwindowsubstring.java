public class Solution {
    public String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[] Tset = new char[256];
        char[] Sset = new char[256];
        for(int i = 0; i< T.length(); i++)
            Tset[T.charAt(i)]++;
        int left = 0, count =0, min =Integer.MAX_VALUE;
        String res="";
        for(int i = 0;i < S.length(); i++){
            if(Tset[S.charAt(i)] == 0) continue;
            Sset[S.charAt(i)]++;
            if(Sset[S.charAt(i)]<=Tset[S.charAt(i)]) count++;
            if(count == T.length()){
                while(Sset[S.charAt(left)]> Tset[S.charAt(left)] ||
                Tset[S.charAt(left)] ==0){
                    if(Sset[S.charAt(left)]> Tset[S.charAt(left)])
                        Sset[S.charAt(left)]--;
                    left ++;
                }
                if(min > i -left+1){
                    min = i-left+1;
                    res = S.substring(left, i+1);
                }
            }
        }
        return res;
    }
}
