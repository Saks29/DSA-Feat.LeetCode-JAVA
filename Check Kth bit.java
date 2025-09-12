/* Q.Given two positive integer n and  k, check if the kth index bit of n is set or not.
 Note: A bit is called set if it is 1. */
class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int count = -1;
        while(n >= -1){
            count += 1;
            if(count == k){
                if( n%2 == 1){
                    return true;
                }
                else{
                    return false;
                }
            }
            n /= 2;
        }
        return false;
    }
}
