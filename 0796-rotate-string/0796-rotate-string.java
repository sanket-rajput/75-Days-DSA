class Solution {
    public boolean rotateString(String s, String goal) {

        int lens = s.length();
        int leng = goal.length();

        if(lens != leng){
            return false;
        }

        String temp = s+s;

        if(temp.contains(goal)){
            
            return true;
        }

        return false; 
        
    }
}