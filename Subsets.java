/* Q.Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
*/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int len = nums.length;
        int total = 1 << len;
        for(int i = 0 ; i < total ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < len ; j++){
                if( (i & (1 << j)) != 0){
                    temp.add(nums[j]);
                }
            }
            answer.add(temp);
        }
        return answer;
    }
}
