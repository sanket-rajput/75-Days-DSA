class Solution {
    // Helper method to reverse a portion of the array
    private void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotates the array to the right by k elements using the reversal algorithm
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle if k > n

        // Step 1: Reverse first n-k elements
        reverse(arr, 0, n - k - 1);

        // Step 2: Reverse last k elements
        reverse(arr, n - k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }
}
