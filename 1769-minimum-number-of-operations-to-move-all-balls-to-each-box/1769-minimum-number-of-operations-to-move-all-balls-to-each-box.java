class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=new int[boxes.length()];
        int cost=0;
        int balls=0;
        for(int i=0;i<boxes.length();i++){
            arr[i]+=cost;
            if(boxes.charAt(i)=='1'){
                balls++;
            }
            cost+=balls;
        }
        cost=0;
        balls=0;
        for(int i=boxes.length()-1;i>=0;i--){
            arr[i]+=cost;
            if(boxes.charAt(i)=='1'){
                balls++;
            }
            cost+=balls;
        }
        return arr;
    }
}