class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Eg:  s = badc
        //      t = babc
        // IMP: in the case of (d, b) ==> b from t.char is already existing as value so first if fails
        // then it will return false since both ways are not isomorphic

        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            // if map does not contains (s.char, t.char) ==> then put it
            // we put it as (s.char, t.char) because s.char can contain two diff chars for isomorphic
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == t.charAt(i)){
                continue;   // both chars from both strings are matching and we can continue smoothly.
            }else{
                return false;  
            }
        }
        return true;
    }
}
