
//remove duplicates from sorted array

public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0;
        int i =0,j=1;
        while(j<A.length){
            if(A[i]==A[j])
                j++;
            else{
                A[++i] =A[j++];
            }
        }
        return i+1;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
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


//remove duplicates that some of the elements could appear twice at most




public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0) return 0;
        int left=0,right=1;
        boolean allow = true;
        while(right<A.length){
            if(A[left]==A[right]){
                if(allow){
                    A[++left]=A[right++];
                    allow = false;
                }
                else
                    right++;
            }
            else{
                allow = true; 
                A[++left]=A[right++];
            }
        }
        return left+1;
    }
}
 
 
 
public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length <1)
            return 0;
        int head=0, next = 1;
        boolean visit=false;
        while(next<A.length){
            if(A[head] !=A[next]){
                head++;
                A[head] = A[next];
                visit = false;
            }
            else{
                if(!visit){
                    head++;
                    A[head] = A[next];
                    visit = true;
                }
            }
            next++;
        }
        return head +1;
    }
}///////////////////////////////////////////////////






