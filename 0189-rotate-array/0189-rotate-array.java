class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n

        // Create a new array to store the result
        int[] rotated = new int[n];

        // Place each element at its new position
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}
