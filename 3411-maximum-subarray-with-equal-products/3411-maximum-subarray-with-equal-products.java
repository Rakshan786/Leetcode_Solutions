class Solution {
    public int maxLength(int[] nums) {
        int res=2;
        int prod=1;
        int n=nums.length;
        int s=0;
        int e=0;
        while(e<n){
            while(gcd(prod,nums[e])>1){
                prod/=nums[s];
                s++;
            }
            prod*=nums[e];
            res=Math.max(res,e-s+1);
            e++;
        }
        return res;
    }
    private int gcd(int n1,int n2){
        while(n2!=0){
            int t=n1;
            n1=n2;
            n2=t%n2;
        }
        return n1;
    }
}