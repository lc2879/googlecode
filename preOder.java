public static void preOder(Node root){
	
 	if(root==null) return;
	Node tmp = root;
    	Stack<Node> nodes = new Stack<Node> ();
	nodes.push(tmp);
	while(!nodes.isEmpty()) { 
		System.out.print(nodes.peek().value+" ");
		tmp = nodes.pop();
		if(tmp.right!=null) nodes.push(tmp.right);
		if(tmp.left!=null) nodes.push(tmp.left);
	  }
     return;
}
 	
