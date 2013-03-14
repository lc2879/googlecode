

public class Solution {
    
    public class  wrapper{
        int max;
}

/*how to reconstruct the solution?*/
public   void  maxSumPath( TreeNode root,int sum,wrapper max ){


    if(root.left==null && root.right==null){ 
        if(sum+root.val>max.max)
        max.max= sum+root.val;
        return;
        
    }
    if(root.left!=null) maxSumPath(root.left,root.val+sum,max);
   if(root.right!=null)   maxSumPath(root.right,root.val+sum,max);
   return;
}

    
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) return 0;
        wrapper max= new wrapper();
            max.max=Integer.MIN_VALUE;
        maxSumPath(root,0,max);
        return max.max;
    }
}



public class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        max = (root==null)? 0: root.val;
        findMax(root);
        return max;
    }
    public int findMax(TreeNode node){
        if(node == null) return 0;
        int left = Math.max(findMax(node.left),0);
        int right = Math.max(findMax(node.right),0);
        max = Math.max(node.val + left + right, max);
        return node.val + Math.max(left,right);
    }
}
