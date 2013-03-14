public class loophaed{
public static class LinkedNode{

public int data;
public LinkedNode next;

}


/*determine if the list contains a loop*/
    public static LinkedNode lpHead(LinkedNode head){

    	  LinkedNode slow=head;
    	  LinkedNode fast=head;
    	  Boolean isLp=false;
    	  while(fast!=null&&fast.next!=null){
    	    	  slow=slow.next;
    	  fast=fast.next.next;
    	  if(slow==fast)
  	    { isLp=true;break; }

    	  }

    	  if(!isLp)return head;//or return null
           slow=head;
    	  while(slow!=fast){
          slow=slow.next;
    	  fast=fast.next;
    	  }
            return fast;
    	  }
public static void main (String[] args){

       LinkedNode head = new LinkedNode();
                LinkedNode a1= new LinkedNode();
                LinkedNode a2= new LinkedNode();
                LinkedNode a3= new LinkedNode();
                LinkedNode a4= new LinkedNode();
                LinkedNode a5= new LinkedNode();
                LinkedNode a6= new LinkedNode();
                head.data = 1;
                head.next = a1;
                a1.data=2;
                a1.next=a2;
                a2.data=3;
                a2.next=a3;
                a3.data=6;
                a3.next=a4;
                a4.data=3;
                a4.next=a5;
                a5.data=2;
                a5.next=a6;
                a6.data=1;
                a6.next=a3;


 lpHead(head);

}


}
