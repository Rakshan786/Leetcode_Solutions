class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            List<Integer> t=new ArrayList<>();
            for(int j=0;i+j<n;j++){
                t.add(grid[i+j][j]);
            }
            t.sort(Collections.reverseOrder());
            for(int j=0;i+j<n;j++){
                grid[i+j][j]=t.get(j);
            }
        }
        for(int j=1;j<n;j++){
            List<Integer> t=new ArrayList<>();
            for(int i=0;i+j<n;i++){
                t.add(grid[i][i+j]);
            }
            Collections.sort(t);
            for(int i=0;i+j<n;i++){
                grid[i][i+j]=t.get(i);
            }
        }
        return grid;
    }
}