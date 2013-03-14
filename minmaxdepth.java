public static int depth(Node root,int d){
	if(root == null) return d-1;
	else return Math.MAX(depth(root.left, d+1),depth(root.right,d+1);
}



public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int leftMin = Integer.MAX_VALUE;
        int rightMin = Integer.MAX_VALUE;
        if(root.left != null) leftMin = minDepth(root.left);
        if(root.right != null) rightMin = minDepth(root.right);
        return 1 + Math.min(leftMin, rightMin);
    }
}
