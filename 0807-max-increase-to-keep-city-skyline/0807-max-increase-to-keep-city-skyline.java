
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rowMax=new int[n];
        int[] colMax=new int[n];
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                rowMax[r]=Math.max(rowMax[r],grid[r][c]);
                colMax[c]=Math.max(colMax[c],grid[r][c]);
            }
        }
        int ans=0;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                ans+=Math.min(rowMax[r],colMax[c])-grid[r][c];
            }
        }
        return ans;
    }
}
