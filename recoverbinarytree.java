void recoverTree(TreeNode *h) {
    TreeNode *f1, *f2;
    bool found = false;
    TreeNode *pre, *par = 0; // previous AND parent
    while(h) { // Morris Traversal
        if(h->left == 0) {
            if(par && par->val > h->val) {  // inorder previous is: par
                if(!found) {
                    f1 = par;
                    found = true;
                }
                f2 = h;
            }
            par = h;
            h = h->right;
            continue;
        }
        pre = h->left;
        while(pre->right != 0 && pre->right != h) 
            pre = pre->right;
        if(pre->right == 0) {
            pre->right = h;
            h = h->left;
        } else {
            pre->right = 0;
            if(pre->val > h->val) { // inorder previous is: pre
                if(!found) {
                    f1 = pre;
                    found =true;
                }
                f2 = h;
            }
            par = h;
            h = h->right;
        }
    }
    if(found)
        swap(f1->val, f2->val);
}

public class Solution {
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
        inOrderTraverse(root, nodes);
        int i, j;
        for( i =0; nodes.get(i).val<nodes.get(i+1).val; i++);
        for( j =nodes.size()-1; nodes.get(j).val>nodes.get(j-1).val; j--);
        int temp = nodes.get(i).val;
        nodes.get(i).val = nodes.get(j).val;
        nodes.get(j).val = temp;
        return;
    }
    public void inOrderTraverse(TreeNode node, ArrayList<TreeNode> nodes){
        if(node == null)
            return;
        inOrderTraverse(node.left, nodes);
        nodes.add(node);
        inOrderTraverse(node.right, nodes);
    }
}
