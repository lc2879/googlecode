c class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if(len1 + len2 != len3) return false;
        if(len1 == 0) return s2.equals(s3);
        if(len2 == 0) return s1.equals(s3);
        //0: unset, 1: true, -1: false
        int[][] cache = new int[len1][len2];
        return isInterleaveHelper(s1, s2, s3, 0, 0, 0, cache);
    }

    public boolean isInterleaveHelper(String s1, String s2, String s3, int index1, int index2, int index3, int[][] cache) {
        
        if(index3 == s3.length()) return true;
        if(index1 == s1.length()) return s2.substring(index2).equals(s3.substring(index3));
        if(index2 == s2.length()) return s1.substring(index1).equals(s3.substring(index3));
        if(cache[index1][index2] != 0) return cache[index1][index2] == 1;
        char c1 = s1.charAt(index1);
        char c2 = s2.charAt(index2);
        char c3 = s3.charAt(index3);
        boolean result = false;
        if(c1 == c3) result |= isInterleaveHelper(s1, s2, s3, index1+1, index2, index3+1, cache);
        if(c2 == c3) result |= isInterleaveHelper(s1, s2, s3, index1, index2+1, index3+1, cache);
        cache[index1][index2] = result?1:-1;
        return result;
    }



   ass Solution {
 2 private:
 3     bool f[1000][1000];
 4 public:
 5     bool isInterleave(string s1, string s2, string s3) {
 6         // Start typing your C/C++ solution below
 7         // DO NOT write int main() function 
 8         if (s1.size() + s2.size() != s3.size())
 9             return false;
10           
11         f[0][0] = true;
12         for(int i = 1; i <= s1.size(); i++)
13             f[i][0] = f[i-1][0] && (s3[i-1] == s1[i-1]);
14             
15         for(int j = 1; j <= s2.size(); j++)
16             f[0][j] = f[0][j-1] && (s3[j-1] == s2[j-1]);
17             
18         for(int i = 1; i <= s1.size(); i++)
19             for(int j = 1; j <= s2.size(); j++)
20                 f[i][j] = (f[i][j-1] && s2[j-1] == s3[i+j-1]) || (f[i-1][j] && s1[i-1] == s3[i+j-1]);
21               
22         return f[s1.size()][s2.size()];
23     }
24 };
