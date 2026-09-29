//nth from last=(len-n+1)th from start
//we need len-n-1+1=len-n
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // int len=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     len++;
        // }
        // //edge cases
        // if(len==n) return head.next;
        // temp=head;
        // for(int i=1;i<=len-n-1;i++){
        //     temp=temp.next;  
        // }
        // //deletion
        // temp.next=temp.next.next; 
        // return head;

        //slow-fast approach
        ListNode slow=head;
        ListNode fast=head;
        //move fast n steps ahead
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){ //n==len hence delete head
            return head.next;
        }
        //move slow and fast together until fast reaches tail
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}