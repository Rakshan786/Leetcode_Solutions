class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
        int n=beans.length;
        for(int i=0;i<n;i++){
            sum=sum+beans[i];

        }
        long ans=sum;
        for(int i=0;i<n;i++){
            long remove=sum-(long)(n-i)*beans[i];
            ans=Math.min(ans,remove);
        }
        return ans;    
    }
}