class Solution {
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        if(head==null) return head;
        ListNode dummy=head;
        int sum=0;
        while(dummy.val!=0){
            sum+=dummy.val;
            dummy=dummy.next;
        }
        head.val=sum;
        head.next=mergeNodes(dummy);
        return head;
    }
}