class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 && t.length() == 0) return true; // if both empty then s is present in t ==> true
        int sLeft = 0, tRight = 0;    // two pointers 
        int leftBound = s.length();
        int rightBound = t.length();
        // iterate until both ptrs reach left and right bounds
        while(sLeft < leftBound && tRight < rightBound){
            if(s.charAt(sLeft) == t.charAt(tRight)){
                sLeft++;    // if char from both s and t matches then definitely increment s ptr
            }
            tRight++;   // regardless of matching, we have to increment t ptr
        }

        // by the end of loop ==> if s ptr reaches the length of s then that means all chars are found in t
        return (sLeft == leftBound);

    }
}
