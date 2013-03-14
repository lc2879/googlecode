
//reverse between m and n
c class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode curr = head.next, prev=head, next, start=temp;
        int count = 1;
        while(count<=n){  
            if(count>=m && count<n){
                next = curr.next;
                curr.next=prev;
                prev = curr;
                curr = next;
            }
            else if(count==n){
                start.next.next= curr;//tail of reverse point to the n+1
                start.next=prev;// m-1 point to n;
            }
            else{
                start=prev;
                prev = curr;
                curr=curr.next;
            }
            count++;
     
        }
        return temp.next;
    }
}

//normal recursive approach
//recursive
    public static ListNode reverseRecursive(ListNode node){
        if(node == null || node.next==null) return node;
        ListNode next = node.next;
        node.next=null;
        ListNode dfs = reverseRecursive(next);
        next.next=node;
        return dfs;
    }
//iterative
   public void reverse(){
        LLNode<T> current = head, prev = null, next=null;
        while(current!=null){
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
   }

//swap nodes in pairs

public class Solution {
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode prev = new ListNode(0);
        ListNode newhead = prev;
        ListNode curr = head;
        prev.next=curr;
        while(curr!=null && curr.next!=null){
            ListNode next = curr.next.next;
            prev.next = curr.next;
            curr.next.next = curr;
            curr.next = next;
            prev = curr;
            curr = next;
        }
        return newhead.next;
    }
}









