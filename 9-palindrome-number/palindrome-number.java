class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0){
            return false;
        }
        String s = x + "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length() - (i + 1))){
                return false;
            }
        }
        return true;
    }
}