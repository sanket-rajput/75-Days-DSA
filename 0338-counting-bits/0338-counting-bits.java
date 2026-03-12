class Solution {
    public int calbits(int n){
        int count=0;
        int mask =1;
        
        while(mask<=n){
            if((n&mask)!=0){
                count++;
            }
            mask<<=1;
        }
        return count;
        
        }


    public int[] countBits(int n) {

        int[] ans = new int[n+1];


        for(int i =0;i<ans.length;i++){
            ans[i] = calbits(i);
        }

        return ans;
        
    }
    
}