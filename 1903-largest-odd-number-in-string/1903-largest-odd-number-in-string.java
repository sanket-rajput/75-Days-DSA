class Solution {
    public String largestOddNumber(String num) {

        int len = num.length();
        int end = 0;
        for(int i = len-1; i>=0; i--){
            if(num.charAt(i)%2 == 1){
                end = i+1;
                break;
            }
        }
        return num.substring(0,end);
        
    }
}