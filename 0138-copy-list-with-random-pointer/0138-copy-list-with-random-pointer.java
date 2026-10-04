class Solution {
    public Node deepCopy(Node head){
        Node head2=new Node(head.val);
        Node t1=head.next;
        Node t2=head2;
        while(t1!=null){
            Node temp=new Node(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
        }
        return head2;
    }
    public void connectAlternate(Node head,Node head2){
        Node t1=head;
        Node t2=head2;
        Node dummy=new Node(-1);
        Node t=dummy;
        while(t1!=null && t2!=null){
            t.next=t1;
            t1=t1.next;
            t=t.next;
            t.next=t2;
            t2=t2.next;
            t=t.next;
        }
    }
    public void assignRandom(Node head,Node head2){
        Node t1=head;
        Node t2=head2;
        while(t1!=null){
            t2=t1.next;
            if(t1.random!=null) t2.random=t1.random.next;
            t1=t1.next.next;
        }
    }
    public void split(Node head,Node head2){
        Node t1=head;
        Node t2=head2;
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t1==null) break;
            t2.next=t1.next;
            t2=t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        //method1-tc[O(n)],sc-[O(n)] no extra space
        if(head==null) return head;
        //s1-create a deep copy
        Node head2=deepCopy(head);
        //s2-join both lists alternatively
        connectAlternate(head,head2);
        //s3-assign random pointers
        assignRandom(head,head2);
        //s4-split the linkedlist again 
        split(head,head2);
        return head2;

        //method2-hashmap(tc,sc->same)
        // Map<Node,Node> map=new HashMap<>();
        // Node curr=head;
        // while(curr!=null){
        //     map.put(curr,new Node(curr.val));
        //     curr=curr.next;
        // }
        // curr=head;
        // while(curr!=null){
        //     Node copy=map.get(curr);
        //     copy.next=map.get(curr.next);
        //     copy.random=map.get(curr.random);
        //     curr=curr.next;
        // }
        // return map.get(head);
    }
}