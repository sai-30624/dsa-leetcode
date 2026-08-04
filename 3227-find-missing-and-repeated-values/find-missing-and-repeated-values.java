class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        int[] arr = new int[total+1];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }
        int r=0;
        int m=0;
        for(int i =1;i<=total;i++){
            if(arr[i] ==2){
                r =i;
            }
            if(arr[i]==0){
                m = i;
            }

        }
        return new int[]{r, m};
    }
}