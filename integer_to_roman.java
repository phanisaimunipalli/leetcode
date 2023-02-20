class Solution {
    public String intToRoman(int num) {
        // we cannot do this in Hashmap because we need index values
        // collect all romans as ==> 10 (9) | 50 (40) | 100 (90) | 500 (400)

        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numerals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder(); // to create result string
        for(int i = 0; i < 13; i++){    // we have total 13 elements in both arrays
            while(num >= numerals[i]){  // Eg: 58 ==> 58 > 1000 (i = 0) ==> false ==> continues 
            //  when 58 >= 900 | 58 >= 400 ...... | 58 >= 50 (TRUE)
                num = num - numerals[i];    //  num = 58 - 50 (currIndex becomes to 50 in numerals) = 8
                sb.append(romans[i]);   // now for the index 8 what roman do we have in romans ==> can be appended
            }

        }
        return sb.toString();

    }
}
