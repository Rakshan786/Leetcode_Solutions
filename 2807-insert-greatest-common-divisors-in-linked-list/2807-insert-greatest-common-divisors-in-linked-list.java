class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode n1=head;
        ListNode n2=head.next;
        while(n2!=null){
            int value=calcGCD(n1.val,n2.val);
            ListNode gcdNode=new ListNode(value);
            n1.next=gcdNode;
            gcdNode.next=n2;
            n1=n2;
            n2=n2.next;
        }
        return head;
    }
    private int calcGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}