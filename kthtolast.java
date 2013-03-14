public class kth{

   public static class LinkedNode{

	    	  public int data;
	    	  public LinkedNode next;

	    	  public LinkedNode()
	    	  {}
	    	  
	    	  }
/*wrapper class*/
    public static class wrapper{
            public int value=0;
      }
/*recursive method*/
public static LinkedNode thekth(LinkedNode head,int k,wrapper i){

	if(!k>0)
           return null;
         
 if(head==null) return null;
 LinkedNode t=thekth(head.next,k,i);
    i.value=i.value+1;
    if(i.value==k)
      return head;
return  t;

}

/*non-recursive method, two pointers*/

/*non-recursive method*/
public static LinkedNode thekth1(LinkedNode head,int k){
     if(!k>0)
           return null;

LinkedNode cur=head;
LinkedNode pur=head;
for (int i=0;i<k-1;k++){
if(pur==null) return null;
pur=pur.next;
}
if(pur==null) return null;
while(pur.next!=null){
cur=cur.next;
pur=pur.next;
}
return cur;
}

public static void main(String[] args){




}



}
