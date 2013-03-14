public class rmDups{

   public static class LinkedNode{

	    	  public int data;
	    	  public LinkedNode next;

	    	  public LinkedNode()
	    	  {}
	    	  
	    	  }
public static void rmDuplicate(LinkedNode head){
if(head==null)return;
HashSet<Integer> ele = new HashSet<Integer>();
LinkedNode cur=head;
ele.add(cur.data);
while(cur.next!=null){

if(ele.contains(cur.next.data)){
cur.next=cur.next.next;
continue;
}
else{
   ele.add(cur.next.data);
   cur=cur.next;
}
}

}

public static void main (String [] args){


}
















}



public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode newhead = new ListNode(0);
        ListNode curr=head;
        ListNode prev = newhead;
        newhead.next = curr;
        if(curr==null) return null;
        while(curr!=null && curr.next!=null){
            ListNode next = curr.next;
            if(next.val == curr.val){
                while(next!=null && next.val == curr.val){
                    next = next.next;
                }
                prev.next = next;
            }
            else{
                prev = curr;
            }
            curr = next;
             
        }
        return newhead.next;
    }
}



public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode curr=head;
        if(curr==null) return null;
        while(curr!=null && curr.next!=null){
            ListNode next = curr.next;
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
                continue;
            }
            curr = next;
        }
        return head;
    }
}

