class Solution {

    public String reverseWords(String s) {
        // idea - 2pointers ==> WORKS!
        // 1. initialize 2-pointers - left, right = left + 1
        // 2. increment right pointer until its equal to whitespace 
        // 3. if whitespace is found that means its a word, so stop and execute logic
        // 4. logic: swap chars from (left to right - 1)
            // a. add whitespace before continuing to next word
            // b. now change pointers to ==> left = right+1 | right = left + 1

        int left = 0; 
        int right = left + 1;
        StringBuilder res = new StringBuilder();
    
        // convert string to charArray for ease of chars swap
        char[] sChars = s.toCharArray();
        while(right <= sChars.length - 1 ){ // iterate until right reaches end of length
            if(sChars[right] != ' '){   //  no white space means, a char exists, just keep going
                right++;
            }else{
                //once you find a whitespace, you reached end of a word, so start reversing that word
                sChars = reverse(sChars, left, right-1);
                left = right+1;
                right = left+1;
            }
        }
        // after crossing while loop ==> the last word remains ==> left = 20 | right = 27
        // so call reverse one more time to reverse the last word
        sChars = reverse(sChars, left, right-1);

        res.append(sChars);
        System.out.println(res);
        return res.toString();
    }

    public char[] reverse(char[] word, int left, int right){
        while(left <= right){
            char temp = word[right];
            word[right--] = word[left];
            word[left++] = temp;
        }
        return word;
    }
}
