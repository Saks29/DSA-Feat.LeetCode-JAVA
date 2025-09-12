// Q.Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
class Solution {
    public int[] countBits(int n) {
        List <Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i = 1 ; i <= n ; i++){
            int count = 0;
            int num = i;
            while(num > 0){
                if( num%2 == 1){
                    count++;
                } 
                num /= 2;
            }
            arr.add(count);
        } 
        int[] answer = new int[arr.size()]; 
        for(int i = 0 ; i<arr.size() ; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
