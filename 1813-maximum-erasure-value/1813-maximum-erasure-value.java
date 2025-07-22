public class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0, max = 0;
        int left = 0;
        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            // If duplicate found, move left pointer to remove it
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            // Add current number to set and sum
            set.add(nums[right]);
            sum += nums[right];
            // Update max if needed
            max = Math.max(max, sum);
        }

        return max;
    
        
        
    }
}