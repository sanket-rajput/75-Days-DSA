class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int prefixsum[]= new int[n];

        prefixsum[0]= nums[0];
        
        for(int i = 1; i<n;i++){
            prefixsum[i]= prefixsum[i-1]+nums[i];
        }

        //pivot check
        for(int i = 0; i<n ; i++){
            int leftsum = (i==0)? 0: prefixsum[i-1];
            int rightsum = prefixsum[n-1]- prefixsum[i];

            if(leftsum == rightsum){
                return i;
            }

        }
        return -1;
        
    }
}