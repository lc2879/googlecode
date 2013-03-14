public class isBalanced{
 public static int  isBalanced(Node root){
         if (root==null) return 0;
         int lHight,rHight;
         if((lHight=isBalanced(root.left))==-1||(rHight=isBalanced(root.right))==-1||Math.abs(lHight-rHight)>1)
                return -1;
         return Math.max(lHight,rHight)+1;
}
}


//map reduce problems should be given more attention
