import java.util.*;

public class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // This will store all OR results and minimum lengths for each
        Map<Integer, Integer> orMap = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            Map<Integer, Integer> newMap = new HashMap<>();

            // Add current number
            newMap.put(nums[i], 1);

            // Extend previous ORs
            for (Map.Entry<Integer, Integer> entry : orMap.entrySet()) {
                int orValue = entry.getKey() | nums[i];
                int length = entry.getValue() + 1;

                newMap.put(orValue, Math.min(newMap.getOrDefault(orValue, Integer.MAX_VALUE), length));
            }

            // Update map for next iteration
            orMap = newMap;

            // Maximum OR possible at index i
            int maxOR = 0;
            for (int key : orMap.keySet()) {
                maxOR = Math.max(maxOR, key);
            }

            // Minimum subarray length to get max OR
            answer[i] = orMap.get(maxOR);
        }

        return answer;
    }
}
