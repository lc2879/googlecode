bool hasPathSum(struct node* node, int sum)
{
  /* return true if we run out of tree and sum==0 */
  if (node == NULL)
  {
     return (sum == 0);
  }
  
  else
  {
    bool ans = 0;  
  
    /* otherwise check both subtrees */
    int subSum = sum - node->data;
  
    /* If we reach a leaf node and sum becomes 0 then return true*/
    if ( subSum == 0 && node->left == NULL && node->right == NULL )
      return 1;
  
    if(node->left)
      ans = ans || hasPathSum(node->left, subSum);
    if(node->right)
      ans = ans || hasPathSum(node->right, subSum);
  
    return ans;
  }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if(root == null) return resultList;
        pathSumHelper(root, sum, resultList, tempList);
        return resultList;
    }

    public void pathSumHelper(TreeNode root, int target, ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> tempList){

        if(root.left == null && root.right == null){
            if(root.val == target){
                tempList.add(root.val);
                resultList.add(new ArrayList<Integer>(tempList));
                tempList.remove(tempList.size()-1);
            }
            return;
        }
        if(root.left != null){
            tempList.add(root.val);
            pathSumHelper(root.left, target - root.val, resultList, tempList);
            tempList.remove(tempList.size()-1);
        }
        if(root.right != null){
            tempList.add(root.val);
            pathSumHelper(root.right, target - root.val, resultList, tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}
