class Solution {
    public int lengthOfLongestSubstring(String s) {
        // maximum/shortes/longest - Sliding window 
        // initialize 2-pointers ([s.........e])
        int left = 0;
        int right = 0;
        int max = 0;

        // to track unique chars and its length with --> set.size()
        HashSet<Character> set = new HashSet<>();

        // right ptr ==> to close the window (move until it reaches the end)
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){ // if the set does not contain the char, it means unique
                set.add(s.charAt(right));   // so lets insert it to track
                max = Math.max(max, set.size());    //  update max value when compared with set.size()
                // HashSet ==> [a, b, c]
                right++;
            }else{
                //if set already contains the char, its a duplicate so lets remove that using left 
                // Eg:  [a, b, c] => present
                // Eg: [a, b, c] => "a" -> incoming | so since its present already, we remove "a"
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max; 
    }
}
