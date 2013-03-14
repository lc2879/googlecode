public int  findNodes(Node root, int sum){

	if (root==null) return -1;
	Node cur= root;
	Stack<Node> left = new Stack<Node>();
	Stack<Node> right = new Stack<Node>();
	while(cur!=null){
		left.push(cur);
		cur=cur.left;
		}
	cur=root;
	 while(cur.right!=null){
                cur=cur.right;
		right.push(cur);
                }
	while(left.peek()<right.peek()){
		if(left.peek()+right.peek() == sum)	
			return 1;
		else if(left.peek()+right.peek()> sum){
			cur=right.pop();
			if(cur.left!=null){
				right.push(cur.left);
				cur=cur.left;
				while(cur.right!=null){
					right.push(cur.right);
					}
			}
			}
		else (left.peek()+right.peek()< sum){
			cur=left.pop();
                        if(cur.right!=null){
                                left.push(cur.right);
				cur=cur.right;
                                while(cur.left!=null){
                                        left.push(cur.left);
                                        }
                        }
                        }
		}
	return -1;
}

			
