class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];      // // take first string as prefix ==> prefix = flower;
        // now start from second string
        for(int i = 1; i  < strs.length; i++){
            // when the second string is present in previous string == index returns 0 or else -1
            while(strs[i].indexOf(prefix) != 0){    // iterate until the prefix doesn't match with string
                // remove the last char ==> consider from 0 to length - 1 only until it matches with strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
