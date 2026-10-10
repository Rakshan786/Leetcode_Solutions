class Solution{
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
          st.push(i);   
        }
        for(int i=n-1;i>=0;i--){
            res[i]=-1;
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
              st.pop();  
            } 
            if(!st.isEmpty()) res[i]=nums[st.peek()];
            st.push(i);
        }
        return res;
    }
}