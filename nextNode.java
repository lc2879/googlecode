public class nextNode{


public static Node nxNode(Node node){
if(node == null) return null; 
if(node.right==null){
	if(n.parent==null)return null;
        else{
		while(node.parent!=null&&node!=node.parent.left){
			node=node.parent;
                     }
                  return node.parent;
           }
       }
else{
      while(node.left!=null){
    		node=node.left;
	}
       return node;
}

}

}









}
