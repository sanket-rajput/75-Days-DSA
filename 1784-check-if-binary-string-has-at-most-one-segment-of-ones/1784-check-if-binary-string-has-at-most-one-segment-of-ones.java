class Solution {
    public boolean checkOnesSegment(String s) {

        char[] ch = s.toCharArray();
        
        boolean zeroFound = false;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '0'){
                zeroFound = true;
            }
            if(ch[i] == '1' && zeroFound){
                return false;
            }
        }

        return true;
    }
}