public class bfsG{


  public class gNode{
	int value;
	int state;
	ArrayList<gNode> children;
  }
  public class Graph{
	ArrayList<gNode> nodes;
   }
 public enum state{ visited,unvisited,visiting}
/*Bfs non-recursive,whether there is a route from start to end*/
public Boolean isConnected(Graph g,gNode start, gNode end){

  LinkedList<gNode> q= new LinkedList<gNode>();

  for(gNode node:g.nodes){
        node.state= state.unvisited;
       }
        start.state=visiting;
        q.add(start);
        gNode u= new gNode();
	while(!q.isEmpty){
		u=q.removeFirst();
	       if(u!=null){
		for(gNode v:u.children){
		  if(v.state==state.unvisited){
			if(v==end)return true;
			else{
				v.state=visiting;
				q.add(v);
			}
		}
	   }
	
	u.state=visited;
    }
  }
return false;
}



}
