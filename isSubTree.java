public static Boolean isSubTree(Node root1,Node root2){

	if(root2==null) return true;
	 if(root1==null) return false;
	 if( root1.value==root2.value) return isIdentical(root1,root2);
		else return (isSubTree(root1.left,root2)|| isSubTree(root1.right,root2));
	}
public static Boolean isIdentical(Node root1,Node root2){

	if( root1==null&& root2==null) return true;
	if( root1==null || root2==null ) return false;
	 if (root1.value !=root2.value) return false;
        return isIdentical(root1.left,root2.left) && isIdentical ( root1.right, root2.right);
}


