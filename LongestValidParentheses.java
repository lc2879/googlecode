public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = 0, max = 0;
        for(int i =0; i < s.length(); i ++){
            if(s.charAt(i) == '('){
                stack.push(len);
                len = 0;
            }
            else{
                if(stack.size()>0)
                    len += 2 + stack.pop();
                else{
                    max = Math.max(len,max);
                    len = 0;
                }
            }
        }
        while(stack.size()>0)
            max = Math.max(max, stack.pop());
        return Math.max(len,max);
    }
}

