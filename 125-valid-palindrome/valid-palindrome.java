class Solution {
    public boolean isAlphanumeric(char c){
        return Character.isLetterOrDigit(c);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(isAlphanumeric(s.charAt(left)) && isAlphanumeric(s.charAt(right)) ){
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }else if(!isAlphanumeric(s.charAt(left))){
                left++;
            }else if(!isAlphanumeric(s.charAt(right))) {
                right--;
            }
        }
        return true;
    }
}