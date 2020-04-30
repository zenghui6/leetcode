package LeetCode.p1从排序数组中删除重复项;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        else{
            int i = 0,j;
            for(j=1;j<nums.length;j++){
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }}