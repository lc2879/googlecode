public class isBST{
	public static class Node{
		public  Node left;
 		public  Node right;
  		public  int  value;
	}
   	public static int lastEle=Integer.MIN_VALUE;
/*recursive and non-recursive approach*/
/*in order traversal*/
public static Boolean isBSTree(Node root){
	 if(root==null) return true;
         if(!isBSTree(root.left)) return false;
	 if(root.value<lastEle){
                return false;
              }
         lastEle=root.value;
         if(!isBSTress(root.right))return false;
return true;
}

public static Boolean isBSTree1(Node root){
if(root==null) return true;
Node current = root;
Stack<Node> nodes= new Stack<Node>();
//nodes.push(current);
//current=current.left;
while(!nodes.isEmpty()||current!=null){   // take care of the root
		while(current!=null){
			nodes.push(current);
			current=current.left;
			}
        Node tmp= nodes.pop();
	if(tmp.value<lastEle) return false;
	lastEle=tmp.value;
        current=tmp.right;
}
return true;
}

public static void main(String [] args){

  Node b5= new Node();
                b5.value=0;
                b5.left=null;
                b5.right=null;
                
                Node b4= new Node();
                b4.value=1;
                b4.left=b5;
                b4.right=null;
                
                Node b3= new Node();
                b3.value=-3;
                b3.left=null;
                b3.right=null;
                
                Node b1= new Node();
                b1.value=-1;
                b1.left=b3;
                b1.right=b4;
                
                Node b2= new Node();
                b2.value=5;
                b2.left=null;
                b2.right=null;
                
                Node root= new Node();
                root.value=2;
                root.left=b1;
                root.right=b2;
                
                
                System.out.println(isBSTree1(root));
                
                
                               
}

}
