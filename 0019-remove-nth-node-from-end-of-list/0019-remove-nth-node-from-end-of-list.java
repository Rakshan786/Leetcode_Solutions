//nth from last=(len-n+1)th from start
//we need len-n-1+1=len-n
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        //edge cases
        if(len==n) return head.next;
        temp=head;
        for(int i=1;i<=len-n-1;i++){
            temp=temp.next;  
        }
        //deletion
        temp.next=temp.next.next; 
        return head;
    }
}