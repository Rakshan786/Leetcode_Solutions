class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<k;i++){ //k-1
            fast=fast.next;
        }
        ListNode a=fast; //kth node from start
        fast=fast.next;  //fast moved k steps ahead
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode b=slow;
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
        return head;
    }
}