class Solution {
    public int subarraySum(int[] arr, int k) {

         int n = arr.length;
        int prefixsum[] = new int[n];
        
        prefixsum[0]=arr[0];
        
        for(int i =1; i<n;i++){
            prefixsum[i]= prefixsum[i-1]+arr[i];
            
        }
        int count =0;
        for(int i = 0; i<n;i++){
            int sum =0;
            for(int j = i; j<n;j++){
                if(i==0){
                    sum = prefixsum[j];
                }
                else{
                    sum = prefixsum[j]-prefixsum[i-1];
                }
                if(sum == k){
                count++;
            }
            }
            
        }
        return count;
        
    }
}