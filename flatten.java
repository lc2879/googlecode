class Solution {
public:
void flatten(TreeNode *root) {
    if (!root) return;

    TreeNode* left = root->left;
    TreeNode* right = root->right;

    if (left) {
        root->right = left;
        root->left = NULL;

        TreeNode* rightmost = left;
        while(rightmost->right) {rightmost = rightmost->right;}
        rightmost->right = right; // point the right most to the original right child
    }

class Solution {
public:
void flatten(TreeNode *root) {
    if (!root) return;

    TreeNode* left = root->left;
    TreeNode* right = root->right;

    if (left) {
        root->right = left;
        root->left = NULL;

        TreeNode* rightmost = left;
        while(rightmost->right) {rightmost = rightmost->right;}
        rightmost->right = right; // point the right most to the original right child
    }

    flatten(root->right);        
}
};    flatten(root->right);        
}
};
