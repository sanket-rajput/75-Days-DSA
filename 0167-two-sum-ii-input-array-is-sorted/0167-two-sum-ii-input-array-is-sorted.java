class Solution {
    public int[] twoSum(int[] arr, int target) {

        int n = arr.length;
        int j = n-1;
        int i = 0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[] {i+1,j+1};
            }
            if(sum > target){
                j--;

            }
            if(sum < target){
                i++;

            }
        }
        return new int[] {-1,-1};
    }  
        
    
}