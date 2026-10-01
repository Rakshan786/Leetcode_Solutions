class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode a=new ListNode(-1);
        ListNode b=new ListNode(-1);
        ListNode tempA=a;
        ListNode tempB=b;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                tempA.next=temp;
                tempA=tempA.next;
            }else{       //temp.val>=x
                tempB.next=temp;
                tempB=tempB.next;
            }
            temp=temp.next;
        }
        tempB.next=null; //last node
        a=a.next;
        b=b.next;
        if(a==null) return b;
        tempA.next=b;    //listA attached to listB
        return a;
    }
}