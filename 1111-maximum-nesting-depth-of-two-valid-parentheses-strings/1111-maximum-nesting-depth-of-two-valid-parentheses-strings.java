class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int n=s.length();
        int[] res=new int[n];
        int curr=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                curr++;
                res[i]=curr%2;
            }else{
                res[i]=curr%2;
                curr--;
            }
        }
        return res;
    }
}