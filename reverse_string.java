class Solution {
    public void reverseString(char[] s) {
        // saw the hint of question and realized 2-pointers can do this.

        //  Eg: h   e   l   l   o
        //      st              en       
        //  Trace 1 
        //  o   e   l   l   h
        //      st      en
        //-------
        //  Trace 2 
        //  o   l   l   e   h
        //          st    
        //          en
        // since st <= end - we can stop iteration

        //initialize 2-pointers 
        int start = 0;  // to go from start of arr
        int end = s.length-1;   // // to come from end of arr

        // iterate until both pointers meet (start --> | <-- end )
        while(start <= end){
            char temp = s[end]; // used temp to swap
            s[end--] = s[start]; // end-decrement (come backward)
            s[start++] = temp; // start+increment (move forward)
            // once the char is assigned then it will increment (++) and be ready for next iteration
        }

        // since return type is void, printing the arr
        for(char a : s){
            System.out.println(a);
        }
    }
}
