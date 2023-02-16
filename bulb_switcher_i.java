class Solution {
    public int bulbSwitch(int n) {
        if(n == 0) return 0;
        // Maths:  we just need to find the square of the given n and return it -- that would be equal to no of bulbs those are ON.

    // if the number of factors k= odd then the bulb remains on else off
// if number is perfect square then it has odd number of factors and hence remains on at the end

    // Eg: 4 => sqrt(4) ==> 2
    // imagine 4 bulbs
    // 0  0   0   0 
    // 1    0   1   0
    
        return (int)Math.sqrt(n);
    }
}
