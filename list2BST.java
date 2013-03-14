

/*recursive and non-recursive*/
/*list already in ascending order*/
/*uses wrapper class to pass parameters*/
public static class wp{
	LinkedNode head;
}

public static Node list2BST(wp head,int len){
if(!(len>0)) return null;
Node left=new Node();
left=(list2BST(head,len/2));
Node root=new Node();
root.left=left;
root.value=head.head.data;
head.head=head.head.next;
root.right=(list2BST(head,len-(len/2)-1));
return root;
}
/*c++ implementation*/
BinaryTree* sortedListToBST(ListNode *& list, int start, int end) {
  if (start > end) return NULL;
  // same as (start+end)/2, avoids overflow
  int mid = start + (end - start) / 2;
  BinaryTree *leftChild = sortedListToBST(list, start, mid-1);
  BinaryTree *parent = new BinaryTree(list->data);
  parent->left = leftChild;
  list = list->next;
  parent->right = sortedListToBST(list, mid+1, end);
  return parent;
}
 
BinaryTree* sortedListToBST(ListNode *head, int n) {
  return sortedListToBST(head, 0, n-1);
}
/*array to bst c++ implementation*/
BinaryTree* sortedArrayToBST(int arr[], int start, int end) {
  if (start > end) return NULL;
  // same as (start+end)/2, avoids overflow.
  int mid = start + (end - start) / 2;
  BinaryTree *node = new BinaryTree(arr[mid]);
  node->left = sortedArrayToBST(arr, start, mid-1);
  node->right = sortedArrayToBST(arr, mid+1, end);
  return node;
}
 
BinaryTree* sortedArrayToBST(int arr[], int n) {
  return sortedArrayToBST(arr, 0, n-1);
}

