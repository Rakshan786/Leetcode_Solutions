class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxincreasing=1;
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                j++;
            }else{
                j=1;
            }
            maxincreasing=Math.max(maxincreasing,j);
        }
        int minincreasing=1;
        j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                j++;
            }else{
                j=1;
            }
            minincreasing=Math.max(minincreasing,j);
        }
        return Math.max(maxincreasing,minincreasing);
    }
}