class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int c1=0;
        int c2=0;
        for(int num:nums){
            if(num<target){
                c1++;
            }else if(num==target){
                c2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=c1;i<c1+c2;i++){
            ans.add(i);
        }
        return ans;
    }
}