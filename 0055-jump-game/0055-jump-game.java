class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int m1=0;
        for(int i=0;i<n;i++){
            if(i>m1){
                return false;
            }
            m1=Math.max(m1,nums[i]+i);
        }
        return true;
    }
}