class Solution {
    public ListNode reverseList(ListNode head) {
    // //iterative (better) TC->O(n) SC->O(1)
    // ListNode prev=null;
    // ListNode curr=head;
    // ListNode temp=head; //head or null
    // while(curr!=null){
    //     temp=curr.next;    
    //     curr.next=prev;              
    //     prev=curr;                
    //     curr=temp;                   
    // }
    // return prev;

    //recursive (extra space for call stack)
    if(head==null || head.next==null) return head;
    ListNode a=head.next;
    ListNode newHead=reverseList(a);
    a.next=head;
    head.next=null;
    return newHead;
    }
}