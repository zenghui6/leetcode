package LeetCode.P1TwoSum;
import java.util.HashMap;
//使用hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new  int[2];
        if(nums==null||nums.length<=1) return res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            int val = target-num;
            if (map.containsKey(val)){
                res[0]=i;
                res[1]=map.get(val);
                return res;
            }
            else map.put(num,i);
        }
        return res;
    }
}