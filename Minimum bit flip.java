/* Q.A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
Given two integers start and goal, return the minimum number of bit flips to convert start to goal.*/
class Solution {
    public int minBitFlips(int start, int goal) {
        String a = "";
        while( start > 0){
            a = (start%2) + a;
            start /= 2;
        }
        String b = "";
        while( goal > 0){
            b = (goal%2) + b;
            goal /= 2;
        }

        int size = Math.max(a.length() , b.length());

        while( a.length() < size){
            a = "0" + a;
        }
        while( b.length() < size){
            b = "0" + b;
        }

        int count = 0;
        for(int i = 0 ; i < size ; i++){
            if(a.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
