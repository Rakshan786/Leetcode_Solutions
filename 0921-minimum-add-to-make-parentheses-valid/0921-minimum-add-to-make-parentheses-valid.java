class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
        int n=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                i++;
            }
            else{
                if(i>0){
                    i--;
                }
                else{
                    n++;
                }
            }
        }
        return i+n;
    }
}