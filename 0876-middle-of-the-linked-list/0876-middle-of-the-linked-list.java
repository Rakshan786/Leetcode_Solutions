class Solution {
    public ListNode middleNode(ListNode head) {
        //two pass solution - (n+n/2)
        // ListNode temp=head;
        // int len=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     len++;
        // }
        // int mid=len/2+1;
        // temp=head;
        // for(int i=1;i<=mid-1;i++){
        //     temp=temp.next;
        // }

        //one pass solution - without finding length / slow fast
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}