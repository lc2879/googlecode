/*recursive inplace and not inplace*/
public static void mirrorTree( Node root){
    if(root==null) return;
    Node tmp = root.left;
    root.left=root.right;
    root.right=tmp;
    mirrorTree(root.left);
    mirrorTree(root.right);
return;
}


public static Node mirrorTree (Node root){

    if(root==null)return null;

    else{

	Node tmp = new Node();
	tmp.value = root.value;
	tmp.left = mirrorTree(root.right);
	tmp.right=mirrorTree(root.left);

	return tmp;
    }
}
void MirrorWithoutRecursion(Node tree)
{
 if (!tree)
		return;
Stack s;
s.push(tree);
while(!s.empty())
{
Node  current = s.pop();
// Swap the children
//
Node  temp = current->right;
current->right = current->left;
current->left = temp;

// Push the children on the stack
//
if (current->right)
s.push(current->right);

if (current->left)
s.push(current->left);
}
}
