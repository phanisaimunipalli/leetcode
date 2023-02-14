class Solution {
    public boolean validPalindrome(String s) {

        // Eg: a   b   c   a
        //  left = 0 | right = 3 ==> a = a => matched
        //  left = 1 | right = 2 ==> (b not equal to c)
        // then lets pass substr to check for palindrome again ==> (s, bca) || (s, abc)
        // a    b   c   a
        //      ---------  (s, left + 1, right)
        // ---------  (s, left, right - 1)

        // two pointers - left and right
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            //  if first and last don't match that means we need to break into substrings
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            //  if both chars match then we need to increment left and decrement right to go closer
            left++;
            right--;
        }
    
        return true;
    }

    public Boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
