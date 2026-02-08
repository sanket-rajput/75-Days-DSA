class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i =0 ;
        int j;
        int minlen= Integer.MAX_VALUE;
        int sum =0;

        for(j =0;j<n;j++){
            sum+= nums[j];

            while (sum >= target){

                    minlen = Math.min(minlen, j - i + 1);
                 sum -= nums[i];
                i++;
            }


        }
                    return minlen == Integer.MAX_VALUE ? 0 : minlen;

    }
}