public static int sum = 0;
public static int sumNumbers(Node root) {
    // Start typing your Java solution below
    // DO NOT write main() function
    if(root==null) return 0;
    String str="";
    calculate( root, str);
    return sum;
}
public static void calculate(Node root, String str){
if(root.left==null && root.right==null) 
    sum+= Integer.parseInt( str+ Integer.toString(root.value) );
 if(root.left!=null)
   calculate ( root.left, str+Integer.toString(root.value));
  if(root.right!=null)
   calculate ( root.right, str+Integer.toString(root.value));
  return;
}

	Node root = new Node();
	root.value=1;
	root.left= new Node ();
	root.left.value=2;
	root.right= new Node ();
	root.right.value=6;
	root.right.left= new Node();
	root.right.left.value = 9;
	root.right.right= new Node();
	root.right.right.value = 9;
	int xx=sumNumbers(root);
	System.out.println(xx);




public class Solution {
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return dfs(root,0);
    }
    public int dfs(TreeNode node, int sum){
        if(node == null) return 0;
        int res =node.val+sum*10;
        if(node.left==null && node.right==null) return res;
        return dfs(node.left,res) + dfs(node.right, res);
    }
}

