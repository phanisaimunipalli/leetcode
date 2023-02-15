class Solution {

    public boolean isHappy(int n) {
        // Happy Number needs a set to avoid Cyclic Sums and keep track of seen numbers
        Set<Integer> set = new HashSet<>();
        // base case ==> n != 1 and n should be first time occurring
        while(n != 1 && !set.contains(n)){
            // then save it into set
            set.add(n);
            n = nextNum(n); // then pass 'n' to get the Sum (it keeps repeating until n becomes 1)
        }
        return (n == 1);    //  if n becomes 1 then we can return true (as asked in question)
    }

    public int nextNum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;   // n = 19 | 19 % 10 ==> 9
            sum += rem*rem;
            n = n / 10;   // n = 19 | 19 / 10 ==> 1
        }
        return sum;
    }
}
