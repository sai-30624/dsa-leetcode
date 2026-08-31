class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        // Loop 1: store last k elements
        for(int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Loop 2: shift remaining elements
        for(int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Put temp elements at beginning
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}