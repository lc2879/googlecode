const int MAX = 256;
// a fast lookup for inorder's element -> index
// binary tree's element must be in the range of [0, MAX-1]
int mapIndex[MAX];
void mapToIndices(int inorder[], int n) {
  for (int i = 0; i < n; i++) {
    assert(0 <= inorder[i] && inorder[i] <= MAX-1);
    mapIndex[inorder[i]] = i;
  }
}
 
// precondition: mapToIndices must be called before entry
Node *buildInorderPreorder(int in[], int pre[], int n, int offset) {
  assert(n >= 0);
  if (n == 0) return NULL;
  int rootVal = pre[0];
  int i = mapIndex[rootVal]-offset;  // the divider's index
  Node *root = new Node(rootVal);
  root->left = buildInorderPreorder(in, pre+1, i, offset);
  root->right = buildInorderPreorder(in+i+1, pre+i+1, n-i-1, offset+i+1);
  return root;
}
Now, if we are given inorder and postorder traversal, can we construct the binary tree?

The answer is yes, using very similar approach as above. Below is the code:

// precondition: mapToIndices must be called before entry
Node *buildInorderPostorder(int in[], int post[], int n, int offset) {
  assert(n >= 0);
  if (n == 0) return NULL;
  int rootVal = post[n-1];
  int i = mapIndex[rootVal]-offset;  // the divider's index
  Node *root = new Node(rootVal);
  root->left = buildInorderPostorder(in, post, i, offset);
  root->right = buildInorderPostorder(in+i+1, post+i, n-i-1, offset+i+1);
  return root;
}
