package LeetCode.p5只出现一次的数据;


import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i=i+2) {
            // 1,1,2,2,4
            if (i+1 >= nums.length)
                return nums[i];
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}