public class levelPrt{

/*BFS recursive and non-recursive*/

public static ArrayList<LinkedList<Node>> print(Node root){

if(root==null) return null;

ArrayList<LinkedList<Node>> result = new  ArrayList<LinkedList<Node>>();
LinkedList<Node> current = new LinkedList<Node>();
current.add(root);
while(1){
   result.add(current);
   LinkedList<Node> copy=current;
   current=new  LinkedList<Node>();
   for(Node ele:copy){
	if(ele.left!=null)
		current.add(ele.left);
        if(ele.right!=null)
                current.add(ele.right);
    }
   if(current.size()==0)
       break;
}
return result;
}
public static void print(Node root){

if(root==null) return;

LinkedList<Node> current = new LinkedList<Node>();
current.add(root);
whilet(true){
   LinkedList<Node> copy=current;
   current=new  LinkedList<Node>();
   for(Node ele:copy){
        System.out.print(ele.value);
        if(ele.left!=null)
                current.add(ele.left);
        if(ele.right!=null)
                current.add(ele.right);
   }
  if(current.size()==0)
       break;
   System.out.print('\n');
}
return;
}
public static ArrayList<LinkedList<Node>> result = new  ArrayList<LinkedList<Node>>();
public static void print(Node root,int level){

if(root==null) return;

if(result.size==level){
       LinkedList<Node> current = new LinkedList<Node>();
       current.add(root);
       result.add(current);
 }else{
      result.get(level).add(root);}
print(root.left,level+1);
print(root.right,level+1);
return;
}




}
