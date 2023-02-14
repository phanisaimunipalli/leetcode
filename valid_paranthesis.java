class Solution {
    public boolean isValid(String s) {
        //if the length is not even that means, it's always false as we cannot find for "()(" = 3 || "{()}[" = 5 -- X
        if (s.length() % 2 != 0) return false;

        // initialize a stack for last in first out
        Stack<Character> stack = new Stack<>();

        // iterate from first to last chars of given string
        for (int i = 0; i < s.length(); i++) {
            //  if stack is empty AND the char is a closing paranethesis like ==> ) | } | ] ==> can't do
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            }else {
                //  else if stack is not empty (some chars present)
                if (!stack.isEmpty()) {
                    // if the top element in stack is "(" and the current s.charAt(i) is ")" ==> that's a match, so pop it!
                    if (stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
                    //  similarly it applied for others ==> if peek elem is opening and current charAt(i) is close - pop it!
                    else if (stack.peek() == '{' && s.charAt(i) == '}') stack.pop(); 
                    else if (stack.peek() == '[' && s.charAt(i) == ']') stack.pop(); 

                    // at the end if it doesn't fall above that means its a new elem and lets ADD into stack
                    // add vs push ==> add returns true value always (where as push also internally calls add())
                    else stack.add(s.charAt(i));
                } else stack.add(s.charAt(i));
            }
        }
        // by the end, if stack becomes empty then all paranthesis are matched correctly 
        return stack.isEmpty(); //  returns true if its empty | false -- if elems are still present
    }
}
