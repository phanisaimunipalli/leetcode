class Solution {
    public int longestPalindrome(String s) {
        // since its palindrome, there can be repeative chars so consider HashSet
        HashSet<Character> set = new HashSet<>();
        int count = 0;  // to track the repeated chars
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                // if set already contains the curr char, remove it and increment repeatCounter
                s.remove(s.charAt(i));
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }

        // Eg: abccccdd ==> 1 a | 2 c | 2 d | 1 b ==> dccaccd or dccbccd
        // by the end of for loop, we are done with repeated chars
        // now check for set size and if it's greater than zero, return ((count x 2) + 1)
        if(set.size() != 0){
            return (count * 2) + 1;
        }

        // if the set is empty that means no odd length palindrome so just return the square of counter
        return (count * 2);
    }
}
