// class MinStack {
// //Using 2 stacks
// //tc->O(1) sc->O(n)
// Stack<Integer> s;
// Stack<Integer> min;
//     public MinStack() {
//         s=new Stack();
//         min=new Stack();
//     }
    
//     public void push(int value) {
//         s.push(value);
//         if(min.isEmpty() || min.peek()>=s.peek())
//         min.push(value);
//     }
    
//     public void pop() {
//         if(!s.isEmpty()){
//             int val=s.pop();
//             if(min.peek()==val)
//             min.pop();
//         }
//     }
    
//     public int top() {
//         if(s.isEmpty()){
//             return -1;
//         }
//         return s.peek();
//     }
    
//     public int getMin() {
//         if(min.isEmpty()) return -1;
//         return min.peek();
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 class MinStack {
//Using single stack
//tc->O(1) sc->O(n)
Stack<Integer> st;
int min;
    public MinStack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        if(value<=min){
            st.push(min);
            min=value;
        }
        st.push(value);
    }
    
    public void pop() {
        if(st.pop()==min)
        min=st.pop();

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}