class Solution{
    public int minDeletions(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                count++;
            }
        }
        return coun;
    }
}