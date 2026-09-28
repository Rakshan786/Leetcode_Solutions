class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}