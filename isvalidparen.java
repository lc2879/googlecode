//pda from automata
public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Character> stack = new Stack<Character>();
        if(s.length() %2!=0) return false;
        for(int i =0; i<s.length(); i++){
            char c =s.charAt(i) ;
            if(c== '(' || c=='[' || c=='{')
                stack.push(c);
            else if (c== ')'){
                if(stack.isEmpty() || stack.peek() != '(')
                    return false;
                else stack.pop();
            }
            else if (c== ']'){
                if(stack.isEmpty() ||stack.peek() != '[')
                    return false;
                else stack.pop();
            }
            else if (c== '}'){
                if(stack.isEmpty() ||stack.peek() != '{')
                    return false;
                else stack.pop();
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}
