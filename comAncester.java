public class comAncester{


/*with and without parent infomation*/




/*is BST or is not BST*/

public static Node commonAncester(Node root,Node v1,Node v2){

	   if(root==null||root.value==v1.value||root.value==v2.value) return null;
	   if(root.left!=null&&(root.left.value==v1.value||root.left.value==v2.value)
	        || root.right!=null&&(root.right.value==v1.value||root.right.value==v2.value)
	        ||root.value>v1.value&&root.value<v2.value)
	          return root;
	   if(root.value>v1.value&&root.value>v2.value)
	        return commonAncester(root.left,v1,v2);
	    if(root.value<v1.value&&root.value<v2.value)
	        return commonAncester(root.right,v1,v2);
	   return null;
	}
/*non-BST*/
public static Node commonAncester1(Node root,Node v1,Node v2){
    if(root==null) return null;
    Node left = commonAncester(root.left,v1,v2);
    if(left!=null&&left!=v1&&left!=v2) return left;
    Node right = commonAncester(root.right,v1,v2);
     if(right!=null&&right!=v1&&right!=v2) return right;

    if(left!=null &&right!=null) return root;
    else if(root ==v1||root==v2) return root;
      else return left==null ? right:left;
}


Node *LCA(Node *root, Node *p, Node *q) {
  if (!root) return NULL;
  if (root == p || root == q) return root;
  Node *L = LCA(root->left, p, q);
  Node *R = LCA(root->right, p, q);
  if (L && R) return root;  // if p and q are on both sides
  return L ? L : R;  // either one of p,q is on one side OR p,q is not in L&R subtrees
}

