public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        dfs(res,1,"",s);
        return res;
    }
    public void dfs(ArrayList<String> res, int count, String buff, String s){
        if(count==4 && valid(s)){
            res.add(buff+s);
        }
        else{
            for(int i =1;i<4 && i<s.length();i++){
                String digits = s.substring(0,i);
                if(valid(digits))
                    dfs(res,count+1,buff+digits+".", s.substring(i));
            }
        }
    }
    public boolean valid(String s){
        if(s.charAt(0)=='0') return s.equals("0");
        int res =0;
        for(int i =0;i<s.length();i++)
            res = res*10+ (s.charAt(i) -'0');
        return res<=255 && res>=1;
    }
}
