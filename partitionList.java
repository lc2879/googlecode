public class ptList{
	   public static class LinkedNode{

	    	  public int data;
	    	  public LinkedNode next;

	    	  public LinkedNode()
	    	  {}
	    	  
	    	  }

public static LinkedNode patitionList(LinkedNode head,int x){

if(head==null||head.next==null)
  return head;
LinkedNode cur=head;
LinkedNode pur=head.next;
while(pur!=null)//condition statement!
{
   if(pur.data<x)
  {
   cur.next=pur.next;
   pur.next=head;
   head=pur;
   pur=cur.next;
   continue;
 }

cur=pur;
pur=pur.next;

}
return head;

}

/*sort a linkedlist that only has three element 0 , 1 , 2*/

	  public static LinkedNode sortList(LinkedNode head){

    		  if(head==null||head.next==null)
    		    return head;
    		  LinkedNode cur=head;
    		  LinkedNode pur=head.next;
    		  int len=1;
    		  while(cur.next!=null)
    		  { cur=cur.next;len++;}
    		  LinkedNode endcur=cur;
    		  cur=head;
    		  while(pur!=null&&len>0)//condition statement!
    		  {
    		      len--;
    		     if(pur.data==0)
    		    {
    		     cur.next=pur.next;
    		     pur.next=head;
    		     head=pur;
    		     pur=cur.next;
    		     continue;
    		   }
    		       if(pur.data==2)
    		    {
    		     if(pur.next==null)
    		     {
    		    	 return head;
    		     }
    		     cur.next=pur.next;
    		     endcur.next=pur;
    		     pur.next=null;
    		     endcur=pur;
    		     pur=cur.next;
    		     continue;
    		   }
    		  cur=pur;
    		  pur=pur.next;

    		  }
    		  return head;
    		  }

public static void main (String[] args){

/*test cases*/



}


}
