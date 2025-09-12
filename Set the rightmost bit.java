/* Q.The problem is to find the rightmost bit of a non-negative number 'N' that is currently unset (i.e., has a value of 0) in its binary representation and set it to 1.



Return the number after setting the rightmost unset bit of 'N'. If there are no unset bits in N's binary representation, then the number should remain unchanged.*/
import java.util.*;
public class Solution {
    public static int setBits(int N){
        // Write your code here.
        int num = N;
        int count = -1;
        while(num > 0){
            count++;
            if( num%2 == 0){
                N += (1 << count);
                return N;
            }
            num /= 2;
        }
        return N;
    }
}
