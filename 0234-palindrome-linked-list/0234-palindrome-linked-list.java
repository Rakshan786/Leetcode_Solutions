class Solution {
    public ListNode reverseList(ListNode head){
    ListNode prev=null;
    ListNode curr=head; 
    while(curr!=null){
        ListNode next=curr.next;    
        curr.next=prev;              
        prev=curr;                
        curr=next;                   
    }
    return prev;
}
    public boolean isPalindrome(ListNode head) {
        // if(head.next==null) return true;
        // ListNode newHead=new ListNode(head.val);
        // ListNode t1=head.next;
        // ListNode t2=newHead;
        // while(t1!=null){
        //     ListNode temp=new ListNode(t1.val);
        //     t2.next=temp;
        //     t2=t2.next;
        //     t1=t1.next;
        // }
        // newHead=reverseList(newHead);
        // t1=head;
        // t2=newHead;
        // while(t1!=null){
        //     if(t1.val!=t2.val) return false;
        //     t2=t2.next;
        //     t1=t1.next;
        // }
        // return true;

        //method-2
        //slow fast
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // if(fast!=null){
        //     slow=slow.next;
        // }
        // ListNode j=reverseList(slow);
        // ListNode i=head;
        // while(j!=null){
        //     if(i.val!=j.val) return false;
        //     i=i.next;
        //     j=j.next;
        // }
        // return true;

        //method-3
        Stack<ListNode> reverse=new Stack<>();
        ListNode dummy=head;
        while(dummy!=null){
            reverse.push(dummy);
            dummy=dummy.next;
        }
        while(head!=null && !reverse.isEmpty()){
            if(reverse.pop().val!=head.val) return false;
            else head=head.next;
        }
        return true;
    }
}