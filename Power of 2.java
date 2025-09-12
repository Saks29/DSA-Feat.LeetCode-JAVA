/* Q.Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        int low = 0 ;
        int high = n/2;
        while( low <= high){
            int mid = (low+high)/2;
            if(Math.pow(2,mid) == n){
                return true;
            }
            else if(Math.pow(2,mid) > n){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
