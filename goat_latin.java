class Solution {
    public String toGoatLatin(String sentence) {
        // Cond 1: If a word starts with vowel ==> append "ma" at the end
        // Cond 2: If a word starts with consonant ==> remove first char and append "ma"
        // Cond 3: In the end, add 'a' char at the end of each word based on the i value 
            //  if current index is 3 ==> means 3rd word ==> add "aaa"
            //  if current index is 2 ==> means 2nd word ==> add "aa"


        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder(); //  for tracking the result string
        int i = 1;  // we have to track index manually for adding no of 'a' at the end
        for(String word : words){
            char ch = word.toLowerCase().charAt(0); //  convert to lower and get first char of each word
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append(word).append("ma");   // Cond 1
            }else{
                //  Cond 2
                sb.append(word.substring(1));   // removed first char from original word and appended to result: sb
                sb.append(word.charAt(0));      // append that first char at the end
                sb.append("ma");        //  now append the "ma"
            }
            sb.append("a".repeat(i++)); //  Cond 3
            sb.append(" ");            // to separate from next word
        }

        return sb.toString().trim();
    }
}
