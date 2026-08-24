class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int m = 2 * n;

        int[] arr = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }

        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }
}