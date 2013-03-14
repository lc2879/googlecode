public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        while(true){
            if(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            else{
                if(stack.isEmpty()) return res;
                else{
                    curr = stack.pop();
                    res.add(curr.val);
                    curr=curr.right;
                }
            }
        }
    }
}

